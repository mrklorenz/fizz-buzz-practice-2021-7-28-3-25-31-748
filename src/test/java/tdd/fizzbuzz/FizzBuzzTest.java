package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void given_order_number_when_normal_case_then_return_order_number(){
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("1");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_3_then_return_fizz(){
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("Fizz");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_5_then_return_buzz(){
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("Buzz");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_7_then_return_whizz(){
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("Whizz");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_3_and_5_then_return_FizzBuzz(){
        int orderNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("FizzBuzz");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_3_and_7_then_return_FizzWhizz(){
        int orderNumber = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("FizzWhizz");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_5_and_7_then_return_BuzzWhizz(){
        int orderNumber = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("BuzzWhizz");
    }

    @Test
    public void given_orderNum_when_isMultiple_of_3_5_and_7_then_return_FizzBuzzWhizz(){
        int orderNumber = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = fizzBuzz.countOff(orderNumber);

        assertThat(expectedResult).isEqualTo("FizzBuzzWhizz");
    }
}
