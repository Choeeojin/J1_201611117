package headfirst.factory.pizzas;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if(type == "cheese") {
      pizza = new CheesePizza();
    } 
    else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza();
    }

    
    return pizza;
  }
}