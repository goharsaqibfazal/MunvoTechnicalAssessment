package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CSVParser implements FileReaderParser {

	@Override
	public Subscriber parseSubscriber(String subLine) {
		String[] splitCSV = subLine.split(",");
		if (splitCSV.length != 3) {
			System.out.println("invalid format!");
		}
		return new Subscriber(Integer.parseInt(splitCSV[0]), splitCSV[1], splitCSV[2]);
	}
}