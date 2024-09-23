//java exam C and D batch
//library management 
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}

class EBook extends Book {
    private double fileSize; 

    public EBook(String title, String author, String ISBN, double fileSize) {
        super(title, author, ISBN); 
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}

interface LibraryOperations {
    void addBook(Book book);
    Book findBookByTitle(String title);
}

class Library implements LibraryOperations {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        if (book == null) {
            throw new NullPointerException("Book cannot be null");
        }
        books.add(book);
    }

    @Override
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new IllegalArgumentException("Book not found");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "1234");
        EBook ebook1 = new EBook("Digital Fortress", "Dan Brown", "5678", 1.2);

        library.addBook(book1);
        library.addBook(ebook1);

        try {
            Book foundBook = library.findBookByTitle("Harry Potter");
            System.out.println("Book found: " + foundBook.getTitle());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
