public class ExceptionHandling{
 public static void main(String[] args) {
    
    try { 
        int sum = 5 / 0 ;    //ArithmeticException   
        int[] a ={5,6,7};   
        System.out.println(a[7]);  // ArrayIndexOutOfBoundException
        
    }
    catch(ArrayIndexOutOfBoundsException e) // Exception - built in class
    {
        System.out.println("array index error!"+ e.getMessage());
    }
    catch(ArithmeticException  e) // Exception - built in class
    {
        System.out.println("arithmetic error!"+ e.getMessage());
    }
       catch(Exception  e) // Exception - built in class
    {
        System.out.println("EXCEPTION-"+ e.getMessage());
    }

        finally {
        System.out.println("program finished");
    }
 }
}
