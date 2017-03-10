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
public class Controller implements Initializable {
    
    @FXML
    private Canvas mycanvas;

    // private boolean[][] currentmove = new boolean[heig][widt], nextmove=new boolean[heig][widt];
    @FXML
    GraphicsContext gc;
    


    /*
    
    @FXML
    public int widthValue(ActionEvent event){
        try{
        double x = Double.parseDouble(widthInput.getText());
        return widt=(int) x;
       }catch(NumberFormatException e){
             return widt=0;
       }
    }
    @FXML
    public int heightValue(ActionEvent event){
      try{
        double y = Double.parseDouble(heightInput.getText());
        return heig=(int) y;
       }catch(NumberFormatException e){
           return heig=0;
       }
    }
    
    @FXML
    public void activatecell(){
   
        
    GraphicsContext gc1= mycanvas.getGraphicsContext2D();
    
    gc1.strokeRect(0,0,mycanvas.getWidth(),mycanvas.getHeight());
        
    //aktivere/deaktivere celler
    for(int i=0;i<heig;i++){
            for(int j=0;j<widt;j++){
                if(currentmove[i][j]){
                
                 int y = (int) (i * mycanvas.getHeight()/heig);
                 int x = (int) (j * mycanvas.getWidth()/widt);
                 
                 gc.fillRect(x, y,mycanvas.getWidth()/widt,mycanvas.getHeight()/heig);
                 gc.setFill(Color.YELLOW);
                }
            }
        
        }
    
    }
    */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    gc=mycanvas.getGraphicsContext2D();
    gc.setFill(Color.GRAY);
    gc.fillRect(0,0,mycanvas.getWidth(),mycanvas.getHeight());
    Cell.randomcell(gc, mycanvas);
    Cell.drawRandom(gc, mycanvas);
    Cell.creategrid(gc, mycanvas);
    }    

    
}
