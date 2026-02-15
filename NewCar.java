public class NewCar{
    String brandName;   
    int speed;
    
    //constructor   --> similar -Class name 
    // No - access modifier/void/int/string
    // Polymorphism - many forms 
    //same name method but different behavior, supporting -> polymorphism

    // Constructor Overloading 
    NewCar() // default constructor / non parameterized 
    {   
        brandName="";
        speed=0;
        System.out.println("---Default Constructor----");    }
    
    NewCar(String name) //parameterized constructor - 1
    {   
        System.out.println("Brand name= ");    
    }
    
    NewCar(String name, int speed) //parameterized  constructor - 2
    {   
        System.out.println("Brand name= "+name); 
        System.out.println("Speed= "+speed);    
    }


public static void main (String args[])
    {
      NewCar c1 = new NewCar(); // NewCar()  
      NewCar c2 = new NewCar("BMW"); 
      NewCar c3 = new NewCar("Tesla", 120);    

    }
}