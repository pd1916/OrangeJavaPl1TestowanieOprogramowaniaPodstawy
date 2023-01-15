package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoValues(){
        //given
        int firstDigit = 2;
        int secondDigit = 3;
        int expectedResult = 5;
        //when
        int result = calculator.add(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //AssertJ
    }

    @Test
    void shouldSubtractTwoValues(){
        //given
        int expectedResult = 6;
        //when
        int result = calculator.subtract(10, 4);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //AssertJ
    }

}