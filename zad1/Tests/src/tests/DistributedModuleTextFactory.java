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
public class DistributedModuleTextFactory implements DistributedModuleFactory{
    
    private String text;
    
    public DistributedModuleTextFactory(String textToForFactory) {
        this.text = textToForFactory;
    }

    @Override
    public Data CreateData() {
        return new TextData(text);
    }

    @Override
    public Exporter CreateExporter() {
        return new TextExporter(text);
    }

    @Override
    public Importer CreateImporter() {
        return new TextImporter();
    }
    
    
}
