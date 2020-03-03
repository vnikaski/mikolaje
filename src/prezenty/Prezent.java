package prezenty;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Prezent {
    private Marzenia kategoria;
    private String rodzaj;
    private HashMap<String, String> szczegóły;
    public Prezent(Marzenia kategoria, String rodzaj){
        this.kategoria = kategoria;
        this.rodzaj = rodzaj;
    }

    public Prezent(Marzenia kategoria, String rodzaj, HashMap<String, String> szczegóły){
        this.kategoria = kategoria;
        this.rodzaj = rodzaj;
        this.szczegóły = szczegóły;
    }

    @Override
    public String toString(){
        if(szczegóły == null){
            return rodzaj;
        }
        return rodzaj + szczegóły.toString();
    }

    public Marzenia getKategoria() {
        return kategoria;
    }
}
