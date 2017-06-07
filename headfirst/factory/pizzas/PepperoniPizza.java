package headfirst.factory.pizzas;

public class PepperoniPizza extends Pizza {
  public PepperoniPizza() {
    name = "PepperoniPizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Pepperoni");
    toppings.add("Fresh Mozzarella");
  }
}