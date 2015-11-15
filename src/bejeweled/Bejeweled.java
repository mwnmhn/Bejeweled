/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejeweled;

/**
 *
 * @author Dannemp
 */
public class Bejeweled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plateau testPlateau=new Plateau(5);
        testPlateau.fillPlateau();
        testPlateau.printTable();
        testPlateau.printTableReverse();
    }
    ////
}
