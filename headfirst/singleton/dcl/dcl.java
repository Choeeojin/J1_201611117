package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance; //누구나 알수있게 공유
  //private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
  public static synchronized Singleton getInstance() {
    if(uniqueInstance == null) {
      synchronized(Singleton.class) {
        if(uniqueinstance == null) {
          System.out.println("Creating...");
          uniqueInstance = new Singleton(); // 자기자신 안에서는 호출 가능
    }
  }
    //else {
      System.out.println("returning..");
      System.out.println("num called...." + numCalled);  //}
