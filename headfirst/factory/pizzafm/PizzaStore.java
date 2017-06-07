package headfirst.factory.pizzafm;

public abstract class PizzaStore {
  abstract {abstract}createPizza(String item);
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = f.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    
    return pizza;
  
  }

}