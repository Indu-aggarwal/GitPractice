package uk.axone.devintest.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws FileNotFoundException,IOException {

        FileInputStream fis = new FileInputStream("TestModule/application.properties");
        Properties props = new Properties();
        props.load(fis);

        String value = props.getProperty("browser");
        System.out.println(value);
    }
}