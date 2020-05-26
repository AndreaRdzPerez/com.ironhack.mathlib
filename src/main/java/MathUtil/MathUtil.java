package MathUtil;

public class MathUtil {

        public int addArray(int[] intArray){
            int result = 0;
            try{
                for(int i=0; i<intArray.length;i++){
                    result+= intArray[i];
                        }
                    } catch (NullPointerException e){
                    System.err.println("Error null array");
            }

            return result;
        }

        public int convertStringToInt(String number) throws Exception{
            int result = 0;
            try {
                result = Integer.parseInt(number);
            }
            catch (Exception e) {
                throw new Exception ("It has to be a num");
            }
            return result;
        }

        public static float divide(int num1, int num2) throws ArithmeticException {
            return num1 / num2;
        }

}




