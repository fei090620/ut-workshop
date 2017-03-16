import org.junit.Assert;
import org.junit.Test;


/**
 * Created by yangzhou on 16/03/2017.
 */
public class FizzBuzzTest {
    @Test
    public void given_input_number_one_then_return_string_1() {
        int number = 1;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("1", result);
    }

    @Test
    public void given_input_number_3_then_return_string_Fizz() {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void given_input_number_5_then_return_string_Buzz(){
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void given_input_number_15_then_return_string_FizzBuzz(){
        int number = 15;
        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals("FizzBuzz",result);
    }
}
