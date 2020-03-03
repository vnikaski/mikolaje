package zadanie_domowe;

import mikołaje.Konserwatywny;
import mikołaje.Mikołaj;
import mikołaje.Rodzinny;
import mikołaje.Życzliwy;
import prezentobiorcy.*;

public class Main {

    void choinka(){
        System.out.println("Czas prezentów!\n");

        Mikołaj[] mikolaje = new Mikołaj[]{new Życzliwy(), new Rodzinny(), new Życzliwy(), new Konserwatywny()};
        Prezentobiorca[] dzieciMałeiDuże = new Prezentobiorca[]{new Typowy(1), new Markotny(2), new Czytelnik(1), new Radosny(10) };
        for(int mi = 0, bi = 0, ile = 0; ile < 10; ile++, mi = (mi+1)%mikolaje.length, bi = (bi+1)%dzieciMałeiDuże.length){
            System.out.println("Mikołaj " + mikolaje[mi] + " daje prezent " + dzieciMałeiDuże[bi]);
            mikolaje[mi].obdaruj(dzieciMałeiDuże[bi]);
        }

        System.out.println("\nPodsumowanie:\n");

        for(Prezentobiorca biorca: dzieciMałeiDuże){
            System.out.println(biorca + (biorca.zadowolony()?" i zadowolony!":" nie jest zadowolony :("));
        }

        System.out.println("\nWszystkiego dobrego!");
    }


    public static void main(String[] args) {

        Main o = new Main();
        o.choinka();

    }
}