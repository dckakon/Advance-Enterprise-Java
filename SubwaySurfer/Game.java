//Abstraction->hiding certain details and showing 
//           only essential information to the user

// "abstract"-> partial abstraction, cannot create an object 
// method -> 1. abstract method (without any body)
//           2. regular method (with body)


// Parent class
abstract class Game{

    //regular method (with body)
    public void run(){
        System.out.println("Character is running!");
    }

    abstract void jump();
    abstract void left();
    abstract void right();
   

}

/*
abstract class Bank{

    abstract void deposit();
    abstract void withdraw();
   

}
*/