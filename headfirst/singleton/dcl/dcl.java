package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance; //������ �˼��ְ� ����
  //private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
  public static synchronized Singleton getInstance() {
    if(uniqueInstance == null) {
      synchronized(Singleton.class) {
        if(uniqueinstance == null) {
          System.out.println("Creating...");
          uniqueInstance = new Singleton(); // �ڱ��ڽ� �ȿ����� ȣ�� ����
    }
  }
    //else {
      System.out.println("returning..");
      System.out.println("num called...." + numCalled);  //}
