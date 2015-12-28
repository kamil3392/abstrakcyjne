/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Kamil
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            TripleList<Integer> tripleList = new TripleList<>();
            int value1 = 1;
            int value2 = 2;
            int value3 = 3;
            int value4 = 4;
            int value5 = 5;
            tripleList.add(value1);
            tripleList.add(value2);
            tripleList.add(value3);
            tripleList.add(value4);
            tripleList.add(value5);
            
            System.out.println(tripleList.Counting());
            
            // Testy w Test Packages
    }
    
}
