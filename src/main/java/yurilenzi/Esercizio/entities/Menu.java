package yurilenzi.Esercizio.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Menu {
    private List<Pizza> pizzas = new ArrayList<>();
    private List<Toppings> toppings = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();

    public Menu(List<Pizza> pizzas, List<Toppings> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void vediTutto() {
        pizzas.forEach(pizza -> {
            System.out.println(pizza.name);
            pizza.getToppings().forEach(toppings1 -> {
                System.out.println(toppings1.name);
            });
            System.out.println(pizza.calories);
        });

        toppings.forEach(System.out::println);

        drinks.forEach(System.out::println);
    }
}
