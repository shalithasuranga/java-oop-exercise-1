/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Shalitha Suranga
 */
public class MainFormController {
    public static ArrayList<Object> items;
    
    
    static {
        items = new ArrayList<Object>();
    }
    
    
    public static void addBook(int itemId, int year, String title, String publisher, String author){
        Book b = new Book(itemId, year, title);
        b.setAuthor(author);
        b.setPublisher(publisher);
        items.add(b);
    }
    
    public static void addCD(int itemId, int year, String title, String company, String singer){
        CD c = new CD(itemId, year, title);
        c.setRecordCompany(company);
        c.setSinger(singer);
        items.add(c);
    }
    
    
    public static void renderItems(JTextArea textbox){
        textbox.setText(null);
        for(Object item : items){
            textbox.append("\n" + item.toString());
        }
    }
    
}
