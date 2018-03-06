import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

//    private Genre genre;
    private Book book;

    @Before
    public void Before() {
        book = new Book(Genre.CRIME);
    }

    @Test
    public void canGetGenre() {
        assertEquals(Genre.CRIME, book.getGenre());
    }
}
