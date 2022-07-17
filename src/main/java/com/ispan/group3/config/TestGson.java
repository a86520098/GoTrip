package com.ispan.group3.config;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TestGson {

	public static void main(String[] args) {
		JSONObject featureCollection = new JSONObject();
		featureCollection.put("type", "FeatureCollection");
		JSONObject properties = new JSONObject();
		properties.put("name", "ESPG:4326");
		JSONObject crs = new JSONObject();
//		crs.put("type", "name");
//		crs.put("properties", properties);
//		featureCollection.put("crs", crs);
		
		JSONArray features = new JSONArray();
		JSONObject feature = new JSONObject();
		feature.put("type", "Feature");
		JSONObject geometry = new JSONObject();

		JSONArray JSONArrayCoord = new JSONArray();

		JSONArrayCoord.add(0, 121.53713202872041);
		JSONArrayCoord.add(1, 25.05125460930175);
		geometry.put("type", "Point");
		geometry.put("coordinates", JSONArrayCoord);
		feature.put("geometry", geometry);
		feature.put("properties", properties);

		features.add(feature);
		featureCollection.put("features", features);
		System.out.println(featureCollection);

	}

}
