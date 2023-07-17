package com.automationSelenium.utlis;

import java.util.Properties;

public enum ApplicationProperties {
    INSTANCE;
    Properties properties;

    ApplicationProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }
    public String getUrls() {
        return properties.getProperty("urls");
    }
    public String getUrlGoogle() {
        return properties.getProperty("urlsGoogle");
    }
    public  String getUrlIFrame(){
        return  properties.getProperty("urlIFrame");
    }
    public  String getUrlIdeaForGetch(){
        return properties.getProperty("urlIdeaForgetech");
    }


}
