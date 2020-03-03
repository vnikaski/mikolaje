package prezentobiorcy;

import prezenty.Marzenia;

public class Radosny extends Prezentobiorca {

    public Radosny(int ileMiejsca) {
        super(ileMiejsca);
        this.marzenie = Marzenia.Inne;
    }

    @Override
    public String przedstawSię() {
        return "Jestem radosny, marzy mi się coś z kategorii inne, ale i tak będę zadowolony, bo kocham święta";
    }

    @Override
    public boolean zadowolony() {
        return true;
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
        return "Radosny{ileRazyRózgi=" + ileRózg + ", ilePrezentów=" + ilePrezentów
                + ": [" + prezentyWypisane + "]}";
    }
}
