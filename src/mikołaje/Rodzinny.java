package mikołaje;

import prezenty.Marzenia;
import prezentobiorcy.Prezentobiorca;
import prezentobiorcy.ZaDużoPrezentów;
import prezenty.Prezent;

public class Rodzinny extends Mikołaj{

    @Override
    public void obdaruj(Prezentobiorca prezentobiorca) {
        Prezent skarpetki = new Prezent(Marzenia.Inne, "Skarpetki");
        try {
            prezentobiorca.przyjmijPrezent(skarpetki);
        }catch (ZaDużoPrezentów e){
            System.out.println("Ups, za dużo prezentów, przykro mi :" + e);
        }
    }

    @Override
    public String przedstawSię() {
        return "Jestem Mikołaj Rodzinny. Uważam, że  nic lepiej nie stworzy ciepłej i rodzinnej atmosfery niż skarpetki.";
    }

    @Override
    public String toString() {
        return "Rodzinny";
    }
}
