package views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import utils.views.ViewsUtils;

import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileCompanyView {





	private JPanel contentPane;
	private JTextField txtNomEntreprise;
	private JTextField txtTlphone;
	private JTextField txtAddress;
	private JTextField txtLienSiteEntreprise;
	private JTextField txtLienLinkedin;
	private JTextArea txtrDescription;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextArea textArea;
	private JComboBox comboBox;
	private JLabel lblDescritpionDuPoste;
	private JList list_1;
	private JLabel lblListeDeComptence;
	private JButton EditLinkWebSite;
	private JButton EditLinkedinLink;
	private JButton EditName;
	private JButton EditPhone;
	private JButton EditAddress;
	private JButton EditList;
	private JTextArea txtPostDescription;
	private JScrollPane scrollPane;
	private JButton EditDescription;
	private JButton EditSkillList;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JLabel label;
	private JScrollPane scrollPane_3;
	
	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @param contentPane the contentPane to set
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	/**
	 * @return the txtNomEntreprise
	 */
	public JTextField getTxtNomEntreprise() {
		return txtNomEntreprise;
	}

	/**
	 * @param txtNomEntreprise the txtNomEntreprise to set
	 */
	public void setTxtNomEntreprise(JTextField txtNomEntreprise) {
		this.txtNomEntreprise = txtNomEntreprise;
	}

	/**
	 * @return the txtTlphone
	 */
	public JTextField getTxtTlphone() {
		return txtTlphone;
	}

	/**
	 * @param txtTlphone the txtTlphone to set
	 */
	public void setTxtTlphone(JTextField txtTlphone) {
		this.txtTlphone = txtTlphone;
	}

	/**
	 * @return the txtAddress
	 */
	public JTextField getTxtAddress() {
		return txtAddress;
	}

	/**
	 * @param txtAddress the txtAddress to set
	 */
	public void setTxtAddress(JTextField txtAddress) {
		this.txtAddress = txtAddress;
	}

	/**
	 * @return the txtLienSiteEntreprise
	 */
	public JTextField getTxtLienSiteEntreprise() {
		return txtLienSiteEntreprise;
	}

	/**
	 * @param txtLienSiteEntreprise the txtLienSiteEntreprise to set
	 */
	public void setTxtLienSiteEntreprise(JTextField txtLienSiteEntreprise) {
		this.txtLienSiteEntreprise = txtLienSiteEntreprise;
	}

	/**
	 * @return the txtLienLinkedin
	 */
	public JTextField getTxtLienLinkedin() {
		return txtLienLinkedin;
	}

	/**
	 * @param txtLienLinkedin the txtLienLinkedin to set
	 */
	public void setTxtLienLinkedin(JTextField txtLienLinkedin) {
		this.txtLienLinkedin = txtLienLinkedin;
	}

	/**
	 * @return the txtrDescription
	 */
	public JTextArea getTxtrDescription() {
		return txtrDescription;
	}

	/**
	 * @param txtrDescription the txtrDescription to set
	 */
	public void setTxtrDescription(JTextArea txtrDescription) {
		this.txtrDescription = txtrDescription;
	}

	/**
	 * @return the lblNewLabel
	 */
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	/**
	 * @param lblNewLabel the lblNewLabel to set
	 */
	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	/**
	 * @return the panel_1
	 */
	public JPanel getPanel_1() {
		return panel_1;
	}

	/**
	 * @param panel_1 the panel_1 to set
	 */
	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	/**
	 * @return the list
	 */

	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @param textArea the textArea to set
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	/**
	 * @return the comboBox
	 */
	public JComboBox getComboBox() {
		return comboBox;
	}

	/**
	 * @param comboBox the comboBox to set
	 */
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * @return the lblDescritpionDuPoste
	 */
	public JLabel getLblDescritpionDuPoste() {
		return lblDescritpionDuPoste;
	}

	/**
	 * @param lblDescritpionDuPoste the lblDescritpionDuPoste to set
	 */
	public void setLblDescritpionDuPoste(JLabel lblDescritpionDuPoste) {
		this.lblDescritpionDuPoste = lblDescritpionDuPoste;
	}

	/**
//	 * @return the lblCoordonnesDuRecruteur
//	 */
//	public JLabel getLblCoordonnesDuRecruteur() {
//		return lblCoordonnesDuRecruteur;
//	}
//
//	/**
//	 * @param lblCoordonnesDuRecruteur the lblCoordonnesDuRecruteur to set
//	 */
//	public void setLblCoordonnesDuRecruteur(JLabel lblCoordonnesDuRecruteur) {
//		this.lblCoordonnesDuRecruteur = lblCoordonnesDuRecruteur;
//	}

	/**
	 * @return the list_1
	 */
	public JList getList_1() {
		return list_1;
	}

	/**
	 * @param list_1 the list_1 to set
	 */
	public void setList_1(JList list_1) {
		this.list_1 = list_1;
	}

	/**
	 * @return the lblListeDeComptence
	 */
	public JLabel getLblListeDeComptence() {
		return lblListeDeComptence;
	}

	/**
	 * @param lblListeDeComptence the lblListeDeComptence to set
	 */
	public void setLblListeDeComptence(JLabel lblListeDeComptence) {
		this.lblListeDeComptence = lblListeDeComptence;
	}



	/**
	 * @return the editLinkWebSite
	 */
	public JButton getEditLinkWebSite() {
		return EditLinkWebSite;
	}

	/**
	 * @param editLinkWebSite the editLinkWebSite to set
	 */
	public void setEditLinkWebSite(JButton editLinkWebSite) {
		EditLinkWebSite = editLinkWebSite;
	}

	/**
	 * @return the editLinkedinLink
	 */
	public JButton getEditLinkedinLink() {
		return EditLinkedinLink;
	}

	/**
	 * @param editLinkedinLink the editLinkedinLink to set
	 */
	public void setEditLinkedinLink(JButton editLinkedinLink) {
		EditLinkedinLink = editLinkedinLink;
	}

	/**
	 * @return the editName
	 */
	public JButton getEditName() {
		return EditName;
	}

	/**
	 * @param editName the editName to set
	 */
	public void setEditName(JButton editName) {
		EditName = editName;
	}

	/**
	 * @return the editPhone
	 */
	public JButton getEditPhone() {
		return EditPhone;
	}

	/**
	 * @param editPhone the editPhone to set
	 */
	public void setEditPhone(JButton editPhone) {
		EditPhone = editPhone;
	}

	/**
	 * @return the editAddress
	 */
	public JButton getEditAddress() {
		return EditAddress;
	}

	/**
	 * @param editAddress the editAddress to set
	 */
	public void setEditAddress(JButton editAddress) {
		EditAddress = editAddress;
	}

	/**
	 * @return the editList
	 */
	public JButton getEditList() {
		return EditList;
	}

	/**
	 * @param editList the editList to set
	 */
	public void setEditList(JButton editList) {
		EditList = editList;
	}

	/**
	 * @return the scrollPane
	 */
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	/**
	 * @param scrollPane the scrollPane to set
	 */
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	/**
	 * @return the editDescription
	 */
	public JButton getEditDescription() {
		return EditDescription;
	}

	/**
	 * @param editDescription the editDescription to set
	 */
	public void setEditDescription(JButton editDescription) {
		EditDescription = editDescription;
	}

	/**
	 * @return the editSkillList
	 */
	public JButton getEditSkillList() {
		return EditSkillList;
	}

	/**
	 * @param editSkillList the editSkillList to set
	 */
	public void setEditSkillList(JButton editSkillList) {
		EditSkillList = editSkillList;
	}

	/**
	 * @return the txtrHfghgjPghjZpjfpzjf
	 */
	public JTextArea getTxtrHfghgjPghjZpjfpzjf() {
		return txtPostDescription;
	}

	/**
	 * @param txtrHfghgjPghjZpjfpzjf the txtrHfghgjPghjZpjfpzjf to set
	 */
	public void setTxtrHfghgjPghjZpjfpzjf(JTextArea txtrHfghgjPghjZpjfpzjf) {
		this.txtPostDescription = txtrHfghgjPghjZpjfpzjf;
	}

	
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ProfileCompanyView(JFrame frame) {
		
		contentPane = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		ViewsUtils.configureJFrame(frame, contentPane, menuBar);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{28, 64, 40, 40, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 50, 124, 0, 31, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 2.0, 5.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);;
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		lblNewLabel.setIcon(new ImageIcon("Pictures/logoImie.png"));
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{177, 118, 103, 172, 0};
		gbl_panel.rowHeights = new int[]{37, 36, 36, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtNomEntreprise = new JTextField();
		txtNomEntreprise.setForeground(Color.BLACK);
		txtNomEntreprise.setBackground(Color.WHITE);
		txtNomEntreprise.setEditable(false);
		txtNomEntreprise.setText("Nom Entreprise");
		GridBagConstraints gbc_txtNomEntreprise = new GridBagConstraints();
		gbc_txtNomEntreprise.insets = new Insets(0, 0, 5, 5);
		gbc_txtNomEntreprise.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomEntreprise.gridx = 0;
		gbc_txtNomEntreprise.gridy = 0;
		panel.add(txtNomEntreprise, gbc_txtNomEntreprise);
		txtNomEntreprise.setColumns(10);
		
		EditName = new JButton("Modifier");
		EditName.setForeground(Color.WHITE);
		EditName.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditName = new GridBagConstraints();
		gbc_EditName.insets = new Insets(0, 0, 5, 5);
		gbc_EditName.gridx = 1;
		gbc_EditName.gridy = 0;
		panel.add(EditName, gbc_EditName);
		
		EditLinkWebSite = new JButton("Modifier");
		EditLinkWebSite.setForeground(Color.WHITE);
		EditLinkWebSite.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditLinkWebSite = new GridBagConstraints();
		gbc_EditLinkWebSite.insets = new Insets(0, 0, 5, 5);
		gbc_EditLinkWebSite.gridx = 2;
		gbc_EditLinkWebSite.gridy = 0;
		panel.add(EditLinkWebSite, gbc_EditLinkWebSite);
		
		txtLienSiteEntreprise = new JTextField();
		txtLienSiteEntreprise.setForeground(Color.BLACK);
		txtLienSiteEntreprise.setBackground(Color.WHITE);
		txtLienSiteEntreprise.setEditable(false);
		txtLienSiteEntreprise.setText("Lien site entreprise");
		GridBagConstraints gbc_txtLienSiteEntreprise = new GridBagConstraints();
		gbc_txtLienSiteEntreprise.insets = new Insets(0, 0, 5, 0);
		gbc_txtLienSiteEntreprise.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLienSiteEntreprise.gridx = 3;
		gbc_txtLienSiteEntreprise.gridy = 0;
		panel.add(txtLienSiteEntreprise, gbc_txtLienSiteEntreprise);
		txtLienSiteEntreprise.setColumns(10);
		
		txtTlphone = new JTextField();
		txtTlphone.setForeground(Color.BLACK);
		txtTlphone.setBackground(Color.WHITE);
		txtTlphone.setEditable(false);
		txtTlphone.setText("T\u00E9l\u00E9phone");
		GridBagConstraints gbc_txtTlphone = new GridBagConstraints();
		gbc_txtTlphone.insets = new Insets(0, 0, 5, 5);
		gbc_txtTlphone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTlphone.gridx = 0;
		gbc_txtTlphone.gridy = 1;
		panel.add(txtTlphone, gbc_txtTlphone);
		txtTlphone.setColumns(10);
		
		EditPhone = new JButton("Modifier");
		EditPhone.setForeground(Color.WHITE);
		EditPhone.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditPhone = new GridBagConstraints();
		gbc_EditPhone.insets = new Insets(0, 0, 5, 5);
		gbc_EditPhone.gridx = 1;
		gbc_EditPhone.gridy = 1;
		panel.add(EditPhone, gbc_EditPhone);
		
		txtAddress = new JTextField();
		txtAddress.setForeground(Color.BLACK);
		txtAddress.setBackground(Color.WHITE);
		txtAddress.setEditable(false);
		txtAddress.setText("Adresse");
		GridBagConstraints gbc_txtAddress = new GridBagConstraints();
		gbc_txtAddress.insets = new Insets(0, 0, 0, 5);
		gbc_txtAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddress.gridx = 0;
		gbc_txtAddress.gridy = 2;
		panel.add(txtAddress, gbc_txtAddress);
		txtAddress.setColumns(10);
		
		EditAddress = new JButton("Modifier");
		EditAddress.setForeground(Color.WHITE);
		EditAddress.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditAddress = new GridBagConstraints();
		gbc_EditAddress.insets = new Insets(0, 0, 0, 5);
		gbc_EditAddress.gridx = 1;
		gbc_EditAddress.gridy = 2;
		panel.add(EditAddress, gbc_EditAddress);
		
		EditLinkedinLink = new JButton("Modifier");
		EditLinkedinLink.setForeground(Color.WHITE);
		EditLinkedinLink.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditLinkedinLink = new GridBagConstraints();
		gbc_EditLinkedinLink.insets = new Insets(0, 0, 0, 5);
		gbc_EditLinkedinLink.gridx = 2;
		gbc_EditLinkedinLink.gridy = 2;
		panel.add(EditLinkedinLink, gbc_EditLinkedinLink);
		
		txtLienLinkedin = new JTextField();
		txtLienLinkedin.setBackground(Color.WHITE);
		txtLienLinkedin.setForeground(Color.BLACK);
		txtLienLinkedin.setEditable(false);
		txtLienLinkedin.setText("Lien linkedin");
		GridBagConstraints gbc_txtLienLinkedin = new GridBagConstraints();
		gbc_txtLienLinkedin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLienLinkedin.gridx = 3;
		gbc_txtLienLinkedin.gridy = 2;
		panel.add(txtLienLinkedin, gbc_txtLienLinkedin);
		txtLienLinkedin.setColumns(10);
		
		EditDescription = new JButton("Modifier");
		EditDescription.setForeground(Color.WHITE);
		EditDescription.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditDescription = new GridBagConstraints();
		gbc_EditDescription.gridwidth = 2;
		gbc_EditDescription.insets = new Insets(0, 0, 5, 0);
		gbc_EditDescription.gridx = 4;
		gbc_EditDescription.gridy = 1;
		contentPane.add(EditDescription, gbc_EditDescription);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridwidth = 6;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 2;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		txtrDescription = new JTextArea();
		scrollPane_1.setViewportView(txtrDescription);
		txtrDescription.setForeground(Color.BLACK);
		txtrDescription.setBackground(Color.WHITE);
		txtrDescription.setEditable(false);
		txtrDescription.setText("Description");
		
		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{78, 86, 0};
		gbl_panel_1.rowHeights = new int[]{33, 24, 59, 31, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		comboBox = new JComboBox();
		comboBox.setMinimumSize(new Dimension(100, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"poste 1", "poste 2"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 0;
		panel_1.add(comboBox, gbc_comboBox);
		
		EditList = new JButton("Modifier");
		EditList.setForeground(Color.WHITE);
		EditList.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditList = new GridBagConstraints();
		gbc_EditList.insets = new Insets(0, 0, 5, 0);
		gbc_EditList.gridx = 1;
		gbc_EditList.gridy = 0;
		panel_1.add(EditList, gbc_EditList);
		
		label = new JLabel("Coordonn\u00E9es du recruteur");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		
		txtPostDescription = new JTextArea();
		txtPostDescription.setForeground(Color.BLACK);
		txtPostDescription.setBackground(Color.WHITE);
		scrollPane.setViewportView(txtPostDescription);
		
		lblDescritpionDuPoste = new JLabel("Descritpion du poste");
		GridBagConstraints gbc_lblDescritpionDuPoste = new GridBagConstraints();
		gbc_lblDescritpionDuPoste.anchor = GridBagConstraints.WEST;
		gbc_lblDescritpionDuPoste.gridwidth = 2;
		gbc_lblDescritpionDuPoste.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescritpionDuPoste.gridx = 0;
		gbc_lblDescritpionDuPoste.gridy = 3;
		panel_1.add(lblDescritpionDuPoste, gbc_lblDescritpionDuPoste);
		
		scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridwidth = 2;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 4;
		panel_1.add(scrollPane_2, gbc_scrollPane_2);
		
		textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.BLACK);
		
		lblListeDeComptence = new JLabel("Liste de comp\u00E9tence");
		GridBagConstraints gbc_lblListeDeComptence = new GridBagConstraints();
		gbc_lblListeDeComptence.anchor = GridBagConstraints.WEST;
		gbc_lblListeDeComptence.gridwidth = 2;
		gbc_lblListeDeComptence.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeDeComptence.gridx = 3;
		gbc_lblListeDeComptence.gridy = 3;
		contentPane.add(lblListeDeComptence, gbc_lblListeDeComptence);
		
		EditSkillList = new JButton("Modifier");
		EditSkillList.setForeground(Color.WHITE);
		EditSkillList.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_EditSkillList = new GridBagConstraints();
		gbc_EditSkillList.insets = new Insets(0, 0, 5, 0);
		gbc_EditSkillList.gridx = 5;
		gbc_EditSkillList.gridy = 3;
		contentPane.add(EditSkillList, gbc_EditSkillList);
		
		scrollPane_3 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridwidth = 3;
		gbc_scrollPane_3.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_3.gridx = 3;
		gbc_scrollPane_3.gridy = 4;
		contentPane.add(scrollPane_3, gbc_scrollPane_3);
		
		list_1 = new JList();
		scrollPane_3.setViewportView(list_1);
		list_1.setBackground(Color.WHITE);
		list_1.setForeground(Color.BLACK);
		list_1.setOpaque(false);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Comp\u00E9tence 4Comp\u00E9tence 1", "Comp\u00E9tence 2", "Comp\u00E9tence 3", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4", "Comp\u00E9tence 4"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setVisibleRowCount(7);
		list_1.setToolTipText("");
		list_1.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
	}

}
