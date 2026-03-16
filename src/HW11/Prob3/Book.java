package HW11.Prob3;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("ISBN='").append(ISBN).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isBorrowed=").append(isBorrowed);
        sb.append('}');
        return sb.toString();
    }
}
