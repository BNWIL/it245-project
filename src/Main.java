public class Main {
    public static void main(String[] args) {
        BookHashTable hashTable = new BookHashTable(10);

        Book book1 = new Book(
                101,
                "Data Structures",
                "Mark Allen Weiss",
                2014
        );

        Book book2 = new Book(
                102,
                "Introduction to Algorithms",
                "Thomas Cormen",
                2022
        );

        // ID 111 causes a collision with ID 101
        Book book3 = new Book(
                111,
                "Java Programming",
                "Joyce Farrell",
                2023
        );
        
Book book4 = new Book(
        95,
        "Database System Concepts",
        "Abraham Silberschatz",
        2019
);

        hashTable.insertBook(book1);
        hashTable.insertBook(book2);
        hashTable.insertBook(book3);
        hashTable.insertBook(book4);
        
        // Test a duplicate ID
        Book duplicateBook = new Book(
                101,
                "Computer Science",
                "John Smith",
                2020
        );

        hashTable.insertBook(duplicateBook);

        // Search for an existing book
        System.out.println("\nSearching for Book ID 111:");

        Book foundBook = hashTable.searchBook(111);

        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Search for a missing book
        System.out.println("\nSearching for Book ID 999:");

        foundBook = hashTable.searchBook(999);

        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("Book not found.");
        }

        hashTable.displayBooks();

        // Test Binary Search Tree insertion
        System.out.println("\n--- Binary Search Tree Insertion Test ---");

        BookBST bookBST = new BookBST();

        bookBST.insertBook(book1);
        bookBST.insertBook(book2);
        bookBST.insertBook(book3);
        bookBST.insertBook(book4);

        // Test a duplicate Book ID
        bookBST.insertBook(duplicateBook);

        // Search BST for an existing book
        System.out.println("\nSearching BST for Book ID 111:");

        Book bstFoundBook = bookBST.searchBook(111);

        if (bstFoundBook != null) {
            System.out.println(bstFoundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Search BST for a missing book
        System.out.println("\nSearching BST for Book ID 999:");

        bstFoundBook = bookBST.searchBook(999);

        if (bstFoundBook != null) {
            System.out.println(bstFoundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Display BST books in ascending Book ID order
        bookBST.displayBooksInOrder();
    }
}
