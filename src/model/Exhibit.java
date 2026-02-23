/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sarah
 */
public class Exhibit {
     private String title;
    private String description;
    private String mediaFile;

    public Exhibit(String title, String description, String mediaFile) {
        this.title = title;
        this.description = description;
        this.mediaFile = mediaFile;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMediaFile() {
        return mediaFile;
    }

   public String getDetails() {
    return "Title: " + title + "\nDescription: " + description;
}
    
    
    
    
    
    
    
    
    
    
}
