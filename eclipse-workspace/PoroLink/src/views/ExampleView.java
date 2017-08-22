package views;



import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import utils.views.ViewsUtils;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ExampleView {

	private JPanel contentPane;
	private JTextField textField;
	private GridBagLayout gridBagLayout;
	private JLabel lblExemple;
	private JLabel lblBidule;
	private JLabel lblTruc;
	private JButton btnNewButton;
	private JPasswordField passwordField;


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
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	/**
	 * @return the passwordField
	 */
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 * @param passwordField the passwordField to set
	 */
	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	/**
	 * @return the gridBagLayout
	 */
	public GridBagLayout getGridBagLayout() {
		return gridBagLayout;
	}

	/**
	 * @param gridBagLayout the gridBagLayout to set
	 */
	public void setGridBagLayout(GridBagLayout gridBagLayout) {
		this.gridBagLayout = gridBagLayout;
	}

	/**
	 * @return the lblExemple
	 */
	public JLabel getLblExemple() {
		return lblExemple;
	}

	/**
	 * @param lblExemple the lblExemple to set
	 */
	public void setLblExemple(JLabel lblExemple) {
		this.lblExemple = lblExemple;
	}

	/**
	 * @return the lblBidule
	 */
	public JLabel getLblBidule() {
		return lblBidule;
	}

	/**
	 * @param lblBidule the lblBidule to set
	 */
	public void setLblBidule(JLabel lblBidule) {
		this.lblBidule = lblBidule;
	}

	/**
	 * @return the lblTruc
	 */
	public JLabel getLblTruc() {
		return lblTruc;
	}

	/**
	 * @param lblTruc the lblTruc to set
	 */
	public void setLblTruc(JLabel lblTruc) {
		this.lblTruc = lblTruc;
	}

	/**
	 * @return the btnNewButton
	 */
	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	/**
	 * @param btnNewButton the btnNewButton to set
	 */
	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}



	/**
	 * Create the frame.
	 */
	public ExampleView(JFrame frame) {
		contentPane = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		ViewsUtils.configureFirstJFrame(frame);
		ViewsUtils.configureJFrame(frame, contentPane, menuBar);
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 0, 0, 0, 0, 0, 44, 48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblExemple = new JLabel("Exemple");
		GridBagConstraints gbc_lblExemple = new GridBagConstraints();
		gbc_lblExemple.gridwidth = 11;
		gbc_lblExemple.insets = new Insets(0, 0, 5, 5);
		gbc_lblExemple.gridx = 7;
		gbc_lblExemple.gridy = 6;
		getContentPane().add(lblExemple, gbc_lblExemple);
		
		lblBidule = new JLabel("bidule");
		GridBagConstraints gbc_lblBidule = new GridBagConstraints();
		gbc_lblBidule.insets = new Insets(0, 0, 5, 5);
		gbc_lblBidule.gridx = 4;
		gbc_lblBidule.gridy = 9;
		getContentPane().add(lblBidule, gbc_lblBidule);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 11;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 7;
		gbc_textField.gridy = 9;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblTruc = new JLabel("truc");
		GridBagConstraints gbc_lblTruc = new GridBagConstraints();
		gbc_lblTruc.insets = new Insets(0, 0, 5, 5);
		gbc_lblTruc.gridx = 4;
		gbc_lblTruc.gridy = 11;
		getContentPane().add(lblTruc, gbc_lblTruc);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 11;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 7;
		gbc_passwordField.gridy = 11;
		contentPane.add(passwordField, gbc_passwordField);
		
		btnNewButton = new JButton("inscription");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 10;
		gbc_btnNewButton.gridy = 13;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}



}
