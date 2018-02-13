/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Shalitha Suranga
 */
public class Book  extends Item{
    
    private String author;
    private String publisher;
    
    public Book(int itemId, int year, String title){
        super(itemId, year, title);
    }

    @Override
    public String toString() {
        return "Book{id=" + super.getItemId() + ", title=" + super.getTitle()+ ", year=" + super.getYear()  + ", author=" + author + ", publisher=" + publisher + '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
