package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

	private String studentName;
	private String type;
	private String fileName;

	// Instance of the Configuration Class
	private static Configuration configurationInstance;

	// Constructor of the Configuration Class
	public Configuration() {
		Config configuration = ConfigFactory.load();
		this.studentName = configuration.getString("name");
		this.type = configuration.getString("type");
		this.fileName = configuration.getString("fileName");
	}

	public static Configuration getInstance() {
		if (configurationInstance == null) {
			configurationInstance = new Configuration();
		}
		return configurationInstance;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getType() {
		return type;
	}

	public String getFileName() {
		return fileName;
	}
}