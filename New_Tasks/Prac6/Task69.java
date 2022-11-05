
public class Task69 {
    public static void main(String[] args) {

        Printable[] array = { new Book("book1"), new Book("book2"), new Shop("shop1") };

        for (Printable item : array) {
            item.print();
        }

    }
}

interface Printable {
    void print();
}

class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}

class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
