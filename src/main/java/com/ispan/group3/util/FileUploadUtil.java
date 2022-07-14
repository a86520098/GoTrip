package com.ispan.group3.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

	private static final String APP_PATH = "/src/main/resources/static";
//	private static final String APP_PATH = "/src/main";
	private static final String SAVE_PATH = "/data/uploadimages/";
//	private static final String SAVE_PATH = "/uploadimages/";
	
	
	// 從web透過input type = file 上傳
	public static String saveFile(String saveDir, MultipartFile multipartFile) throws IOException {
		// 上傳檔案統一放到靜態資源目錄下，saveDir為自訂項目資料夾名稱
		Path currentDir = Paths.get("").toAbsolutePath();
		String savePath = currentDir + APP_PATH + SAVE_PATH + saveDir ;
//		String savePath = currentDir + APP_PATH + SAVE_PATH;
        Path uploadPath = Paths.get(savePath);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        // 檔案名稱為原始名稱
        String fileName = multipartFile.getOriginalFilename();
        Path filePath = uploadPath.resolve(fileName);
        
        System.err.println("Path->"+ fileName);
        System.err.println("Path->"+SAVE_PATH + saveDir + "/" + fileName);
        
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            return SAVE_PATH + saveDir + "/" + fileName;
//            return SAVE_PATH + fileName;
        } catch (IOException e) {        
            throw new IOException("Could not save image file: " + fileName, e);
        }
    }
	
	// 從本磁碟直接上傳
	public static String saveFile(String saveDir, File file) throws IOException {
		Path currentDir = Paths.get("").toAbsolutePath();
		String savePath = currentDir + APP_PATH + SAVE_PATH + saveDir;
//		String savePath = currentDir + APP_PATH + SAVE_PATH;
        Path uploadPath = Paths.get(savePath);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
//        String fileName = System.currentTimeMillis() + "_" + inputFile.getName();
        String fileName = file.getName();
        Path filePath = uploadPath.resolve(fileName);
        try (InputStream inputStream = new FileInputStream(file)) {
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            return SAVE_PATH + saveDir + "/" + fileName;
//            return SAVE_PATH + fileName;
        } catch (IOException e) {        
            throw new IOException("Could not save image file: " + fileName, e);
        }
    }
	
}
