package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import entities.AppUser;
import entities.Candidate;
import views.ExampleView;
import views.HomeViewTest;

public class ExampleController {
	private ExampleView view;
	private Candidate user;
	private JFrame frame;

	public ExampleController(JFrame frame) {
		this.frame = frame;
		user = new Candidate();
		
		/**
		 * Launch the application.
		 */

		EventQueue.invokeLater(new Runnable() { // EventQueue.invokeLater permet de run la JFrame dans le thread
												// principal. Tous les composants graphiques doivent être run
			public void run() { // dans le thread principal (dispatch thread)
				try {
					view = new ExampleView(ExampleController.this.frame);
					frame.setVisible(true);
					initEvent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initEvent() {
		view.getBtnNewButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**user.setLogin(view.getTextField().getText());
				user.setPassword(new String (view.
						getPasswordField().getPassword()));
				
				if (user.getLogin().equals("") && user.getPassword().equals("")) {*/
				new HomeController (frame);
				//System.out.println("tg");
				//}

			}
		});
	}
}
