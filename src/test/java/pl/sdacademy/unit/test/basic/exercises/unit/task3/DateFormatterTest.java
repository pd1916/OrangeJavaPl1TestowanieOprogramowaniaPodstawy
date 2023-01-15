package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFormatterTest {

    @Test
    void shouldReturnCorrectFormatDate() {
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(2012, 12, 20);
        String expectedResult = "2012-20-12";
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

}