package HardCode;

public class EmailService {

    public void sendEmail(String recipient) {
        String smtpServer = "smtp.example.com";  // hard-coded
        int port = 587;                          // hard-coded
        String username = "user@example.com";    // hard-coded
        String password = "password123";         // hard-coded

        System.out.println("Sending email to " + recipient + " via " + smtpServer + ":" + port);
        // logika odeslání e-mailu
    }
}
