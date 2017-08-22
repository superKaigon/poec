package utils.views;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.text.JTextComponent;

import controller.ProfileCompanyController;

public class ViewsUtils {
	/**
	 * Allow to configure all screen of application with default size values
	 * And Frame will be center on the current screen
	 * @param contentPane 
	 * @param jFrame 
	 * 
	 */
	public static void configureJFrame(JFrame jFrame, JPanel contentPane, JMenuBar menuBar) {


		contentPane.setBackground(new java.awt.Color(28, 85, 136));
		jFrame.setContentPane(contentPane);
		menuBar.setBackground(new java.awt.Color(28, 85, 136));
		menuBar.setBorder(null);
		menuBar.setBorderPainted(false);
		jFrame.setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("Pictures/logomini.png"));
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuBar.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(false);
		menuBar.add(separator);
		
		JButton btnNewButton_1 = new JButton("Liste des utilisateurs");
		btnNewButton_1.setAutoscrolls(true);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setForeground(new java.awt.Color(245, 243, 245));
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuBar.add(btnNewButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOpaque(false);
		menuBar.add(separator_1);
		
		JButton btnNewButton_2 = new JButton("Déconnexion");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setForeground(new java.awt.Color(245, 243, 245));
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuBar.add(btnNewButton_2);
	}
	
	public static void configureFirstJFrame (JFrame frame){
		
		int frameWidth = 800;
		int frameHeight = 600;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		int screenMiddleWidth = (screenWidth / 2) - (frameWidth / 2);
		int screenMiddleHeight = (screenHeight / 2) - (frameHeight / 2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(screenMiddleWidth, screenMiddleHeight, frameWidth, frameHeight);
		
	}
	
	public static void Edit (JFrame frame, JButton JButton, JTextComponent JTextComponent) {
		
		JButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (JTextComponent.isEditable() == true) {

					JButton.setText("Modifier");
					JTextComponent.setEditable(false);
				} else {
					JButton.setText("Valider");
					JTextComponent.setEditable(true);
				}
				frame.getContentPane().repaint();

			}
		});
		
	}

}
