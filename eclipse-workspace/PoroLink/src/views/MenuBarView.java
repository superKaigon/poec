package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarView extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MenuBarView() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem();
		mntmNewMenuItem_1.setIcon(new ImageIcon("Pictures/logomini.png"));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Liste des utilisateurs");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("D\u00E9connexion");
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem();
		mntmNewMenuItem_3.setIcon(new ImageIcon("Pictures/logoImie.png"));
		menuBar.add(mntmNewMenuItem_3);
		
		
	}

}
