import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before() {
        book = new Book(Genre.CRIME);
        borrower = new Borrower();
    }

    @Test
    public void canAddABook() {
        borrower.addBook(book);
        assertEquals(1, borrower.getBookCount());
    }


}
