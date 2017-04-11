package headfirst.decorator.starbuzz;

public class Coffee {
 
  public static void main(String args[]) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soybean(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    
    Beverage caramel = new caramelMacchiato();
    caramel = new CaSyrup(caramel);
    caramel = new hotMilk(caramel);
    caramel = new Shot(caramel);
    caramel = new Shot(caramel);
    System.out.println(caramel.getDescription() + "$" + caramel.cost());
  }
}