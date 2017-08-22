/**
 * 
 */
package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;

import entities.AppUser;
import entities.Candidate;
import views.ProfileCandidateView;

/**
 * @author kai_g
 *
 */
public class ProfileCandidateController {
	private ProfileCandidateView view;
	private Candidate user;
	private JFrame frame;

	public ProfileCandidateController(JFrame frame) {
		this.frame = frame;
		user = new Candidate();

		/**
		 * Launch the application.
		 */

		EventQueue.invokeLater(new Runnable() { // EventQueue.invokeLater permet
			// de run la JFrame dans le
			// thread
			// principal. Tous les
			// composants graphiques doivent
			// être run
			public void run() { // dans le thread principal (dispatch thread)
				try {
					view = new ProfileCandidateView(ProfileCandidateController.this.frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//view.getSkillList().set

	}
}
