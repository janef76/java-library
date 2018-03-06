import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book(Genre.CRIME);
        library = new Library(3);
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getbookCount());
    }

    @Test
    public void cantAddMoreThanCapacity() {
        for(int i = 0; i<5; i++) {
            library.addBook(book);
        };
        assertEquals(3, library.getbookCount());

    }

}
