import org.junit.Test;
import  static org.junit.Assert.assertArrayEquals;


public class TestSort {

    @Test
    public void testSort(){
        String[] input = {"I", "have", "an", "egg"};
    
        String[] expected = {"an", "egg", "have", "I"};

        Sort.sort(input);

        /*if (!java.util.Arrays.equals(input, expect)) {
         * System.out.println("Error! there seems  to  be a problem with  Sort.sort.");
        }*/
        //using jUnit
        assertArrayEquals(expected, input);
    }

    @Test
    /*Test the Sort.findSmallest method*/
    public void testFindSmallest(){
        String[] input = {"I", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"hola", "pam", "que", "haces"};
        int expected2 = 3;
        int actual2 = Sort.findSmallest(input2, 0);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    @Test
    public    void testSwap(){
        String[] input = {"hola", "pam", "que", "haces"};
        String[] expected = {"haces", "pam", "que", "hola"};
        Sort.swap(input, 0, 3);
        org.junit.Assert.assertArrayEquals(expected,input);
    }
}
