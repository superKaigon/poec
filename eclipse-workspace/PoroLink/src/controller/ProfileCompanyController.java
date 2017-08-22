/**
 * 
 */
package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

import entities.Company;
import entities.Post;
import utils.views.ViewsUtils;
import views.ProfileCompanyView;

/**
 * @author Minet
 *
 */
public class ProfileCompanyController {
	private ProfileCompanyView view;
	private Company user;
	private JFrame frame;

	public ProfileCompanyController(JFrame frame) {
		this.frame = frame;
		user = new Company();

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
					view = new ProfileCompanyView(ProfileCompanyController.this.frame);
					frame.setVisible(true);
					ViewsUtils.Edit(frame, view.getEditAddress(), view.getTxtAddress());
					ViewsUtils.Edit(frame, view.getEditName(), view.getTxtNomEntreprise());
					ViewsUtils.Edit(frame, view.getEditLinkWebSite(), view.getTxtLienSiteEntreprise());
					ViewsUtils.Edit(frame, view.getEditPhone(), view.getTxtTlphone());
					ViewsUtils.Edit(frame, view.getEditDescription(), view.getTxtrDescription());
					ViewsUtils.Edit(frame, view.getEditLinkedinLink(), view.getTxtLienLinkedin());
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	Post poste1 = new Post();
	Post poste2 = new Post();
	
	
	

}
