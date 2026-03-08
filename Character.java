// Interface -> static , default method
interface Subway{
    void left();
    void right();

    default void run(){
        System.out.println("Running .......!");
    }
}

class Character implements Subway{

    public void left(){
        System.out.println("Turning left");
    }

    public void right(){
        System.out.println("Turning right");
    }

    public static void main(String args[])
    {
        Character c1 = new Character();
        c1.run();   
        c1.left();
        c1.right();
    }
}