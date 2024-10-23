package yurilenzi.Esercizio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import yurilenzi.Esercizio.entities.Drink;
import yurilenzi.Esercizio.entities.Pizza;
import yurilenzi.Esercizio.entities.Tavolo;
import yurilenzi.Esercizio.entities.Toppings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Configuration
public class MenuConfig {

    @Bean
    public Toppings cheese() {
        return new Toppings(92, 0.69, "Cheese");
    }

    @Bean
    public Toppings ham() {
        return new Toppings(35, 0.99, "Ham");
    }

    @Bean
    public Toppings onions() {
        return new Toppings(22, 0.69, "Onions");
    }

    @Bean
    public Toppings pineapple() {
        return new Toppings(24, 0.79, "Pineapple");
    }

    @Bean
    public Toppings salami() {
        return new Toppings(86, 0.99, "Salami");
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", 128, 1.29, 0.33, false);
    }

    @Bean
    public Drink water() {
        return new Drink("Water", 0, 1.29, 0.5, false);
    }

    @Bean
    public Drink wine() {
        Drink drink = new Drink("Wine", 607, 7.49, 0.75, true);
        drink.setPercentage(13);
        return drink;
    }

    @Bean
    @Scope("prototype")
    public Pizza pizzaMarg() {
        Pizza marg = new Pizza("Pizza Margherita", 1104, 4.99);
        marg.addTopping(cheese());
        return marg;
    }

    @Bean
    @Scope("prototype")
    public Pizza pizzaBasic() {
        return new Pizza("Base pomodoro", 1000, 3.99);
    }

    @Bean
    @Scope("prototype")
    public Pizza hawaiian() {
        Pizza haw = new Pizza("Hawaiian Pizza", 1024, 6.49);
        haw.addTopping(cheese());
        haw.addTopping(ham());
        haw.addTopping(pineapple());
        return haw;
    }

    @Bean
    @Scope("prototype")
    public Pizza salamiPizza() {
        Pizza sal = new Pizza("Salami Pizza", 1024, 6.49);
        sal.addTopping(cheese());
        sal.addTopping(salami());
        return sal;
    }


    @Bean
    public List<Tavolo> tavoli() {
        List<Tavolo> tavoli = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numCopRand = new Random().nextInt(2, 10);
            tavoli.add(tavolo(i));
        }
        return tavoli;

    }

    @Bean
    @Scope("prototype")
    public Tavolo tavolo(int i) {
        int numCopRand = new Random().nextInt(2, 10);
        return new Tavolo(i + 1, numCopRand, false);
    }

    @Bean
    public int i() {
        return 0;
    }
}
