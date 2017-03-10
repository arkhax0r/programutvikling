/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author Jeremiah
 */
public class Cell {
    
    static int widt=100; 
    static int heig=100;
    static int currentmove[][];    
    
    public static void creategrid(GraphicsContext g,Canvas c){

            
    g= c.getGraphicsContext2D();
    
    g.strokeRect(0,0,c.getWidth(),c.getHeight());

    g.setFill(Color.BLACK);    
    //Horizontal linje
    for(int i =1; i<heig;i++){
            int y = (int) (i * c.getHeight()/heig);
           g.strokeLine(0,y,c.getWidth(),y);
            
        }
    //vertikal linje
        for(int j=1; j<widt;j++){
         int x = (int) (j * c.getWidth()/widt);
           g.strokeLine(x,0,x,c.getHeight());
        
        }
        
    
    }
 

    
  
    public static void randomcell(GraphicsContext g, Canvas c){
        g=c.getGraphicsContext2D();
        Random r = new Random();
        currentmove = new int[widt][heig];
           for(int y=0;y<heig;y++){
            for (int x=0;x<widt;x++){
                int z = r.nextInt(2);
                currentmove[y][x]=z;
            }
        
        }
    }
    public static void drawRandom(GraphicsContext g, Canvas c){
        for(int y=0;y<heig;y++){
            for(int x=0;x<widt;x++){
                if(currentmove [y][x]==1){
                       g.setFill(Color.GREEN);
                       
                       int n =(int) (y*c.getHeight()/heig);
                       int m=(int) (x*c.getWidth()/widt);
                       
                       g.fillRect(m, n, c.getWidth()/widt, c.getHeight()/heig);

                }
            }
        }
    
    }
}
