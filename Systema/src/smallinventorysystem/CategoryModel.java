/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smallinventorysystem;

/**
 *
 * @author Pc
 */
public class CategoryModel {
    
    int id;
    String category;

    public CategoryModel(int id, String category){
        this.id = id;
        this.category = category;
    }
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
