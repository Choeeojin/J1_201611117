package headfirst.factory.pizzafm;

public abstract NYPizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
    Pizza pizza=null;
    if(type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    }
    return pizza;
  }
}