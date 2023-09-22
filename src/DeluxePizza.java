public class DeluxePizza extends Pizza{
    public DeluxePizza(boolean veggie) {
        super(veggie); // super.veggie = veggie
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}
