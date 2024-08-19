
abstract class Book {
    public String title;
    public String author;

    public boolean isBorrowed;

    public boolean isReserved;

    public boolean isPrinted;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void isBorrowed() {
        if (isBorrowed)
            System.out.println(title + "is borrowed " );
        else
            System.out.println(title + "is not borrowed ");
    }

    public void isReserved() {
        if (isReserved)
            System.out.println(title + "is reserved " );
        else
            System.out.println(title + "is not reserved ");
    }

    public void isPrinted() {
        if (isPrinted)
            System.out.println(title + " is printed " );
        else
            System.out.println(title + " is not printed ");
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You borrowed " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }

    public void ReserveBook() {
        if (isBorrowed) {
            isReserved = true;
            System.out.println("you reserved " + title);
        }
        else {
            System.out.println("the book is available you can borrow it instead");
        }
    }

    public void returnBook() {
        isBorrowed = false;
        System.out.println("You returned " + title);
    }
}
