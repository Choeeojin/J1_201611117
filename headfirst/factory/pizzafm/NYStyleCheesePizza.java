package headfirst.factory.pizzafm;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    name = "NYStyleCheesePizza";
    dough = "Thin Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Grated Reggiano Cheese");
  }
}