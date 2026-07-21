import java.util.LinkedList;

public class BookHashTable {
    private LinkedList<Book>[] table;

    @SuppressWarnings("unchecked")
    public BookHashTable(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException(
                    "Table size must be greater than zero."
            );
        }

        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int bookId) {
        return Math.floorMod(bookId, table.length);
    }

    public void insertBook(Book book) {
        if (book == null || book.getBookId() <= 0) {
            System.out.println("Invalid book information.");
            return;
        }

        if (containsBook(book.getBookId())) {
            System.out.println("Book ID already exists.");
            return;
        }

        int index = hash(book.getBookId());
        table[index].add(book);

        System.out.println("Book added successfully.");
    }

    public Book searchBook(int bookId) {
        int index = hash(bookId);

        for (Book book : table[index]) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    public boolean containsBook(int bookId) {
        return searchBook(bookId) != null;
    }

    public void displayBooks() {
        boolean empty = true;

        System.out.println("\nBooks stored in the Hash Table:");

        for (LinkedList<Book> bucket : table) {
            for (Book book : bucket) {
                System.out.println(book);
                empty = false;
            }
        }

        if (empty) {
            System.out.println("No books are currently stored.");
        }
    }
}
