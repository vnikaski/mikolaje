package prezentobiorcy;

import prezenty.Marzenia;

public class Markotny extends Prezentobiorca {

    public Markotny(int ileMiejsca) {
        super(ileMiejsca);
        this.marzenie = Marzenia.Inne;
    }

    @Override
    public String przedstawSię() {
        return "Jestem Markotny, marzę o kategorii inne, ale i tak nie będę zadowolony!";
    }

    @Override
    public boolean zadowolony() {
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
        return "Markotny{ileRazyRózgi=" + ileRózg + ", ilePrezentów=" + ilePrezentów
                + ": [" + prezentyWypisane + "]}";
    }
}
