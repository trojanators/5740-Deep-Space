package main.java.com.DsClient.overlay;

import javax.swing.JFrame; 
import javax.swing.SwingUtilities;
import javax.swing.text.*;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;


public class Overlay {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Transparent Window");
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setAlwaysOnTop(true);
        // Without this, the window is draggable from any non transparent
        // point, including points  inside textboxes.
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);

        frame.getContentPane().setLayout(new java.awt.BorderLayout());
        frame.getContentPane().add(new JTextField("text field north"), java.awt.BorderLayout.NORTH);
        frame.getContentPane().add(new JTextField("text field south"), java.awt.BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.pack();
    }
}
