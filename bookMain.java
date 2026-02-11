import java.util.ArrayList;
public class bookMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book b1 = new Book();
        b1.title = "Harry Potter and The Chamber of Secrets";
        b1.author = "JK Rowling";
        b1.genre = "fantasy";
        b1.ISBN = "133887893X";
        b1.price = 12.99;
        books.add(b1);
        Book b2 = new Book("The Boy Who Harnessed The Wind", "William Kamkwamba", "Non-Fiction");
        books.add(b2);
        Book b3 = new Book("0689818769", 8.99);
        books.add(b3);
        Book b4 = new Book();
        books.add(b4);
        Book b5 = new Book(b1);
        books.add(b5);

        for(Book b: books){
            System.out.println("\nName:" + b.title);
            System.out.println("Author:" + b.author);
            System.out.println("Genre:" + b.genre);
            System.out.println("ISBN:" + b.ISBN);
            System.out.println("Price:" + b.price);

        }

    }

}
