package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price); // Item 클래스로부터 name, price를 상속받는다.
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print(); // 먼저 부모 Item의 print()메서드를 출력
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}
