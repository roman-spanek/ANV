package patterns.flyweight;

//extrinsic state
public class ParticleFlyweight {
    private final String type;
    private final String color;
    private final String sprite;

    public ParticleFlyweight(String type, String color, String sprite) {
        this.type = type;
        this.color = color;
        this.sprite = sprite;
    }

    public void render(int x, int y) {
        // simulace vykreslení částice na souřadnicích
    }
}
