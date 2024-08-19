public class eBook extends Book{

    public eBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.isReserved = false;
        this.isPrinted = false;
    }
}
