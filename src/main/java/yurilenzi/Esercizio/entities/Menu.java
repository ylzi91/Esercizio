package yurilenzi.Esercizio.entities;

public abstract class Menu {
    protected String name;
    protected int calories;
    protected double price;

    public Menu(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
