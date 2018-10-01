package com.trial.munyiapi.munyiapi;

import java.util.HashMap;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class DummyData {
	public HashMap<String, HashMap<String, String>> dummy_data = new HashMap<String,HashMap<String, String>>();
	 
	 //this needs to change to a better approach. Ask Simon
	@Bean
	 public HashMap<String, HashMap<String, String>> loadData() {
		HashMap<String, String> singleData = new HashMap<String,String>();
		singleData.put("first_name", "jonathan");
		singleData.put("last_name", "munyi");
		
		this.dummy_data.put("+254721392787", singleData);
		
		singleData = new HashMap<String, String>();
		singleData.put("first_name", "paul");
		singleData.put("last_name", "kahohi");
		
		this.dummy_data.put("+254708265232", singleData);
		return dummy_data;
	 }
	 
	 public HashMap<String, HashMap<String, String>> getDummy_data() {
		 
		 return dummy_data;
	 }
}
