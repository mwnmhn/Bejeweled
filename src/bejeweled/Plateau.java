/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejeweled;
import java.util.*;
/**
 *
 * @author Dannemp
 */
public class Plateau {
    private LinkedList<LinkedList<Gem>> table;
    private int size;
    
    public Plateau(int n){
        size=n;
    }
    
    //fills the table with random gems
    public void fillPlateau(){
        table=new LinkedList<LinkedList<Gem>>();
        for (int i=0;i<size;i++){
            LinkedList<Gem> list=new LinkedList<Gem>();
            for(int j=0;j<size;j++){
                Gem g=new Gem();
                //table.add().add(Gem);
                list.add(g);
                        }
            table.add(list);
        }
    }
    //prints a simple numeric version of the table
    public void printTable(){
        System.out.println("Simple version of table");
        for (int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                System.out.print(table.get(i).get(j).getColor());
            }
            System.out.println();    
        }
        System.out.println();
    }
    //prints a reversed version of the table which would guarantee that added gems appear to be on top rather then at the bottom
    public void printTableReverse(){
        System.out.println("Reversed version of table");
        for (int i=size-1;i>=0;i--){
            for(int j=0;j<size;j++){
                System.out.print(table.get(i).get(j).getColor());
            }
            System.out.println();
        }
        System.out.println();
    }
}
