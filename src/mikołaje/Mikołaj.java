package mikołaje;

import prezenty.Marzenia;
import prezentobiorcy.Prezentobiorca;
import prezentobiorcy.ZaDużoPrezentów;

public abstract class Mikołaj {

    public abstract void obdaruj(Prezentobiorca prezentobiorca);

    public abstract String przedstawSię();

    @Override
    public abstract String toString();
}

