import java.util.ArrayList;

public class Borrower {
        private ArrayList<Book> lists;


    public Borrower() {
        this.lists = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.lists.add(book);
    }

    public int getBookCount() {
        return this.lists.size();
    }

}
