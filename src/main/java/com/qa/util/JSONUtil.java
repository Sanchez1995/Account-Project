package com.qa.util;

import com.owlike.genson.Genson;

public class JSONUtil {

	private Genson genson;

	public JSONUtil() {
		this.genson = new Genson();
	}

	public String getGensonForObject(Object obj) {
		return genson.serialize(obj);
	}

	public <T> T getObjectForGenson(String jsonString, Class<T> clazz) {

		return genson.deserialize(jsonString, clazz);
	}

}