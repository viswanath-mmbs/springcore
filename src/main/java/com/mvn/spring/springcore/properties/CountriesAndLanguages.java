package com.mvn.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {
	
	private Properties contAndLang;

	public Properties getContAndLang() {
		return contAndLang;
	}

	public void setContAndLang(Properties contAndLang) {
		this.contAndLang = contAndLang;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [contAndLang=" + contAndLang + "]";
	}
	
}
