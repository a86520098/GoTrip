package com.ispan.group3.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class InitializeData {

	private static final String DB_NAME = "GoTrip";
	private static final String TB_NAME_COM = "comment";
	private static final String TB_NAME_IMG = "comment_image";
	
	private static final String IMAGE_DIR = "comment";

	private static final String CREATE_TB_COM = "CREATE TABLE " + TB_NAME_COM + " (" 
													+ " id int PRIMARY KEY IDENTITY(1,1) NOT NULL,"
													+ "	item_tb varchar(25) NOT NULL," 
													+ "	item_id int NOT NULL," 
													+ "	user_id varchar(20) NOT NULL,"
													+ "	date datetime NOT NULL," 
													+ "	rating int NOT NULL," 
													+ "	content nvarchar(200),"
													+ "	status nvarchar(20),"
												+ ");";

	private static final String CREATE_TB_IMG = "CREATE TABLE " + TB_NAME_IMG + " (" 
													+ " id int PRIMARY KEY IDENTITY(1,1) NOT NULL,"
													+ "	image_path nvarchar(max) NOT NULL," 
													+ "	comment_id int FOREIGN KEY REFERENCES " + TB_NAME_COM +"(id)," 
												+ ");";
	
	private static final String INSERT_SQL_COM = "INSERT INTO " + TB_NAME_COM + " VALUES (?, ?, ?, ?, ?, ?, ?)";
	private static final String INSERT_SQL_IMG = "INSERT INTO " + TB_NAME_IMG + " VALUES (?, ?)";
	
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		DataSource ds = DBConnection.dataSource();
		Connection conn = null;
		Statement stmt;

		// Create DB
		try {
			try {
				conn = ds.getConnection();
				stmt = conn.createStatement();
				stmt.executeUpdate("DROP DATABASE IF EXISTS " + DB_NAME);
				stmt.executeUpdate("CREATE DATABASE " + DB_NAME + " COLLATE Chinese_Taiwan_Stroke_CI_AI");
				System.out.println("成功新增Database: " + DB_NAME);
			} catch (SQLException e) {
				System.err.println("無法新增Databsae");
				e.printStackTrace();
			}
			((SQLServerDataSource) ds).setDatabaseName(DB_NAME);

			// Create Table
			try {
				conn = ds.getConnection();
				stmt = conn.createStatement();
				// Create comment table
				stmt.executeUpdate("DROP DATABASE IF EXISTS " + TB_NAME_COM);
				stmt.executeUpdate(CREATE_TB_COM);			
				System.out.println("成功新增Table: " + TB_NAME_COM);
				// Create comment-image table (with FK)
				stmt.executeUpdate("DROP DATABASE IF EXISTS " + TB_NAME_IMG);
				stmt.executeUpdate(CREATE_TB_IMG);			
				System.out.println("成功新增Table: " + TB_NAME_IMG);		
			} catch (SQLException e) {
				System.err.println("無法新增Table");
				e.printStackTrace();
			}
			
			// Insert comments
			insertComments(conn);
			// Insert images of comments
			insertCommentImages(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println("無法關閉connection");
				}
			}
		}

	}
	

	// Insert data of comments then close connection
	public static void insertComments(Connection conn) {
		try (FileInputStream fis = new FileInputStream("src/main/resources/static/data/comments.csv");
			 InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			 BufferedReader br = new BufferedReader(isr)) {
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(br);
			SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL_COM);
			Date formatDate;
			for (CSVRecord record : records) {
				pstmt.setString(1, record.get(0));
				pstmt.setInt(2, Integer.parseInt(record.get(1)));
				pstmt.setString(3, record.get(2));
				formatDate = date.parse(record.get(3));
				pstmt.setTimestamp(4, new Timestamp(formatDate.getTime()));
				pstmt.setInt(5, Integer.parseInt(record.get(4)));
				pstmt.setString(6, record.get(5));
				pstmt.setString(7, record.get(6));
				pstmt.addBatch();
			}
			int[] data = pstmt.executeBatch();
			pstmt.close();
			System.out.println("成功新增" + data.length + "筆評論資料");
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} 
	}

	
	public static void insertCommentImages(Connection conn) {
		try (FileInputStream fis = new FileInputStream("src/main/resources/static/data/comment-images.csv");
			 InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			 BufferedReader br = new BufferedReader(isr)) {
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(br);
			PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL_IMG);
			for (CSVRecord record : records) {
				pstmt.setString(1, uploadFile(record.get(1)));
				pstmt.setInt(2, Integer.parseInt(record.get(0)));
				pstmt.addBatch();
			}
			int[] data = pstmt.executeBatch();
			pstmt.close();
			System.out.println("成功新增" + data.length + "筆評論圖片");
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} 
	}

	
	public static String uploadFile(String fileName) {
		File inputFile = new File("src/main/resources/static/data/images/" + fileName);
		String savePath = null;
		try {
			savePath = FileUploadUtil.saveFile(IMAGE_DIR, inputFile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return savePath;

	}



}
