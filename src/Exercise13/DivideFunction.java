package Exercise13;

public class DivideFunction {
    private static int  defaultDivisor=1;
    public DivideFunction(){};
    static public int divide(int divident,int divisor){
        int result=0;
        try {
            result = divident/divisor;
        }catch(ArithmeticException e){
            System.out.println("Exception ocurred because divisor is equals to:"+divisor);
            result = divident/defaultDivisor;
        }
        return result;
    }
}
