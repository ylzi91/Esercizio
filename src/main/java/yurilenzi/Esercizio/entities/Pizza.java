package yurilenzi.Esercizio.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza extends Menu {
    private List<Toppings> toppings = new ArrayList<>();

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
        toppings.add(new Toppings(20,0.99,"Tomato"));
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }
    public void addTopping(Toppings toppings){
        this.toppings.add(toppings);
    }

    @Override
    public String toString() {
        return
                "\nname: " + name +
                "(" + toppings + ")" +
                "   calories=" + calories +
                " price=" + price;
    }
}
