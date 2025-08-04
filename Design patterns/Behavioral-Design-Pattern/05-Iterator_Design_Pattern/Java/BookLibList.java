
import java.util.*;

interface Iterator1{
    public Boolean hasNext();
    public Object next();
}

class BookIterator implements Iterator1{
    private List<Book> books;
    private Integer currentIndex;

    BookIterator(List<Book> lis){
        books = lis;
        currentIndex = 0;
    }

    public Boolean hasNext(){
        return currentIndex < books.size();
    }

    public Object next(){
        if(!this.hasNext()) return null;
        Book temp = books.get(currentIndex);
        currentIndex++;
        return temp;
    }

}

class Book{
    private String bookName;
    private String subject;
    private int price;

    Book(String bookname, String subject, int price){
        this.bookName = bookname;
        this.subject = subject;
        this.price = price;
    }

    public String getBookName(){
        return bookName;
    }
    public String getSubjectName(){
        return subject;
    }
    public int getBookPrice(){
        return price;
    }

    public void print(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Subject: "+subject);
        System.out.println("Book price: "+price);
        System.out.println("");
    }
}

class Library{
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    Iterator1 createIterator(){
        Iterator1 it = new BookIterator(books);
        return it;
    }
    
}

public class BookLibList{
    public static void main(String[] args) {
        List bookLis = new ArrayList<>();
        bookLis.add(new Book("Galvin", "OS", 900));
        bookLis.add(new Book("Taninbom", "OS", 1000));
        bookLis.add(new Book("Taninbom", "CN", 800));
        bookLis.add(new Book("GOF", "LLD", 1100));
        
        Library library = new Library(bookLis);

        Iterator1 it = library.createIterator();

        while(it.hasNext()){
            Book bk = (Book)it.next();
            bk.print();
        }
    }
}