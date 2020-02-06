import javax.swing.JFrame;

public class GameScreen {

	public static void main(String[] args) {
		JFrame gamescreen=new JFrame("The Last Tower");
		gamescreen.setSize(1200, 680);
		gamescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Game panel1=new Game();
		
		gamescreen.getContentPane().add(panel1)	;
		
		gamescreen.pack();
		gamescreen.setResizable(false);
		gamescreen.setVisible(true);
		

	}

}
