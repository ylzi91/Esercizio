package yurilenzi.Esercizio.entities;

public class Drink extends Prodotto {
    private double litre;
    private boolean alcolic;
    private double percentage = 0;

    public Drink(String name, int calories, double price, double litre, boolean alcolic) {
        super(name, calories, price);
        this.litre = litre;
        this.alcolic = alcolic;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public boolean isAlcolic() {
        return alcolic;
    }

    public void setAlcolic(boolean alcolic) {
        this.alcolic = alcolic;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        if (this.alcolic) {
            this.percentage = percentage;
        }
    }

    @Override
    public String toString() {
        return
                "\n" + name.toUpperCase() +
                        " " + litre +
                        (this.alcolic == true ? " " + percentage + "%" : "") +
                        " calories " + calories +
                        " price " + price;
    }
}
