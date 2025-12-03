package patterns.flyweight;


public class Particle {
    private String type;
    private String color;
    private String sprite;

    public Particle(String type, String color, String sprite) {
        this.type = type;
        this.color = color;
        this.sprite = sprite;
    }
}
