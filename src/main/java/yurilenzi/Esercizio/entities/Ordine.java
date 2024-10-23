package yurilenzi.Esercizio.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Ordine {

    private static int numOrd = 0;
    private final int costoCoperto = 2;
    private StatoOrdine statoOrdine;
    private int numCoperti;
    private LocalDateTime oraAcquisizione;
    private List<Pizza> pizzas = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private Tavolo tavolo;

    public Ordine(int numCoperti, LocalDateTime oraAcquisizione, Tavolo tavolo) throws MaxCopException {
        this.numOrd++;
        this.statoOrdine = StatoOrdine.INCORSO;
        if (numCoperti > tavolo.getNumMassimoCoperti()) throw new MaxCopException();
        this.numCoperti = numCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.tavolo = tavolo;
        this.tavolo.setLibero(false);
    }

    public void aggiungiPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void rimuoviPizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    public void aggiungiDrink(Drink drink) {
        drinks.add(drink);
    }

    public double conto() {
        double pizzaSum = this.pizzas.stream().map(Prodotto::getPrice).reduce((double) 0, Double::sum);
        double drinkSum = this.drinks.stream().map(Prodotto::getPrice).reduce((double) 0, Double::sum);
        double sommaCoperti = numCoperti * costoCoperto;
        return pizzaSum + drinkSum + sommaCoperti;
    }

    public int getNumOrd() {
        return numOrd;
    }

    public void setNumOrd(int numOrd) {
        this.numOrd = numOrd;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public int getNumCoperti() {
        return numCoperti;
    }

    public void setNumCoperti(int numCoperti) {
        this.numCoperti = numCoperti;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }
}
