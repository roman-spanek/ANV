package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ParticleFactory {
    private Map<String, ParticleFlyweight> flyweights = new HashMap<>();

    public ParticleFlyweight getFlyweight(String type, String color, String sprite) {
        String key = type + "-" + color + "-" + sprite;
        flyweights.putIfAbsent(key, new ParticleFlyweight(type, color, sprite));
        return flyweights.get(key);
    }
}
