package mikołaje;

import prezentobiorcy.Prezentobiorca;
import prezentobiorcy.ZaDużoPrezentów;
import prezenty.Marzenia;
import prezenty.Prezent;

import java.awt.color.ProfileDataException;
import java.util.HashMap;

public class Życzliwy extends Mikołaj{


    @Override
    public void obdaruj(Prezentobiorca prezentobiorca) {
        Marzenia marzenieDoSpełnienia = prezentobiorca.powiedzŻyczenie();
        switch (marzenieDoSpełnienia){
            case Inne: Prezent inny = new Prezent(marzenieDoSpełnienia, "Skarpetki");
                try {
                    prezentobiorca.przyjmijPrezent(inny);
                }catch (ZaDużoPrezentów e){
                    System.out.println("Ups, za dużo prezentów, przykro mi :" + e);
                } break;
            case Książki: Prezent książka = new Prezent(marzenieDoSpełnienia, "Książka",
                    new HashMap<String, String>(){{ put("autor", "Olga Tokarczuk"); put("tytuł", "Prawiek"); }});
                try {
                    prezentobiorca.przyjmijPrezent(książka);
                }catch (ZaDużoPrezentów e){
                    System.out.println("Ups, za dużo prezentów, przykro mi :" + e);
                } break;
            case Prenumerata: Prezent magazyn = new Prezent(marzenieDoSpełnienia, "Magazyn",
                    new HashMap<String, String>(){{put("tytuł", "Harper's Bazaar");}});
                try {
                    prezentobiorca.przyjmijPrezent(magazyn);
                }catch (ZaDużoPrezentów e){
                    System.out.println("Ups, za dużo prezentów, przykro mi :" + e);
                } break;
            case Majsterkowanie: Prezent wiertarka = new Prezent(marzenieDoSpełnienia, "WiertarkoWkrętarka",
                    new HashMap<String, String>(){{put("marka", "Makita"); put("model", "DHP483RFJ");}});
                try {
                    prezentobiorca.przyjmijPrezent(wiertarka);
                }catch (ZaDużoPrezentów e){
                    System.out.println("Ups, za dużo prezentów, przykro mi :" + e);
                } break;//dodaj mój rodzaj prezentu


        }
    }


    @Override
    public String przedstawSię() {
        return "Jestem Mikołaj Życzliwy, staram się spełnić Twoje marzenie.";
    }

    @Override
    public String toString() {
        return "Życzliwy";
    }
}
