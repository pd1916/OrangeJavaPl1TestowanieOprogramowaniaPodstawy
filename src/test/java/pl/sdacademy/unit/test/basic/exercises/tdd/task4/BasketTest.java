package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private Basket basket;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void initData() {
        basket = new Basket(3);
        book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
    }

    @Test
    void shouldReturnAllAddedBooksFromBasket() {
        //given
        Book[] expectedResult = {book1, book2, book3};
        //when
        Book[] result = basket.getAllBooks();
        //then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldRemoveAllAddedBooksFromBasket() {
        //given
        Book[] expectedResult = {null, null, null};
        //when
        basket.cleanBasket();
        Book[] result = basket.getAllBooks();
        //then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnTotalAmount() {
        //when
        float result = basket.getTotalAmount();
        //then
        assertEquals(225, result);
        assertThat(result).isEqualTo(225);
    }

    @Test
    void shouldNotAddBookWhenBasketIsFull() {
        //given
        Book book4 = new Book("qwerty", new Author("eee", "fff"), 100);
        //when
        boolean result = basket.addBook(book4);
        //
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldAddBookWhenBasketIsNotFull() {
        //given
        Basket basket = new Basket(2);
        //when
        Book book1 = new Book("qwerty", new Author("eee", "fff"), 100);
        boolean result = basket.addBook(book1);
        //
        assertTrue(result);
        assertThat(result).isTrue();
    }
}