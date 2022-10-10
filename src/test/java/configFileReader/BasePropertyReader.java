package configFileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePropertyReader {
    protected Properties properties;
    protected String propertiesFilePath;

    protected void initProperties() throws IOException {
        FileInputStream fileInputStream  = new FileInputStream(propertiesFilePath);
        properties = new Properties();
        properties.load(fileInputStream);
        fileInputStream.close();
    }
}
