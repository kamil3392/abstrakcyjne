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
public class TextData implements Data {
    
    private String text;
    
    public TextData(String text) {
        this.text = text;
    }
    
    public String Text() {
        return text;
    }
    
}
