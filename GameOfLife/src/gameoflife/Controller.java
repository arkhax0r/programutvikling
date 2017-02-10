/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


/**
 *
 * @author Jeremiah
 */
public class Controller implements Initializable {
    
    @FXML
    private Canvas mycanvas;
    @FXML
    public void createGrid(){
    final int widt=100; 
    final int heig=100;
    
        
    GraphicsContext grid= mycanvas.getGraphicsContext2D();
    grid.setFill(Color.BLACK);
    grid.strokeRect(0,0,mycanvas.getWidth(),mycanvas.getHeight());
        
    //Horizontal linje
    for(int i =1; i<heig;i++){
            int y = (int) (i * mycanvas.getHeight()/heig);
           grid.strokeLine(0,y,mycanvas.getWidth(),y);
            
        }
    //vertikal linje
        for(int j=1; j<widt;j++){
         int x = (int) (j * mycanvas.getWidth()/widt);
           grid.strokeLine(x,0,x,mycanvas.getHeight());
        
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }    
    
    
}
