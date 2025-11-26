package pr10.hierarchi;

import java.util.List;

public class HybridEngine implements Engine {
    private final ElectricEngine electricEngine;
    private final GasolineEngine gasolineEngine;

    public HybridEngine(ElectricEngine electricEngine, GasolineEngine gasolineEngine) {
        this.electricEngine = electricEngine;
        this.gasolineEngine = gasolineEngine;
    }


    @Override
    public void start() {

    }
}
