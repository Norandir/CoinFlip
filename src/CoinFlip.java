import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CoinFlip 
{
	public CoinFlip()
	{
		//creating window, buttons and labels
		JFrame f = new JFrame();
		JButton flip = new JButton("Flip");
		JButton twoFlip = new JButton("Flip two coins");
		JLabel coin = new JLabel();
		JLabel coin1 = new JLabel();
		JLabel coin2 = new JLabel();
		f.setLayout(null);
		
		f.setTitle("Coin Flip");
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add objects to window
		f.add(flip);
		f.add(coin);
		f.add(coin1);
		f.add(coin2);
		f.add(twoFlip);

		
		//set placement in window
		flip.setBounds(130,100,120, 40);
		twoFlip.setBounds(130,200,120, 40);
		coin.setBounds(155, 100, 100, 100);
		coin1.setBounds(140, 210, 100, 100);
		coin2.setBounds(180, 210, 100, 100);
		
		
		//adding actions performed when first button is pressed
		flip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int coinresult = 3;
				coinresult = rand.nextInt(2);
				
				if(coinresult == 0) {
					coin.setText("Heads");
				}
				else if (coinresult == 1) {
					coin.setText("Tails");
				}
				
			}
			
		});
		
		//adding actions for when second button is pressed
		twoFlip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand1 = new Random();
				Random rand2 = new Random();
				int coinresult1 = 3;
				int coinresult2 = 3;
				coinresult1 = rand1.nextInt(2);
				coinresult2 = rand2.nextInt(2);
				
				
				if(coinresult1 == 0) {
					coin1.setText("Heads");
				}
				else if (coinresult1 == 1) {
					coin1.setText("Tails");
				}
				
				if(coinresult2 == 0) {
					coin2.setText("Heads");
				}
				else if (coinresult2 == 1) {
					coin2.setText("Tails");
				}
				
			}
			
		});
	}
	public static void main(String[] args) {
		new CoinFlip();
	}
}