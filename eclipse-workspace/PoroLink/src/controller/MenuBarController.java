package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;

import views.MenuBarView;

public class MenuBarController {
	private JFrame frame;
	

	public MenuBarController() {
		this.frame = frame;
		

		/**
		 * Launch the application.
		 */

		EventQueue.invokeLater(new Runnable() { // EventQueue.invokeLater permet
			// de run la JFrame dans le
			// thread
			// principal. Tous les
			// composants graphiques doivent
			// être run
			private MenuBarView view;

			public void run() { // dans le thread principal (dispatch thread)
				try {
					view = new MenuBarView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
