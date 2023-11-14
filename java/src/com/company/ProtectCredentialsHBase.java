package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProtectCredentialsHBase {

    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            // Load the properties file
            prop.load(new FileInputStream("config.properties"));

            // Retrieve the property values
            String sshHostname = prop.getProperty("ssh.hostname");
            String sshUsername = prop.getProperty("ssh.username");
            String sshPassword = prop.getProperty("ssh.password");
            String hbaseHostname = prop.getProperty("hbase.hostname");

            // Rest of your code using the retrieved values
            // ...

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
