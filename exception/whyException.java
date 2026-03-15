public class whyException{

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
    
    int arr[] = {1,2,3};
    try {
    checkResult(arr[7]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index is out of bounds!");
    }

 }

}