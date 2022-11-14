public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;

  }

  public static void main(String[] args) {
    Droid a = new Droid("Codey");
    System.out.println(a);
    a.performTask("dancing");
  }

  

 public void performTask(String task){
   System.out.println(name + " is performing: " + task);
  }

 
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  
}