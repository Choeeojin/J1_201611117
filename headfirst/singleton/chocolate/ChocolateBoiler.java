package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty; // �ǹ̾��� ������ -> ����
  private boolean boiled; // �ǹ̾��� ������ -> ����
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private ChocolateBoiler() {
    empty = true;
    boiled = false; 
  }
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null) {
      System.out.println("Creating...");
      uniqueInstance = new ChocolateBoiler(); // �ڱ��ڽ� �ȿ����� ȣ�� ����
    }
    
    //else {
      System.out.println("returning..");
      System.out.println("num called...." + numCalled++);
      return uniqueInstance;
    //}
  }
  // instance�� ������ �ʰ� ��� ex) ChocolateBoiler.getInstance()
  
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