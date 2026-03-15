public class ExceptionThrow{

    static void checkResult(int number)
    { 
        if(number < 33 ){
            throw new ArithmeticException("Access denied!!!");}
        else {
            System.out.println("Access complete!!");
        }
    }

    //ArithmeticException, FileNotFoundException,ArrayIndexOutOfBoundException

 public static void main(String[] args) {
    checkResult(20);
  
 }

}