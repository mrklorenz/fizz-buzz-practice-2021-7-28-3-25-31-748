package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {

        if (orderNumber % 3 == 0 && orderNumber % 5 == 0 && orderNumber % 7 == 0) return "FizzBuzzWhizz";
        if (orderNumber % 5 == 0 && orderNumber % 7 == 0) return "BuzzWhizz";
        if (orderNumber % 3 == 0 && orderNumber % 5 == 0) return "FizzBuzz";
        if (orderNumber % 3 == 0 && orderNumber % 7 == 0) return "FizzWhizz";
        if (orderNumber % 3 == 0) return "Fizz";
        if (orderNumber % 5 == 0) return "Buzz";
        if (orderNumber % 7 == 0) return "Whizz";

        return String.valueOf(orderNumber);
    }
}
