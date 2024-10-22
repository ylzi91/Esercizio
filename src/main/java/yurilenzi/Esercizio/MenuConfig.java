package yurilenzi.Esercizio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import yurilenzi.Esercizio.entities.*;

import java.time.LocalDateTime;
import java.util.List;


@Configuration
public class MenuConfig {

    @Bean
    @Scope("prototype")
    public Toppings cheese() {
        return new Toppings(92, 0.69, "Cheese");
    }

    @Bean
    @Scope("prototype")
    public Toppings ham() {
        return new Toppings(35, 0.99, "Ham");
    }

    @Bean
    @Scope("prototype")
    public Toppings onions() {
        return new Toppings(22, 0.69, "Onions");
    }

    @Bean
    @Scope("prototype")
    public Toppings pineapple() {
        return new Toppings(24, 0.79, "Pineapple");
    }

    @Bean
    @Scope("prototype")
    public Toppings salami() {
        return new Toppings(86, 0.99, "Salami");
    }

    @Bean
    @Scope("prototype")
    public Drink lemonade() {
        return new Drink("Lemonade", 128, 1.29, 0.33, false);
    }

    @Bean
    @Scope("prototype")
    public Drink water() {
        return new Drink("Water", 0, 1.29, 0.5, false);
    }

    @Bean
    @Scope("prototype")
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
    public Menu menu(List<Toppings> toppings, List<Pizza> pizzas, List<Drink> drinks) {
        return new Menu(pizzas, toppings, drinks);
    }

    @Bean
    public Tavolo tavolo() {
        return new Tavolo(10, 8, true);
    }

    @Bean
    public int nCoperti() {
        return 8;
    }

    @Bean
    public LocalDateTime oraOrdine() {
        return LocalDateTime.now();
    }

}
