package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    //@BeforeAll
    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void test_add (){

        assertEquals(22, calculator.add(9,13));
        assertEquals(4, calculator.add(3,1));
    }

    @Test
    public void test_multiply (){

        assertEquals(3, calculator.multiply(1,3));
        assertEquals(9, calculator.multiply(3,3));
    }

    @Test
    public void test_add_positive(){

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
        calculator.addPositiveNumbers(-5,100);}, "Both arguments can not be negative");
        }
}

