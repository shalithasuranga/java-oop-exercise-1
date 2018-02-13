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
public class Item {
    
    private int itemId;
    private int year;
    private String title;

    public int getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        return "Item{" + "itemId=" + itemId + ", year=" + year + ", title=" + title + '}';
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public Item(int itemId, int year, String title){
        this.itemId = itemId;
        this.year = year;
        this.title = title;
    }
    
}
