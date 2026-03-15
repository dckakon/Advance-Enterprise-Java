// inheritance 
class ResultException extends Exception {
    ResultException(String message)
    {
        super(message);   
    }
}

class HighTemperatureException extends Exception {
    HighTemperatureException(String message)
    {
        super(message);   
    }
}

public class CustomException{
    static void checkResult (int resultScore) throws ResultException {
        if( resultScore <40){
            throw new ResultException("Score is less than 40!");
        }
        else {
            System.out.println("Result"+ resultScore);
        }
    }

    public static void main(String []  args){
        try {
            checkResult(30);
        }
        catch (ResultException e){
            System.out.println("exception -- "+ e.getMessage());
        }
    }
}