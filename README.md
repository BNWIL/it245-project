# IT245 Book Inquiry System

This repository contains the source code for our IT245 Data Structures project.

The project compares two solutions for organizing and searching book records:

1. Hash Table
2. Binary Search Tree

## Current Status

The group has created the Book class and implemented the initial Hash Table insertion operation using Java. Duplicate Book IDs are currently rejected.

## Team Members

- Member 1: [OMAR KHALID - s240068665]
- Member 2: [AHMED ALZAHRANI - s240022816]
- Member 3: [TALAL ALMUTAIRI - s240040240] 



## System Operations

- Insert a new book
- Search using Book ID
- Display a selected book
- Display all stored books

## Book Information

Each book contains:

- Book ID
- Title
- Author
- Publication year

## Planned Solutions

1. Hash Table using Book ID as the key
2. Binary Search Tree organized by Book ID

 ## Current Progress

The following parts have been completed:

- Created the `Book` class
- Implemented Hash Table insertion and search
- Added collision handling using separate chaining
- Added the display-books operation
- Created the Binary Search Tree structure
- Implemented BST insertion
- Tested duplicate Book IDs

## Project Files

- `Book.java` – Stores book information
- `BookHashTable.java` – Implements the Hash Table
- `BookNode.java` – Represents a BST node
- `BookBST.java` – Implements the Binary Search Tree
- `Main.java` – Tests both solutions

## Binary Search Tree Complexity

- Insert: O(log n) when balanced, O(n) worst case
- Search: O(log n) when balanced, O(n) worst case
- In-order traversal: O(n)
- Space complexity: O(n)

## Solution Comparison

The Hash Table provides O(1) average search and insertion,
while the Binary Search Tree provides O(log n) search and
insertion when reasonably balanced.

For this Book Inquiry System, the Hash Table is preferred for
fast Book ID searches. The BST is useful when books need to
be displayed in sorted order.
