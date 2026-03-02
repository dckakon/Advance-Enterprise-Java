//inheritance ->> can access the method/data member of parent class 
//child class ->> subclass ->> derived class
public class Character extends Game implements Speed{
    
    @Override  //annotation
    public void jump(){
        System.out.println("Jumping over the obstacle!");
    }

    @Override  //annotation
    public void left(){
        System.out.println("MOVING LEFT");
    }

    @Override  //annotation
    public void right(){
        System.out.println("MOVING RIGHT!");
    }

    @Override
    public void Boostup(){
        System.out.println("Speed boosting upppppp!");
    }  
    
}



/*
publc class CurrentAccount extends Bank{
    @Override
    void deposit() {
        System.out.println("Depositing money in current account!");
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawing money from current account!");
    }
}

publc class SavingsAccount extends Bank{
    @Override
    void deposit() {
        System.out.println("Depositing money in current account!");
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawing money from current account!");
    }
}

public class BankApp{
    public static void main (String args[]){
        CurrentAccount c1 = new CurrentAccount();
        c1.deposit();
        c1.withdraw();

        SavingsAccount s1 = new SavingsAccount();
        s1.deposit();
        s1.withdraw();

    }
}
*/