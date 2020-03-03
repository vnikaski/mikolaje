package prezentobiorcy;

public class ZaDużoPrezentów extends Exception {
    private Prezentobiorca prezentobiorca;
    public ZaDużoPrezentów(Prezentobiorca prezentobiorca) {
        this.prezentobiorca = prezentobiorca;
    }

    @Override
    public String toString(){
        return "(prezentobiocy.ZaDużoPrezentów) dla " + prezentobiorca;
    }
}