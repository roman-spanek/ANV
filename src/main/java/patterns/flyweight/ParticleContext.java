package patterns.flyweight;

//extrinsic state
public class ParticleContext {
    final int x;
    final int y;
    final ParticleFlyweight flyweight;

    ParticleContext(int x, int y, ParticleFlyweight flyweight) {
        this.x = x;
        this.y = y;
        this.flyweight = flyweight;
    }
}
