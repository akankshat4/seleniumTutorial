package codeCheck;

import configFileReader.ConfigPropertiesReader;

import java.io.IOException;

public class Test {
    public static void main(String args[]) throws IOException {
        /*String propertyFilePath = "src/test/resources/properties/config.properties";
        String url = null;

        FileInputStream fileInputStream = new FileInputStream(propertyFilePath);

        Properties properties;
        properties = new Properties();
        properties.load(fileInputStream);
        fileInputStream.close();
        url = properties.getProperty("URL");

        System.out.println("URL from config.properties file "+url);*/
        ConfigPropertiesReader propertiesReader =new ConfigPropertiesReader();
        System.out.println("URL : "+propertiesReader.getURL());
        System.out.println("UserName : "+propertiesReader.getUserName());

    }
}
