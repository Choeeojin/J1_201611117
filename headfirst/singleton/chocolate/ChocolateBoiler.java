package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty; // 의미없는 데이터 -> 은닉
  private boolean boiled; // 의미없는 데이터 -> 은닉
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private ChocolateBoiler() {
    empty = true;
    boiled = false; 
  }
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null) {
      System.out.println("Creating...");
      uniqueInstance = new ChocolateBoiler(); // 자기자신 안에서는 호출 가능
    }
    
    //else {
      System.out.println("returning..");
      System.out.println("num called...." + numCalled++);
      return uniqueInstance;
    //}
  }
  // instance를 만들지 않고 사용 ex) ChocolateBoiler.getInstance()
  
 public void fill() {
    if(isEmpty()) {
      System.out.println("filling...");
      empty=false;
      boiled=false;
    }
  }
  public boolean isEmpty() {
    return empty;
  }
}