package pl.sdacademy.unit.test.basic.exercises.unit.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private final static Address address = new Address("Dworcowa", "Gdynia");

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
        Person person = new Person("Jan", "Kowalski", 0, address);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfAgeIs18() {
        //given
        Person person = new Person("Jan", "Kowalski", 18, address);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfAgeIsGreaterThan18() {
        //given
        Person person = new Person("Jan", "Kowalski", 19, address);
        //when
        boolean result = person.isChild();
        //then
        assertFalse(result); //jUnit
        assertThat(result).isFalse(); //assertJ
    }

}