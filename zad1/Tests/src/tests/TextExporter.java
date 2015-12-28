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
public class TextExporter implements Exporter {
    
    private Data data;
    
    public TextExporter(String textToBeExported){
        this.data = new TextData(textToBeExported);
    }
    
    public Data ExportData() {
        
        if (data == null) {
            return new TextData("");
        }
        
        Data exportedData = data;
        data = null;
        return exportedData; 
    }
    
}