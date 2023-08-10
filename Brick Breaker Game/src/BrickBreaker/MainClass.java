package BrickBreaker;

import javax.swing.JFrame;

public class MainClass {
    public static void main(String[] args) {
        
        JFrame ob = new JFrame();
        GamePlay gamePlay = new GamePlay();

        ob.setBounds(10,10,700,600);
        ob.setTitle("< Brick Breaker Game >");
        ob.setResizable(false);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.add(gamePlay);
    }
}