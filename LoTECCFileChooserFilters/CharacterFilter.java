/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoTECCFileChooserFilters;

import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Lenovo
 */
    public class CharacterFilter extends FileFilter {
    private String extension;
    private String description;
    private ArrayList<String>extensions=new ArrayList<>();
 
    public CharacterFilter(String description, ArrayList<String>array) {
        for(String s : array)
        {
            extensions.add(s);
        };
        this.description = description;
    }
 
    @Override
    public boolean accept(File file) {
      int extensionspan = extensions.size();
        for(int i=0; i<extensionspan; i++)
            if(file.getName().equals(extensions.get(i)+".properties")) 
                return true;
        
        return false;
    }
 
    //static void compareSmarts(){};
        /**
         *
         * @return
         */
        @Override
    public String getDescription() {
        return description + String.format(" (*%s)", extension);
    }
    } 