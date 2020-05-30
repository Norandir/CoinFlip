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
		JLabel coin = new JLabel();
		
		flip.setBounds(130,100,120, 40);
		f.setLayout(null);
		f.add(flip);
		f.add(coin);
		coin.setBounds(155, 100, 100, 100);
		f.setTitle("Coin Flip");
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adding actions preformed when button is pressed
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
	}
	public static void main(String[] args) {
		new CoinFlip();
	}
}