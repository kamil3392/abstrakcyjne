/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author Kamil
 */
public class TextImporter implements Importer {
    private Data data;
      
    public void ImportData(Data data) {
        this.data = data;
    }
    
    public String ImportedText() {
        
        return this.data.Text();
        
    }
    
}