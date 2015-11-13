
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * A class that represents an 8x8 Game Board like used in Checkers
 * @author Sabrina
 */
public class GameBoardSS extends JComponent {
    
    private Color[][] grid = new Color[8][8];
    private String message;
    private JFrame window;
    
    private final int TILE_SIZE = 100;
    
    /**
     * Creates a brand new empty 8x8 Board
     */
    public GameBoardSS() {
        //set all position to be null
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                grid[row][col] = null;
            }
        }
        //create the frame to display the board
        window = new JFrame("Game Board");
        //add the board to the frame
        window.add(this);
        //make the frame visible
        window.setVisible(true);
        //set the size of the board
        this.setPreferredSize(new Dimension(8*TILE_SIZE + 50, 8*TILE_SIZE + 100));
        //resize the window
        window.pack();
        //set the X
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Drawing the Game Board
     * @param g Graphics object to draw with
     */
    @Override
    public void paintComponent(Graphics g) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                g.drawRect(row*TILE_SIZE+25, col*TILE_SIZE+25, TILE_SIZE, TILE_SIZE);              
            }
        }
    }
    
    /**
     * Place a piece of a specific color on the board
     * @param row the row at which to place the piece
     * @param col the column at which to place the piece
     * @param colour the colour to make the piece
     */
    public void putPiece(int row, int col, Color colour) {
        grid[row][col] = colour;
    }
    
    /**
     * Removes a piece that is on the board
     * @param row the row to remove the piece from
     * @param col the colum to remove the piece from
     */
    public void removePiece(int row, int col){
        grid[row][col] = null;
    }            
    
    /**
     * Removes all piece from the board
     */
    public void clearBoard(){
        //sets all positions to be null
        for(int row = 0; row <8; row++) {
            for(int col = 0; col < 8; col++){
                grid[row][col] = null;
            }
        }
    }
    
    /**
     * Displays a message on the game area
     * @param theMessage the message to display.
     */
    public void setMessage(String theMessage){
        message = theMessage;
    }
    
    public void printBoard(){
        for(int col = 0; col < 8; col++){
            
        }
    }
}
