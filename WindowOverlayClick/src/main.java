import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.*;

public class main {
	public static void main(String[] args) throws IOException {
		// JFrame frame = new JFrame("Transparent Window");
		// frame.setUndecorated(true);
		// frame.setBackground(new Color(0, 0, 0, 0));
		// frame.setAlwaysOnTop(true);
		// // Without this, the window is draggable from any non transparent
		// // point, including points inside textboxes.
		// frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground",
		// false);
		//
		// frame.getContentPane().setLayout(new java.awt.BorderLayout());
		// frame.getContentPane().add(new JTextField("text field north"),
		// java.awt.BorderLayout.NORTH);
		// frame.getContentPane().add(new JTextField("text field south"),
		// java.awt.BorderLayout.SOUTH);
		// frame.setVisible(true);
		// frame.pack();

		final DateTimeFormatter fm = DateTimeFormatter.ofPattern("HHmmss");    
		LocalDateTime date = LocalDateTime.now();
		
		String htmlFilePath = "C:\\Users\\user2\\Desktop\\G��ũ��\\gmacro.exe";
		File htmlFile = new File(htmlFilePath);

		// open the default web browser for the HTML page
		Desktop.getDesktop().browse(htmlFile.toURI());
		
		System.out.println("format : " + fm.format(date));
	}
}
