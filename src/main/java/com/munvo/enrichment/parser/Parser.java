package com.munvo.enrichment.parser;

import com.munvo.enrichment.configuration.Configuration;

/**
 * Uses Factory pattern to instantiate a FileReaderParser based on value of "type" 
 * given in the Configuration class.
 * @author goharsaqibfazal
 * 
 */
public class Parser {
	
	/**
	 * instantiates the FileReaderParser
	 * @param configuration; Object of Configuration Class
	 * @return type of Parser; JSON or CSV
	 */
	public FileReaderParser getParser(Configuration configuration) {
		
		if(configuration.getType().equals("JSON")) {
			return new JSONParser();
		}
		else if(configuration.getType().equals("CSV")){
			return new CSVParser();
		}
		else {
			return null;
		}
	}
}
