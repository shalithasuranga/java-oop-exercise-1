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
public class CD extends Item {
    
    private String singer;
    private String recordCompany;
    
    public CD(int itemId, int year, String title){
        super(itemId, year, title);
    }
    
    @Override
    public String toString() {
        return "CD{id=" + super.getItemId() + ", title=" + super.getTitle() +  ", year=" + super.getYear() + ", recordCompany=" + recordCompany + ", singer=" + singer + '}';
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }
}
