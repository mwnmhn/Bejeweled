import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class FenetreJeu extends JFrame {
	private JPanel panelJeu = new JPanel(new GridLayout());
	private JPanel panelInfos = new JPanel();
	private JTextField score = new JTextField("Score : ");
	private JButton pause = new JButton("Pause");
	private JButton nvellePartie = new JButton("Nouvelle Partie");
	private JButton aide = new JButton("Aide");

	
	
	
	private JPanel conteneurPrincipal = new JPanel(new BorderLayout());
	
	
	
	public FenetreJeu(){
		
		super("Bejeweld");
		panelInfos.add(pause);
		panelInfos.add(nvellePartie);
		panelInfos.add(aide);
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		conteneurPrincipal.add(panelJeu, BorderLayout.CENTER);
		conteneurPrincipal.add(panelInfos, BorderLayout.WEST);
		setContentPane(conteneurPrincipal);
		

}

	public static void main(String [] args){
		new FenetreJeu();
	}
}

