package patterns.facade.refactored;

public class VideoAppWithFacade {
    public static void main(String[] args) {
        VideoServiceFacade videoService = new VideoServiceFacade();

        videoService.processAndUploadVideo(
                "funny_cat_video.mp4",
                "funny_cat_audio.mp3",
                "YouTube"
        );
    }
}

/*
Co se zlepšilo:

Izolace složitosti podsystému: klient nevidí a nevolá přímo třídy VideoEncoder, AudioMixer a Uploader.

Single Responsibility Principle: klient je zodpovědný jen za iniciaci procesu, logika orchestrace je v fasádě.

Open/Closed Principle: přidání nových kroků do procesu (např. watermark nebo komprese) vyžaduje změnu pouze ve fasádě, ne v klientovi.

Srozumitelnost a čitelnost: klientský kód je čistý a jednoduchý.
 */
