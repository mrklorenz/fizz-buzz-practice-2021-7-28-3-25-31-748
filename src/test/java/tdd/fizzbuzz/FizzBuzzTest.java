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
}
