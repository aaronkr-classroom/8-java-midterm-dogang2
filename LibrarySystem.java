public class LibrarySystem {
    private Book[] booklist;
    private static int bookCount = 0;
    private static final int NUM_BOOK = 10;

    public LibrarySystem() {
        this.booklist = new Book[NUM_BOOK]; //생성자
    }

    public void addBook(Book book) {
        if (bookCount < NUM_BOOK) {
            booklist[bookCount++] = book;
            System.out.println("'" + book.getTitle() + "' 도서가 추가되었습니다.");
            //책 추가
        } else {
            System.out.println("도서 목록이 가득 찼습니다. 더 이상 추가할 수 없습니다.");
            //mCartItem[mCartCount++] = new CartItem(book);
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (booklist[i].getTitle().equals(title)) {
                for (int j = i; j < bookCount - 1; j++) {
                    booklist[j] = booklist[j + 1];
                }
                booklist[--bookCount] = null;
                System.out.println("라이브러리에서 '" + title + "' 삭제했습니다."); 
                //책 삭제
                return;
            }
        }
        System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
    }

    public void borrowBook(String title) {
        // 도서 대출 구현
    	for (int i = 0; i < bookCount; i++) {
            if (booklist[i].getTitle().equals(title)) {
            	if (booklist[i].isAvailable()) {
            		booklist[i].setAvailable(false);
            		System.out.println("빌렸습니다.");
            	}
            	else {
            		System.out.println("이미 빌렸습니다.");
            	}
                return;
            }
        }
        System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
    }

    public void returnBook(String title) {
        // 도서 반납 구현
    	for (int i = 0; i < bookCount; i++) {
            if (booklist[i].getTitle().equals(title)) {
            	if (!booklist[i].isAvailable()) {
            		booklist[i].setAvailable(true);
            		System.out.println("반납했습니다.");
            	}
            	else {
            		System.out.println("이미 반납했습니다.");
            	}
            	return;
            }
        }
        System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
    }

    public void displayAllBooks() {
        for (Book book : booklist) {
            if (book != null) {
            	Book book1 = new LibraryBook("ISBN1234", "JSP 웹 프로그래밍", "송미영", 2018);
        		Book book2 = new LibraryBook("ISBN1235", "안드로이드 프로그래밍", "우재남", 2022);
        		Book book3 = new LibraryBook("ISBN1236", "스크래치 프로그래밍", "고광일", 2019);
        		Book book4 = new LibraryBook("ISBN1237", "JAVA 마스터", "송미영", 2023);
            }
        }
    }
}