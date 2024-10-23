package yurilenzi.Esercizio.entities;

public class Tavolo {
    private int numTavolo;
    private int numMassimoCoperti;
    private boolean libero;

    public Tavolo(int numTavolo, int numMassimoCoperti, boolean libero) {
        this.numTavolo = numTavolo;
        this.numMassimoCoperti = numMassimoCoperti;
        this.libero = libero;
    }

    public int getNumTavolo() {
        return numTavolo;
    }

    public void setNumTavolo(int numTavolo) {
        this.numTavolo = numTavolo;
    }

    public int getNumMassimoCoperti() {
        return numMassimoCoperti;
    }

    public void setNumMassimoCoperti(int numMassimoCoperti) {
        this.numMassimoCoperti = numMassimoCoperti;
    }

    public boolean isLibero() {
        return libero;
    }

    public void setLibero(boolean libero) {
        this.libero = libero;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numTavolo=" + numTavolo +
                ", numMassimoCoperti=" + numMassimoCoperti +
                ", libero=" + libero +
                '}';
    }
}
