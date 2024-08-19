public class Librarian extends User {
    public Librarian (String Name) {
        this.Name = Name;
        this.Status = "Librarian";
    }

    public boolean isMember() {
        return (getStatus().equals("Librarian") );
    }

    public void addeBook (Book book) {
        Book book1 = new eBook(book.title, book.author);
    }

    public void addPrintedBook (Book book) {
        Book book1 = new printedBook(book.title, book.author);
    }
}
