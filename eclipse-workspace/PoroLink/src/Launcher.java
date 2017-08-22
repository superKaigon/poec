

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import controller.ExampleController;
import utils.views.ViewsUtils;
import views.MenuBarView;

/**
 * 
 */

/**
 * @author Minet
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		new ExampleController(frame);

	}

}