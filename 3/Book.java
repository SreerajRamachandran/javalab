import java.util.Scanner;
class Publisher {
private String name;

public Publisher(String name) {
    this.name = name;
}

public void display() {
    System.out.println("Publisher: " + name);
}

}

class Books extends Publisher {
private String title;
private String author;

public Books(String title, String author, String publisher) {
    super(publisher);
    this.title = title;
    this.author = author;
}

public void display() {
    super.display();
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
}

}

class Literature extends Books {
private String genre;

public Literature(String title, String author, String publisher, String genre) {
    super(title, author, publisher);
    this.genre = genre;
}

public void display() {
    super.display();
    System.out.println("Genre: " + genre);
}

}

class Fiction extends Books {
private String subgenre;

public Fiction(String title, String author, String publisher, String subgenre) {
    super(title, author, publisher);
    this.subgenre = subgenre;
}

public void display() {
    super.display();
    System.out.println("Subgenre: " + subgenre);
}

}

public class Book{
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println();
System.out.println("Enter the details of the Literature Book");
System.out.println("enter then name of the Book:");
String LiteratureBook=sc.nextLine();
System.out.println("enter then name of the Author:");
String LiteratureAuthor=sc.nextLine();
System.out.println("enter then name of the Publisher:");
String LiteraturePublisher=sc.nextLine();
System.out.println("enter then name of the Subgenre:");
String LiteratureSubgenre=sc.nextLine();
System.out.println();

System.out.println("Enter the details of the Fiction Book:");
System.out.println("Enter then name of the Book:");
String FictionBook=sc.nextLine();
System.out.println("Enter then name of the Author:");
String FictionAuthor=sc.nextLine();
System.out.println("Enter then name of the Publisher:");
String FictionPublisher=sc.nextLine();
System.out.println("Enter then name of the Subgenre:");
String FictionSubgenre=sc.nextLine();
Literature book1 = new Literature(LiteratureBook,LiteratureAuthor,LiteraturePublisher,LiteratureSubgenre);
Fiction book2 = new Fiction(FictionBook,FictionAuthor,FictionPublisher,FictionSubgenre);
    book1.display();
    System.out.println();
    book2.display();
}

}