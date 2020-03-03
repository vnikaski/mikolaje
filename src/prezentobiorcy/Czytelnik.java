package prezentobiorcy;

import prezenty.Marzenia;
import prezenty.Prezent;

public class Czytelnik extends Prezentobiorca {

    public Czytelnik(int ileMiejsca) {
        super(ileMiejsca);
        this.marzenie = Marzenia.Książki;
    }

    @Override
    public String przedstawSię() {
        return "Jestem Czytelnikiem, marzę o książkach, te święta będą udane, jeśli dostanę choć jedną.";
    }

    @Override
    public boolean zadowolony() {
        for(Prezent prezent: prezenty){
            if(prezent != null && prezent.getKategoria() == Marzenia.Książki){
                return true;}
        }
        return false;
    }

    @Override
    public String toString() {
        String prezentyWypisane = "";
        for(int i=0; i<prezenty.length; i++){
            if(prezenty[i] == null){
                break;
            } else if (i == 0) {
                prezentyWypisane += prezenty[i];
            }
            else {
                prezentyWypisane += (", " + prezenty[i]);
            }
        }
        return "Czyteknik{ileRazyRózgi=" + ileRózg + ", ilePrezentów=" + ilePrezentów
                + ": [" + prezentyWypisane + "]}";
    }
}
