import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CoinFlip 
{
	int flipResultsH = 0;
	int flipResultsT = 0;
	
	int flipResults2H = 0;
	int flipResults2T = 0;
	
	public CoinFlip()
	{
		
		
		
		//creating window, buttons and labels
		JFrame f = new JFrame();
		JButton flip = new JButton("Flip");
		JButton twoFlip = new JButton("Flip two coins");
		JLabel coin = new JLabel();
		JLabel coin1 = new JLabel();
		JLabel coin2 = new JLabel();
		JLabel results = new JLabel();
		JLabel results2 = new JLabel();
		f.setLayout(null);
		
		f.setTitle("Coin Flip");
		f.setVisible(true);
		f.setSize(400, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add objects to window
		f.add(flip);
		f.add(coin);
		f.add(coin1);
		f.add(coin2);
		f.add(twoFlip);
		f.add(results);
		f.add(results2);
		
		
		ImageIcon head = new ImageIcon("Images/Heads.png");
		JLabel heads = new JLabel(head);
		f.add(heads);
		ImageIcon tail = new ImageIcon("Images/Tails.jpg");
		JLabel tails = new JLabel(tail);
		f.add(tails);
		
		JLabel heads2 = new JLabel(head);
		f.add(heads2);
		JLabel tails2 = new JLabel(tail);
		f.add(tails2);
		
		
		//set placement in window
		flip.setBounds(130,100,120, 40);
		twoFlip.setBounds(130,200,120, 40);
		results.setBounds(100, 30, 100, 100);
		results2.setBounds(140, 240, 100, 100);
		coin.setBounds(155, 100, 100, 100);
		coin1.setBounds(140, 210, 100, 100);
		coin2.setBounds(180, 210, 100, 100);
		heads.setBounds(100, 300, 200, 200);
		heads.setVisible(false);
		tails.setBounds(100, 300, 200, 200);
		tails.setVisible(false);
		heads2.setBounds(100, 500, 200, 200);
		heads2.setVisible(false);
		tails2.setBounds(100, 500, 200, 200);
		tails2.setVisible(false);
		
		
		//adding actions performed when first button is pressed
		flip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				
				heads.setVisible(false);
				tails.setVisible(false);
				
				
				int coinresult = 3;
				coinresult = rand.nextInt(2);
				
				if(coinresult == 0) {
					coin.setText("Heads");
					flipResultsH++;
					heads.setVisible(true);
				
				}
				else if (coinresult == 1) {
					coin.setText("Tails");
					flipResultsT++;
					tails.setVisible(true);
				}
				results.setText("Heads: " + flipResultsH + " Tails: "+ flipResultsT);
			}
			
		});
		
		//adding actions for when second button is pressed
		twoFlip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				heads.setVisible(false);
				heads2.setVisible(false);
				tails.setVisible(false);
				tails2.setVisible(false);
				
				Random rand1 = new Random();
				Random rand2 = new Random();
				int coinresult1 = 3;
				int coinresult2 = 3;
				coinresult1 = rand1.nextInt(2);
				coinresult2 = rand2.nextInt(2);
				
				
				
				
				if(coinresult1 == 0) {
					coin1.setText("Heads");
					flipResults2H++;
					heads.setVisible(true);
				}
				else if (coinresult1 == 1) {
					coin1.setText("Tails");
					flipResults2T++;
					tails.setVisible(true);
				}
				
				if(coinresult2 == 0) {
					coin2.setText("Heads");
					flipResults2H++;
					heads2.setVisible(true);
				}
				else if (coinresult2 == 1) {
					coin2.setText("Tails");
					flipResults2T++;
					tails2.setVisible(true);
				}
				
				results2.setText("Heads: " + flipResults2H + " Tails: "+ flipResults2T);
			}
			
		});
	}
	public static void main(String[] args) {
		new CoinFlip();
	}
}