package cleancode.HardCode.refactored;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EmailService {

    private String smtpServer;
    private int port;
    private String username;
    private String password;

    public EmailService() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("config.properties"));
            smtpServer = props.getProperty("smtp.server");
            port = Integer.parseInt(props.getProperty("smtp.port"));
            username = props.getProperty("smtp.username");
            password = props.getProperty("smtp.password");
        } catch (IOException e) {
            e.printStackTrace(); //TODO ?
        }
    }

    public void sendEmail(String recipient) {
        System.out.println("Sending email to " + recipient + " via " + smtpServer + ":" + port);

    }
}

