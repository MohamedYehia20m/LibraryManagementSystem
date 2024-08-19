public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book1 = new printedBook("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new eBook("1984", "George Orwell");

        book1.isPrinted();
        book1.isPrinted();

        Member member = new Member("John Doe");
        Librarian librarian = new Librarian("Jane Smith");

        member.borrowBook(book1);
        member.borrowBook(book2);

        librarian.addeBook(new eBook("Moby Dick", "Herman Melville"));
        member.borrowBook(book1); // Will show as already borrowed if not returned first

        member.returnBook(book1);
        member.borrowBook(book1); // Now the librarian can borrow it
    }
}