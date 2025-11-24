package patterns.facade.refactored;

public class VideoServiceFacade {
    private VideoEncoder encoder;
    private AudioMixer mixer;
    private Uploader uploader;

    public VideoServiceFacade() {
        this.encoder = new VideoEncoder();
        this.mixer = new AudioMixer();
        this.uploader = new Uploader();
    }

    public void processAndUploadVideo(String videoFile, String audioFile, String destination) {
        encoder.encode(videoFile);
        mixer.mix(audioFile);
        uploader.upload(destination, videoFile);
    }
}