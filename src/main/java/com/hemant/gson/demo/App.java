package com.hemant.gson.demo;

import com.google.gson.Gson;

public class App {
	public static void main(String[] args) {
		//serializeJson();
		deserializeJson();
	}

	public static void serializeJson() {
		User user = new User("Hemant", "hemant@gmail.com", 25, true);
		Gson gson = new Gson();
		String json = gson.toJson(user);
		System.out.println(json);
	}
	
	public static void deserializeJson() {
		String json = "{\"name\":\"Hemant\",\"email\":\"hemant@gmail.com\",\"age\":25,\"isDeveloper\":true}";
		Gson gson = new Gson();
		User userFromJson = gson.fromJson(json, User.class);
		System.out.println(userFromJson);
	}
}
