/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Form.Manga;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class mangaModel {
    private static ArrayList<Manga> mangas = new ArrayList<>();
    
    
    public static void addManga(Manga object) {
        mangas.add(object);
    }
    
    public static ArrayList<Manga> getManga() {
        return mangas;
    }
    
    
}
