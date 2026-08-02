public class BookBST {
    private BookNode root;

    public BookBST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insertBook(Book book) {
        if (book == null || book.getBookId() <= 0) {
            System.out.println("Invalid book information.");
            return;
        }

        BookNode newNode = new BookNode(book);

        if (root == null) {
            root = newNode;
            System.out.println("Book added to BST successfully.");
            return;
        }

        BookNode current = root;

        while (true) {
            int newId = book.getBookId();
            int currentId = current.getBook().getBookId();

            if (newId == currentId) {
                System.out.println("Book ID already exists in BST.");
                return;
            }

            if (newId < currentId) {
                if (current.getLeft() == null) {
                    current.setLeft(newNode);
                    System.out.println("Book added to BST successfully.");
                    return;
                }

                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(newNode);
                    System.out.println("Book added to BST successfully.");
                    return;
                }

                current = current.getRight();
            }
        }
    }

    public Book searchBook(int bookId) {
        BookNode current = root;

        while (current != null) {
            int currentId = current.getBook().getBookId();

            if (bookId == currentId) {
                return current.getBook();
            } else if (bookId < currentId) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return null;
    }

    public boolean containsBook(int bookId) {
        return searchBook(bookId) != null;
    }

    public void displayBooksInOrder() {
        if (root == null) {
            System.out.println("No books are stored in the BST.");
            return;
        }

        System.out.println("\nBooks stored in the BST:");
        displayBooksInOrder(root);
    }

    private void displayBooksInOrder(BookNode node) {
        if (node != null) {
            displayBooksInOrder(node.getLeft());
            System.out.println(node.getBook());
            displayBooksInOrder(node.getRight());
        }
    }
}
