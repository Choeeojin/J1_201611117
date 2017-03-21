package headfirst.strategy;

public abstract class Duck {
  Flybehavior flyBehavior; //context 역할
  QuackBehavior quackBehavior; //context는 합쳐질 수 있다.
  public Duck() {} //생성자에 리턴값X 
  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }
  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
  abstract void display();
  
  public void performFly() {
    flyBehavior.fly(); //fly방식 결정
  }
 
  public void performQuack() {
    quackBehavior.quack();
  }
 
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}