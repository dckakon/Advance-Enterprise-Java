public class Car{
    String brandName;   // properties / fields / variables/ features 
    int speed;
    boolean isManual;

    //same name method (Start) but different behavior, supporting -> polymorphism
    // Method overloading
    // methods/ character / actions  
    void Start(String name){   //  1 - parameterized method 
        System.out.println("Starting...... "+name);
    }
    void Start(String name, int speed){   // 2 - parameterized method 
        System.out.println("Starting...... "+ name + speed);
    }

    void Stop (){  // non - parameterized method 
        System.out.println("Stoping........ ");
    }

    void showDetails(){
        System.out.println("-----Car Info-----");
        System.out.println("Brand name="+brandName);
        System.out.println("Speed="+speed);
        System.out.println("Manual="+isManual);
    }

public static void main (String args[])
    {
      Car c1 = new Car();   // Car()  -> constructor - initialize objects when they are created
      c1.brandName = "BMW";  
      c1.speed = 120;
      c1.isManual = false;
      c1.Start(c1.brandName);
      c1.Start(c1.brandName, c1.speed);
      //c1.Stop();
      c1.showDetails();

      Car c2 = new Car(); 
      c2.brandName = "F";  
      c2.speed = 100;
      c2.isManual = true;
      //c2.Start(c2.brandName);
      //c2.Stop();

    }
}