package Coin;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Coins {
	JButton Q = new JButton("Normal");
	JButton P = new JButton("Penny");
	
	JLabel coin = new JLabel();
	JLabel coin1 = new JLabel();
	JLabel coin2 = new JLabel();
	
	
	ImageIcon head = new ImageIcon("Images/Heads.png");
	JLabel heads = new JLabel(head);
	
	ImageIcon tail = new ImageIcon("Images/Tails.jpg");
	JLabel tails = new JLabel(tail);
	
	JLabel heads2 = new JLabel(head);
	
	JLabel tails2 = new JLabel(tail);
	
	ImageIcon PH = new ImageIcon("Images/PennyH.jpg");
	JLabel PennyH = new JLabel(PH);
	
	ImageIcon PT = new ImageIcon("Images/PennyT.jpg");
	JLabel PennyT = new JLabel(PT);
	
	JLabel PennyH2 = new JLabel(PH);
	
	JLabel PennyT2 = new JLabel(PT);
}
