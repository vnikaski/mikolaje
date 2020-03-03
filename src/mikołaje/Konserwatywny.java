package mikołaje;

import prezentobiorcy.Prezentobiorca;

public class Konserwatywny extends Mikołaj{
    @Override
    public void obdaruj(Prezentobiorca prezentobiorca) {
        prezentobiorca.przyjmijRózgę();
    }

    @Override
    public String przedstawSię() {
        return "Jestem Mikołaj Konserwatywny. Uważam, że każdemu należy wymierzyć rózgę.";
    }

    @Override
    public String toString(){
        return "Konserwatywny";
    }
}
