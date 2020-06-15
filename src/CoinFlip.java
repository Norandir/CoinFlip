import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CoinFlip 
{
	//start values
	int flipResultsH = 0;
	int flipResultsT = 0;
	
	int flipResults2H = 0;
	int flipResults2T = 0;
	boolean CC = false;
	
	public CoinFlip()
	{
		
		
		
		//creating window, buttons and labels
		JFrame f = new JFrame();
		JButton flip = new JButton("Flip");
		JButton twoFlip = new JButton("Flip two coins");
		JButton roll = new JButton("Roll die");
		JButton roll2 = new JButton("Roll two dice");
		
		JButton Q = new JButton("Normal");
		JButton P = new JButton("Penny");
		
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
		f.add(Q);
		f.add(P);
		
		//creating coin images
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
		
		
		ImageIcon PH = new ImageIcon("Images/PennyH.jpg");
		JLabel PennyH = new JLabel(PH);
		f.add(PennyH);
		ImageIcon PT = new ImageIcon("Images/PennyT.jpg");
		JLabel PennyT = new JLabel(PT);
		f.add(PennyT);
		
		JLabel PennyH2 = new JLabel(PH);
		f.add(PennyH2);
		JLabel PennyT2 = new JLabel(PT);
		f.add(PennyT2);
		
		
		ImageIcon Die1 = new ImageIcon("Images/Die1.jpg"); //need to add picture of die to folder
		ImageIcon Die2 = new ImageIcon("Images/Die2.jpg");
		ImageIcon Die3 = new ImageIcon("Images/Die3.jpg");
		ImageIcon Die4 = new ImageIcon("Images/Die4.jpg");
		ImageIcon Die5 = new ImageIcon("Images/Die5.jpg");
		ImageIcon Die6 = new ImageIcon("Images/Die6.jpg");
		JLabel Die = new JLabel();
		JLabel SecondDie = new JLabel();
		f.add(Die);
		f.add(roll);
		f.add(roll2);
		f.add(SecondDie);
		Die.setBounds(100, 300, 200, 200);
		roll.setBounds(30,10,120, 40);
		roll2.setBounds(200,10,120, 40);
		SecondDie.setBounds(100, 500, 200, 200);
		
		
		//set placement in window
		flip.setBounds(130,100,120, 40);
		twoFlip.setBounds(130,200,120, 40);
		Q.setBounds(270,200,80, 40);
		P.setBounds(40,200,80, 40);
		
		
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
		
		PennyH.setBounds(100, 300, 200, 200);
		PennyH.setVisible(false);
		PennyT.setBounds(100, 300, 200, 200);
		PennyT.setVisible(false);
		PennyH2.setBounds(100, 500, 200, 200);
		PennyH2.setVisible(false);
		PennyT2.setBounds(100, 500, 200, 200);
		PennyT2.setVisible(false);
		
		//TODO set up location of die
		
		//adding actions performed when first button is pressed
		flip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				//Make sure all Coins are reset on click
				heads.setVisible(false);
				tails.setVisible(false);
				PennyH.setVisible(false);
				PennyT.setVisible(false);
				
				heads2.setVisible(false);
				tails2.setVisible(false);
				PennyH2.setVisible(false);
				PennyT2.setVisible(false);
				
				Die.setVisible(false);
				SecondDie.setVisible(false);
				
				
				
				int coinresult = 3;
				//randomize flip
				coinresult = rand.nextInt(2);
				//do if flip is heads
				if(coinresult == 0) {
					coin.setText("Heads");
					flipResultsH++;
					//Which coin flips
					if (CC == false) {
						heads.setVisible(true);
					}
					else {
						PennyH.setVisible(true);
					}
				
				
				}
				//do if tails
				else if (coinresult == 1) {
					coin.setText("Tails");
					flipResultsT++;
					
					if (CC == false) {
						tails.setVisible(true);
					}
					else {
						PennyT.setVisible(true);
					}
					
				}
				//add to result of flips
				results.setText("Heads: " + flipResultsH + " Tails: "+ flipResultsT);
			}
			
		});
		
		//adding actions for when second button is pressed
		twoFlip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			//all coins are reset 
				heads.setVisible(false);
				heads2.setVisible(false);
				tails.setVisible(false);
				tails2.setVisible(false);
				
				PennyH.setVisible(false);
				PennyT.setVisible(false);
				PennyH2.setVisible(false);
				PennyT2.setVisible(false);
				
				Die.setVisible(false);
				SecondDie.setVisible(false);
				
				//randomized both coins
				Random rand1 = new Random();
				Random rand2 = new Random();
				int coinresult1 = 3;
				int coinresult2 = 3;
				coinresult1 = rand1.nextInt(2);
				coinresult2 = rand2.nextInt(2);
				
				
				
				
				if(coinresult1 == 0) {
					coin1.setText("Heads");
					flipResults2H++;
					
					if (CC == false) {
						heads.setVisible(true);
					}
					else {
						PennyH.setVisible(true);
					}
					
				}
				else if (coinresult1 == 1) {
					coin1.setText("Tails");
					flipResults2T++;
					if (CC == false) {
						tails.setVisible(true);
					}
					else {
						PennyT.setVisible(true);
					}
					
				
				}
				
				if(coinresult2 == 0) {
					coin2.setText("Heads");
					flipResults2H++;
					if (CC == false) {
						heads2.setVisible(true);
					}
					else {
						PennyH2.setVisible(true);
					}
					
					
				}
				else if (coinresult2 == 1) {
					coin2.setText("Tails");
					flipResults2T++;
					
					if (CC == false) {
						tails2.setVisible(true);
					}
					else {
						PennyT2.setVisible(true);
					}
					
				}
				//record results of flips of both coins
				results2.setText("Heads: " + flipResults2H + " Tails: "+ flipResults2T);
			}
			
		});
		
		//Use Quarter when pushed
		Q.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CC = false;
				
			}
			
		});
		
		//Use penny when pushed
		P.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CC = true;
				
			}
			
		});
		
		
		roll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				heads.setVisible(false);
				heads2.setVisible(false);
				tails.setVisible(false);
				tails2.setVisible(false);
				
				PennyH.setVisible(false);
				PennyT.setVisible(false);
				PennyH2.setVisible(false);
				PennyT2.setVisible(false);
				
				Die.setVisible(true);
				SecondDie.setVisible(false);
				
				Random DR = new Random();
				
				int dieroll = DR.nextInt(6) + 1;
				
				switch (dieroll) {
				case 1:
					Die.setIcon(Die1);
					break;
				case 2:
					Die.setIcon(Die2);
					break;
				case 3:
					Die.setIcon(Die3);
					break;
				case 4:
					Die.setIcon(Die4);
					break;
				case 5:
					Die.setIcon(Die5);
					break;
				case 6:
					Die.setIcon(Die6);
					break;
				}
				
			}
			
		});
		
		roll2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				heads.setVisible(false);
				heads2.setVisible(false);
				tails.setVisible(false);
				tails2.setVisible(false);
				
				PennyH.setVisible(false);
				PennyT.setVisible(false);
				PennyH2.setVisible(false);
				PennyT2.setVisible(false);
				
				Die.setVisible(true);
				SecondDie.setVisible(true);
				
				Random DR = new Random();
				
				int dieroll = DR.nextInt(6) + 1;
				int dieroll2 = DR.nextInt(6) + 1;
				
				switch (dieroll) {
				case 1:
					Die.setIcon(Die1);
					break;
				case 2:
					Die.setIcon(Die2);
					break;
				case 3:
					Die.setIcon(Die3);
					break;
				case 4:
					Die.setIcon(Die4);
					break;
				case 5:
					Die.setIcon(Die5);
					break;
				case 6:
					Die.setIcon(Die6);
					break;
				}
				
				switch (dieroll2) {
				case 1:
					SecondDie.setIcon(Die1);
					break;
				case 2:
					SecondDie.setIcon(Die2);
					break;
				case 3:
					SecondDie.setIcon(Die3);
					break;
				case 4:
					SecondDie.setIcon(Die4);
					break;
				case 5:
					SecondDie.setIcon(Die5);
					break;
				case 6:
					SecondDie.setIcon(Die6);
					break;
				}
				
			}
			
		});
		
	}
	//run program
	public static void main(String[] args) {
		new CoinFlip();
	}
}