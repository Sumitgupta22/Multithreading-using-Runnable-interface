// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class A implements Runnable{
  public void run(){
    int i = 0;
    while( i < 10){
    System.out.println(i+" I Am A Class A");
    i++;
  }}
}
class B implements Runnable{
  public void run(){
    int i = 0;
    while( i < 10){
    System.out.println(i+" I Am A Class B");
    i++;
  }}
}
class C implements Runnable{
  public void run(){
    int i = 0;
    while( i < 10){
    System.out.println(i+ " I Am A Class C");
    i++;
  }
  }
}
 
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    A a = new A();
    B b = new B();
    C c = new C();
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b,"B");
    Thread t3 = new Thread(c);
    System.out.println(t1.getState());
    System.out.println(t2.getState());
    System.out.println(t3.getState());
    System.out.println(t1.isAlive());
    System.out.println(t2.getId());
    System.out.println(t2.getId());
    t1.start();
    t2.start();//start method
    t3.start();
    System.out.println(t2.getName());
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}