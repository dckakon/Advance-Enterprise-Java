// Parent Class/ Base Class
public class Food {
    double price;
    String name;
   // Polymorphism - 
    Food(){ 
        System.out.println("Default Constructor");
    }     //default constructor
   
   //Food (200, "Chicken Burger")
    Food(double price, String name){ //parameterized constructor
        this.price = price; //200 // this ---> fields/ data member/methods of current class
        this.name = name;  //Chicken Burger
    }
//--------------------
    void showDetails(){
        System.out.println("----Food Item----");
        System.out.println("Name:"+ name);
        System.out.println("Price:"+price);
    }
    
}