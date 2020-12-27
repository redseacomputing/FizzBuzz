import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BuzzClassTest {

    BuzzClass buzzer;

    @BeforeEach
    void setUp() {
        buzzer = new BuzzClass();
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    void buzzer_should_work_with_multiples_of_15(int args) {
        assertEquals("FIZZBUZZ", buzzer.process(args));
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 50, 100, 25, 35, 20, 70, 95, 85,100})
    void buzzer_should_work_with_multiples_of_5(int args) {
        assertEquals("BUZZ", buzzer.process(args));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 33, 99, 66, 48, 51, 21, 42})
    void buzzer_should_work_with_multiples_of_3(int args) {
        assertEquals("FIZZ", buzzer.process(args));
    }

    @Test
    void test_zero_with_that_function() {
        assertEquals("infinitive",buzzer.process(0) );
    }

    @Test
    void test_normal_numbers() {
        for(int i = 1; i<=100;i++){
            int number = normalNumbersForBuzzer(i);
            assertEquals(String.valueOf(number),buzzer.process(number) );
        }
    }

    private int normalNumbersForBuzzer(int  number){
        if(number % 3 == 0 || number % 5 == 0 ){ return 1;}
            else return number;
        }
    }
