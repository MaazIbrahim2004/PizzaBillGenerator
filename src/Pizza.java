public class Pizza {
    private double price;
    private boolean veggie;

    private int extraCheesePrice = 1;
    private double extraToppingsPrice = 1.5;
    private double thankYouBag = 0.5;
    private double basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeOut = false;

    public Pizza(boolean veggie) { // price fixed so no need unless boolean changed
        this.veggie = veggie;
        if (this.veggie) {
            this.price = 3;
        } else {
            this.price = 4; // non-veggie
        }
         this.basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeOut() {
        isOptedForTakeOut = true;
        this.price += thankYouBag;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: $" + basePizzaPrice);

        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: $" + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra toppings added: $" + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeOut) {
            bill += "Take away Bag: $" + thankYouBag + "\n";
        }
        System.out.printf("%s \n Your total bill is: $%.2f \n", bill, this.price);
    }
}
