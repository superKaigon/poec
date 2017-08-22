/**
 * 
 */
package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import views.HomeViewTest;
import views.MenuBarView;

/**
 * @author Minet
 *
 */
public class HomeController {
	private JFrame frame;
	private HomeViewTest view;

	/**
	 * @param frame
	 */
	public HomeController(JFrame frame) {
		this.frame = frame;

		EventQueue.invokeLater(new Runnable() { // EventQueue.invokeLater permet
												// de run la JFrame dans le
												// thread
			// principal. Tous les composants graphiques doivent être run
			public void run() { // dans le thread principal (dispatch thread)
				try {
					view = new HomeViewTest(HomeController.this.frame);
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
				// TODO Auto-generated method stub
				new ProfileCompanyController(frame);
			}

		});
	}

}
