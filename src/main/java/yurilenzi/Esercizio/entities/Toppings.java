package yurilenzi.Esercizio.entities;

public class Toppings extends Menu {

    public Toppings(int calories, double price, String name) {
        super(name,calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "\n" + name  +
                "  calories: " + calories +
                "  price: " + price ;
    }
}
