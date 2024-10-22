package yurilenzi.Esercizio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsercizioApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsercizioApplication.class, args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsercizioApplication.class);
//		List<Toppings> toppings = Arrays.asList(
//				(Toppings) context.getBean("cheese"),
//				(Toppings) context.getBean("ham"),
//				(Toppings) context.getBean("onions"),
//				(Toppings) context.getBean("pineapple"),
//				(Toppings) context.getBean("salami"));
//
//		List<Pizza> pizze = Arrays.asList(
//				(Pizza) context.getBean("pizzaMarg"),
//				(Pizza) context.getBean("hawaiian"),
//				(Pizza) context.getBean("salamiPizza")
//		);
//		List<Drink> drinks = Arrays.asList(
//				(Drink) context.getBean("lemonade"),
//				(Drink) context.getBean("water"),
//				(Drink) context.getBean("wine")
//		);
//        Menu menu = context.getBean(Menu.class);
//        menu.vediTutto();


    }


}






