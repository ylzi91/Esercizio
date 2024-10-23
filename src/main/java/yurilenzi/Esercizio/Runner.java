package yurilenzi.Esercizio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import yurilenzi.Esercizio.entities.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    private List<Ordine> ordineList = new ArrayList<>();


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsercizioApplication.class);
        context.getBean(Menu.class).vediTutto();

        List<Tavolo> tavoloList = (List<Tavolo>) context.getBean("tavoli");
        System.out.println("Lista tavoli");
        tavoloList.forEach(System.out::println);
        try {
            Ordine ordine = new Ordine(8, LocalDateTime.now(), (Tavolo) ((List<?>) context.getBean("tavoli")).getFirst());
            ordineList.add(ordine);

            ordine.aggiungiPizza((Pizza) context.getBean("pizzaMarg"));
            ordine.rimuoviPizza((Pizza) context.getBean("pizzaMarg"));
            ordine.aggiungiDrink((Drink) context.getBean("lemonade"));
            System.out.println("Numero ordine: " + ordine.getNumOrd());
            System.out.println("Lista acquisti");
            ordine.getPizzas().forEach(System.out::println);
            ordine.getDrinks().forEach(System.out::println);
            System.out.println("Numero coperti: " + ordine.getNumCoperti());
            System.out.println("Numero Tavolo: " + ordine.getTavolo().getNumTavolo());
            System.out.println("Totale conto " + ordine.conto());
        } catch (MaxCopException e) {
            System.out.println(e.getMessage());
        }


    }
}
