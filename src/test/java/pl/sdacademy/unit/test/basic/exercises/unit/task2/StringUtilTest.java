package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    /*
    true:
    " "
    null
    ""

    false:
    "ala ma kota"
    " a"
    "a "
    " a "

     */

    @Test
    void shouldReturnTrueIfInputContainsOnlySpace(){
        //given
        String input = " ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfInputIsNull(){
        //given
        String input = null;
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfInputIsEmpty(){
        //given
        String input = "";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfInputIsNotEmpty(){
        //given
        String input = "ala ma kota";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result); //jUnit
        assertThat(result).isFalse(); //assertJ
    }

}