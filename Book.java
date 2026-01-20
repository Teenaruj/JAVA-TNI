public class Book {
    private String title;
    private int totalBook;
    private int availableBook;

    Book(String title, int totalBook) {
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }
    Book(String title) {
        this(title, 0);
    }
    Book() {
        this("", 0);
    }
    String getTitle() {
        return title;
    }
    int getTotalBook() {
        return totalBook;
    }
    int getAvailableBook() {
        return availableBook;
    }
    void borrowBook() {
        if (availableBook > 0) {
            availableBook--;
        }
    }
    void returnBook() {
        if (availableBook < totalBook) {
            availableBook++;
        }
    }
}
