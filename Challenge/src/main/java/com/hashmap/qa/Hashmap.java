package com.hashmap.qa;

import java.util.HashMap;

public class Hashmap {
	public static HashMap<String, String> getLogininfo() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("user", "8109555221_testdata@123"); // keep the data of in the form of key and value, here user is
														// key and value in the form of userName and password.
		return userMap;
	}
}
