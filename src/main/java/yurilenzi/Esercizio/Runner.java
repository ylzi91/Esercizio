package yurilenzi.Esercizio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import yurilenzi.Esercizio.entities.*;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private Ordine ordine;

    @Autowired
    private Tavolo tavolo;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsercizioApplication.class);
        context.getBean(Menu.class).vediTutto();

        ordine.aggiungiPizza((Pizza) context.getBean("pizzaMarg"));
        ordine.aggiungiDrink((Drink) context.getBean("lemonade"));
        System.out.println("Numero ordine: " + ordine.getNumOrd());
        System.out.println("Lista acquisti");
        ordine.getPizzas().forEach(System.out::println);
        ordine.getDrinks().forEach(System.out::println);
        System.out.println("Totale conto " + ordine.conto());
    }
}
