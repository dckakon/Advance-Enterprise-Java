public class Pizza extends Food{
    double size;

    Pizza(){ }
    //Pizza(12, 500, "Pepperoni Pizza")
    Pizza(double size,double price, String name)
    {
        super(price, name);
        this.size = size;
    }
    
    @Override   // method overriding
    void showDetails()
    {
        super.showDetails();
        System.out.println("Pizza Size-"+size);
    }
}