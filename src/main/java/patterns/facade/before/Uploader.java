package patterns.facade.before;

public class Uploader {
    public void upload(String destination, String fileName) {
        System.out.println("Uploading " + fileName + " to " + destination);
    }
}
