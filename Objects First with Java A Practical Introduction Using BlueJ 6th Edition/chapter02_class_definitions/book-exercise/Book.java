
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Mr.Dr.Prof.AG
 * @version 31-10-2020
 */
public class Book {
    private String  author;
    private String  title;
    private int     pages;
    private String  refNumber;
    private int     borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    /**
     * Set book reference number.
     *
     * @param ref - reference number String must be at least
     *            three character long to be set
     */
    public void setRefNumber(String ref) {
        if (ref.length() >= 3) refNumber = ref;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void borrow() {
        borrowed++;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public boolean isCourseText() {
        return courseText;
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public void printDetails() {
        System.out.println(
            "Title: " + title +
            ", Author: " + author +
            ", Pages: " + pages +
            ", Reference #: " + (refNumber.length() > 0 ? refNumber : "ZZZ") +
            ", Times Borrowed: " + borrowed
        );
    }
}
