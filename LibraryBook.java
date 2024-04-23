/*public interface LibraryBook implements Book { //
	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;

	public LibraryBook(Book book) {
	    // 생성자
		this.isbn = book.getIsbn(); ///
		this.available = true;
	}
	
	public LibraryBook(String isbn, String title, String author, int year) {
	    // 생성자
		this.isbn = book.getIsbn();
		this.available = true;
	}

	@Override
	public String getIsbn(); // return isbn
	public String getTitle(); // return title
	public String getAuthor(); // return author
	public int getYear(); // return year
	public boolean isAvailable(); // return available
	public void setAvailable(boolean available);
}
*/
public class LibraryBook implements Book {
    private String isbn;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public LibraryBook(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.year = book.getYear();
        this.available = true;
    }

    public LibraryBook(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}