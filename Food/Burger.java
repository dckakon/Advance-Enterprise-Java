// Inheritance -- access the data member, fields, method/function of parent class
// Child Class/ Derived Class
public class Burger extends Food{
    int numberOfPatties; 
    Burger () {}
    // Burger(2, 200, "Chicken Burger")
    Burger (int numberOfPatties,double price, String name) {
        super(price, name);  // super() ->Constructor of parent class
        this.numberOfPatties = numberOfPatties;
    }

    @Override
    void showDetails()
    {
        super.showDetails();
        System.out.println("Number of patties-"+numberOfPatties);
    }

    
}