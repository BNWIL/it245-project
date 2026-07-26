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
}
