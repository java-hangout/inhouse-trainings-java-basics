package com.jh.igniteprogram.java.basics.day01;

public class ClassAndObjectProgram02 {

    // A class with encapsulation of fields using private access modifier
    public static class Book {
        private String title;
        private String author;

        // Getter for title
        public String getTitle() {
            return title;
        }

        // Setter for title
        public void setTitle(String title) {
            this.title = title;
        }

        // Getter for author
        public String getAuthor() {
            return author;
        }

        // Setter for author
        public void setAuthor(String author) {
            this.author = author;
        }

        // Method to get book details
        public String getBookDetails() {
            return "Title: " + title + ", Author: " + author;
        }
    }

    public static String run(String title, String author) {
        // Creating a Book object and setting values via setters
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        
        // Returning the details of the book
        return book.getBookDetails();
    }
}