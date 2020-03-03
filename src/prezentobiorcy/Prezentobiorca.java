package prezentobiorcy;

import prezenty.Marzenia;
import prezenty.Prezent;

public abstract class Prezentobiorca {
    protected int ileMiejsca;
    protected int ileRózg = 0;
    protected Prezent[] prezenty;
    protected int ilePrezentów = 0;
    protected Marzenia marzenie;

    public Prezentobiorca(int ileMiejsca) {
        this.ileMiejsca = ileMiejsca;
        this.prezenty = new Prezent[ileMiejsca];
    }

    public Marzenia powiedzŻyczenie(){
        return marzenie;
    }

    public void przyjmijPrezent(Prezent prezent) throws ZaDużoPrezentów {
        if(ileMiejsca == ilePrezentów){
            throw new ZaDużoPrezentów(Prezentobiorca.this);
        }
        prezenty[ilePrezentów] = prezent;
        ilePrezentów++;
    }

    public void przyjmijRózgę(){
        ileRózg++;
    }

    public abstract String przedstawSię();

    public abstract boolean zadowolony();

    @Override
    public abstract String toString();
}
