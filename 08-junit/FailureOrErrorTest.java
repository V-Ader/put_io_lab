package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void test1(){
        assertEquals(5,2);
    }

    @Test
    public void test2() throws Exception {
        try{
            int k = 1/ 0;
        }catch(Exception e){
            throw new Exception(e);
        }
    }

    @Test
    public void test3(){
        try{
            assertEquals(1,0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}