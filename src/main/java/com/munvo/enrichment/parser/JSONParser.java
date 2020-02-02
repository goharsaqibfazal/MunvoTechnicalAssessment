package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser implements FileReaderParser {

	@Override
	public Subscriber parseSubscriber(String subLine) {

		try {
			JSONObject jsonObject = new JSONObject(subLine);
			int idJSON = jsonObject.getInt("id");
			Subscriber subscriber = new Subscriber(idJSON, jsonObject.getString("name"), jsonObject.getString("phone"));
			return subscriber;

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

}