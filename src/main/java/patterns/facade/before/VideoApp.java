package patterns.facade.before;

public class VideoApp {
    public static void main(String[] args) {
        VideoEncoder encoder = new VideoEncoder();
        AudioMixer mixer = new AudioMixer();
        Uploader uploader = new Uploader();

        String fileName = "funny_cat_video.mp4";
        encoder.encode(fileName);
        mixer.mix("funny_cat_audio.mp3");
        uploader.upload("YouTube", fileName);
    }
}

/*
Problémy s čistým kódem zde:

Klient musí znát všechny detaily podsystému (ví, jaké třídy existují a v jakém pořadí volat metody).

Vysoká složitost a vazba klienta na podsystém.

Pokud se něco změní v podsystému (např. nová metoda u VideoEncoder), klient musí být upraven.

Porušuje se Single Responsibility Principle a Open/Closed Principle – klient obsahuje logiku orchestrace operací, která by měla být v subsystému.
 */
