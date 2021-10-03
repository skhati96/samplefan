package com.example.fanproj;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;
import java.util.Set;

public class ExtConfigProperites implements Serializable {
	private static final long serialVersionUID = 1L;

	private final Properties configDefaultProp;

	private ExtConfigProperites() {
		// Private constructor to restrict new instances
		// Read properties from default.properties
		configDefaultProp = new Properties();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("default.properties");
		System.out.println("Reading all default properties from the file");
		try {
			configDefaultProp.load(in);
			in.close();
			System.out.println("Inside ExtConfig method: MaxSpeed="+configDefaultProp.getProperty("MaxSpeed"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// singleton pattern to hold the the properties in cache and
	private static class OnDemandHolder {
		private static final ExtConfigProperites INSTANCE = new ExtConfigProperites();
	}

	public static ExtConfigProperites getInstance() {
		return OnDemandHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

	public String getProperty(String key) {
		return configDefaultProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return configDefaultProp.stringPropertyNames();
	}

	public boolean containsKey(String key) {
		return configDefaultProp.containsKey(key);
	}

	public void setProperty(String key, String value) {
		configDefaultProp.setProperty(key, value);
	}
}
