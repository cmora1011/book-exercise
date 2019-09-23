/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Chris Mora
 * @version 9/16/19
 */
class Book {
    
    private String author;
    private String title;
    private int pages;
    private int borrowed;
    private String refNumber;
    private boolean courseText;

    
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNumber, boolean course) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = course;
    }

    
    public String getAuthor() {
        return author;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void printAuthor() {
        System.out.println("The Author is " + author);
    }

    
    public void printTitle() {
        System.out.println("The Title is " + title);
    }

    
    public int getPages() {
        return pages;
    }

    
    public void SetRefNumber(String ref) {
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Sorry, Reference number needs to be at least 3 characters.");
        }
    }

    
    public String getRefNumber() {
        return refNumber;
    }

    
    public void borrow() {
        borrowed = borrowed + 1;
    }

    
    public int getBorrowed() {

        return borrowed;
    }

    
    public boolean isCourseText() {

        return courseText;
    }

    public void printDetails() {

        {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Number of Pages: " + pages);
            System.out.println("Amount of times borrowed: " + borrowed);
            System.out.println("Reference number: " + refNumber);
            if (refNumber.length() > 0) {
                System.out.println("Reference number: " + refNumber);
            } else {

                System.out.println("Reference number: ZZZ");
            }
        }

    }
}
