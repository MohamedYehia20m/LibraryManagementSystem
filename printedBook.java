public class printedBook extends Book{

    public printedBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.isReserved = false;
        this.isPrinted = true;

    }
}
