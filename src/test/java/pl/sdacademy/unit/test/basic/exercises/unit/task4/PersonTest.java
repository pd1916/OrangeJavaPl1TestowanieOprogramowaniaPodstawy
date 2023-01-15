package pl.sdacademy.unit.test.basic.exercises.unit.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private final static String NAME = "Jan";
    private final static String LASTNAME = "Kowalski";
    private final static Address ADDRESS = new Address("Dworcowa", "Gdynia");

    /*
    true:
    0
    18
    16

    false:
    19

     */

    @Test
    void shouldReturnTrueIfAgeIsZero() {
        //given
        Person person = new Person(NAME, LASTNAME, 0, ADDRESS);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfAgeIs18() {
        //given
        Person person = new Person(NAME, LASTNAME, 18, ADDRESS);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfAgeIsGreaterThan18() {
        //given
        Person person = new Person(NAME, LASTNAME, 19, ADDRESS);
        //when
        boolean result = person.isChild();
        //then
        assertFalse(result); //jUnit
        assertThat(result).isFalse(); //assertJ
    }

    @Test
    void shouldCreateCorrectPerson() {
        //given
        Person person = new Person(NAME, LASTNAME, -2, ADDRESS);
        int expectedResult = 0;
        //when
        int result = person.getAge();
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult);
    }

}