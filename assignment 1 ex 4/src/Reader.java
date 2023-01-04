public class Reader {
    private String fullName;
    private int cardId;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public class Book{
        private String bookName;
        private String authorName;

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getBookName(){
            return bookName;

        }
    }

    public void takeBook(int number) {
        System.out.println(fullName + " took " + number + " books.");
    }

    public void takeBook(String... booksTaken) {
        System.out.println(fullName + " took " + " books: ");
        for (int i = 0; i < booksTaken.length - 2; i++) {
            System.out.print(booksTaken[i] + ",");
        }
        System.out.println(booksTaken[booksTaken.length - 1]);
    }

    public void takeBook(Book... booksTaken) {
        System.out.println(fullName + " took " + " books: ");
        for (int i = 0; i < booksTaken.length - 2; i++) {
            System.out.print(booksTaken[i].getBookName() + ",");
        }
        System.out.println(booksTaken[booksTaken.length - 1].getBookName());
    }

    public void returnBook(String... booksReturned) {
        System.out.println(fullName + " returned the books: ");
        for (int i = 0; i < booksReturned.length - 2; i++) {
            System.out.print(booksReturned[i] + ",");
        }
        System.out.println(booksReturned[booksReturned.length - 1]);
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
