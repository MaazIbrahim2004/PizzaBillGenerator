public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(false);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
        pizza.getBill();

        DeluxePizza deluxePizza = new DeluxePizza(true);
        pizza.takeOut();
        pizza.getBill();
    }
}