package MathUtil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class MathUtilTest {
    @Test
        public void add_PositiveInt_Summed(){
            MathUtil  mathUtil = new MathUtil();
            assertEquals(2, mathUtil.addArray(new int[] {1,1}));
        }


    @Test
        public void convertStringToInt_PositiveNums() throws Exception {
            MathUtil  mathUtil2 = new MathUtil();
            assertEquals(3, mathUtil2.convertStringToInt(new String("3")));
    }

    @Test
        public void convertStringToInt_StringExceptionRaises(){
            MathUtil mathUtil3 = new MathUtil();
            assertThrows(Exception.class, () -> mathUtil3.convertStringToInt("e"));
    }

    @Test
        public void divide_ZeroExceptionRaises(){
            MathUtil mathUtil4 = new MathUtil();
            assertThrows(ArithmeticException.class, () -> mathUtil4.divide(10,0));

    }

    @Test
    public void divide_NormalIntWorks(){
        MathUtil mathUtil5 = new MathUtil();
        assertEquals(5, mathUtil5.divide(10,2));

    }


    }
