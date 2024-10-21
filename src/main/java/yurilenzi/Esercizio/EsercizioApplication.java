package yurilenzi.Esercizio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yurilenzi.Esercizio.entities.Drink;
import yurilenzi.Esercizio.entities.Menu;
import yurilenzi.Esercizio.entities.Pizza;
import yurilenzi.Esercizio.entities.Toppings;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class EsercizioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsercizioApplication.class);
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
		String menu = (String) context.getBean("menu");
		System.out.println(menu);


	}


	}






