public class Member extends User {
    public Member (String Name) {
        this.Name = Name;
        this.Status = "Member";
    }

    public String getName() {
        return Name;
    }

    public String getStatus() {
        return Status;
    }

    public boolean isMember() {
        return (getStatus().equals("Member"));
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed) {
            book.isBorrowed = true;
            System.out.println("You borrowed " + book.title);
        } else {
            System.out.println("Sorry, " + book.title + " is already borrowed.");
        }
    }

    public void ReserveBook(Book book) {
        if (book.isBorrowed) {
            book.isReserved = true;
            System.out.println("you reserved " + book.title);
        }
        else {
            System.out.println("the book is available you can borrow it instead");
        }
    }

    public void returnBook(Book book) {
        book.isBorrowed = false;
        System.out.println("You returned " + book.title);
    }
}
