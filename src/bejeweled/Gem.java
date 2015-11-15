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
public class Gem {
    private int color;
    private Random random=new Random();
    
    //constructor that generates a gem with a random color
    public Gem(){
        color=color=random.nextInt(6);;
    }
    //constructor that generates a gem with a specific color
    public Gem(int c){
        color=c;
    }
    
    public int getColor(){
        return color;
    }
}
