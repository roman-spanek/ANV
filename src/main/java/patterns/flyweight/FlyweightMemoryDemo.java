package patterns.flyweight;

public class FlyweightMemoryDemo {
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();
/*
        System.out.println("=== WITHOUT FLYWEIGHT ===");
        System.out.println("Free memory: " + runtime.freeMemory() / 1024 + " KB");

        // Simulace 100 000 částic bez Flyweight
        Particle[] particles = new Particle[100_000];
        for (int i = 0; i < particles.length; i++) {
            particles[i] = new Particle("bullet", "red", "bullet.png");
        }

        System.out.println("After allocation:");
        System.out.println("Free memory: " + runtime.freeMemory() / 1024 + " KB");

        particles = null;
     //   System.gc();
*/

        System.out.println("\n=== WITH FLYWEIGHT ===");
        ParticleFactory factory = new ParticleFactory();
        System.out.println("Free memory: " + runtime.freeMemory() / 1024 + " KB");


        ParticleContext[] particleContexts = new ParticleContext[100_000];
        for (int i = 0; i < particleContexts.length; i++) {
            ParticleFlyweight fly = factory.getFlyweight("bullet", "red", "bullet.png");
            particleContexts[i] = new ParticleContext(i, i, fly);
            //fly.render(0,0);
        }

        System.out.println("After allocation:");
        System.out.println("Free memory: " + runtime.freeMemory() / 1024 + " KB");

        particleContexts = null;
        System.gc(); // dojde k uvolnění paměti?

        System.out.println("After GC:");
        System.out.println("Free memory: " + runtime.freeMemory() / 1024 + " KB");


    }
}


/*
Co tento příklad ukazuje:

Bez Flyweight – každá částice má vlastní data (type, color, sprite), což spotřebuje hodně paměti.

S Flyweight – sdílíme konstantní data přes ParticleFlyweight, každá částice má jen kontext (souřadnice), paměť se dramaticky sníží.

=== WITHOUT FLYWEIGHT ===
Free memory: 512000 KB
After allocation:
Free memory: 509542 KB

=== WITH FLYWEIGHT ===
Free memory: 512000 KB
After allocation:
Free memory: 510846 KB
After GC:
Free memory: 14867 KB
 */