import MathUtil.MathUtil;

public class Main {

    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        try {
            float division1 = mathUtil.divide(10,0);
            System.out.println(division1);
        }
        catch (ArithmeticException e){
            System.err.println("Error" + e);
        }
    }

}


