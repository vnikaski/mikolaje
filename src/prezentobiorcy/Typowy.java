package prezentobiorcy;

import prezenty.Marzenia;
import prezenty.Prezent;

public class Typowy  extends Prezentobiorca {

    public Typowy(int ileMiejsca) {
        super(ileMiejsca);
        this.marzenie = Marzenia.Majsterkowanie;
    }

    @Override
    public String przedstawSię() {
        return "Jestem Typowy. Marzę o sprzęcie do majsterkowania, ucieszę się, jeśli go dostanę i nie otrzymam żadnej rózgi";
    }

    @Override
    public boolean zadowolony() {
        if(ileRózg == 0) {
            for (Prezent prezent : prezenty) {
                if (prezent != null && prezent.getKategoria() == Marzenia.Majsterkowanie) {
                    return true;
                }
            }
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
        return "Typowy{ileRazyRózgi=" + ileRózg + ", ilePrezentów=" + ilePrezentów
                + ": [" + prezentyWypisane + "]}";
    }
}
