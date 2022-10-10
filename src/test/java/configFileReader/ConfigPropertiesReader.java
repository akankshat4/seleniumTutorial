package configFileReader;

import utilities.InitFinalVariables;

import java.io.IOException;

public class ConfigPropertiesReader extends BasePropertyReader{

    public ConfigPropertiesReader() throws IOException {
        super.propertiesFilePath = InitFinalVariables.configPropertiesFileLocation;
        initProperties();
    }

    public String getURL(){
        return properties.getProperty("URL");
    }

    public String getUserName(){
        return properties.getProperty("userName");
    }
}
