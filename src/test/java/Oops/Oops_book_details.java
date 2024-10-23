package Oops;

public class Oops_book_details {
    String title,author;
    int book_price;
    public void book_details_input(String title,String author,int book_price){
        this.title=title;
        this.author=author;
        this.book_price=book_price;
    }
    public void book_details_output(){
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
        System.out.println("Book Price = "+book_price);
    }

    public static void main(String[] args) {
        Oops_book_details book_details=new Oops_book_details();
        book_details.book_details_input("Java Programming","James Gosling",250);
        book_details.book_details_output();
        System.out.println("-----------------------------");
        Oops_book_details book_details1=new Oops_book_details();
        book_details1.book_details_input("Python","Guido van Rossum",450);
        book_details1.book_details_output();
    }
}
