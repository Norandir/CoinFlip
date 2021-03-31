package Coin;
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
		
		Die d = new Die();
		Coins c = new Coins();
		
		//creating window, buttons and labels
		JFrame f = new JFrame();
		JButton flip = new JButton("Flip");
		JButton twoFlip = new JButton("Flip two coins");
		JButton roll = new JButton("Roll die");
		JButton roll2 = new JButton("Roll two dice");
		
		
		
		JLabel results = new JLabel();
		JLabel results2 = new JLabel();
		f.setLayout(null);
		
		f.setTitle("Coin Flip");
		f.setVisible(true);
		f.setSize(400, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add objects to window
		f.add(flip);
		f.add(c.coin);
		f.add(c.coin1);
		f.add(c.coin2);
		f.add(twoFlip);
		f.add(results);
		f.add(results2);
		f.add(c.Q);
		f.add(c.P);
		
		//creating coin images
		
		f.add(c.heads);
		
		f.add(c.tails);
		
		
		f.add(c.heads2);
		
		f.add(c.tails2);
		
		
		
		f.add(c.PennyH);
		
		f.add(c.PennyT);
		
		
		f.add(c.PennyH2);
		
		f.add(c.PennyT2);
		
		
		
		f.add(d.Die);
		f.add(roll);
		f.add(roll2);
		f.add(d.SecondDie);
		d.Die.setBounds(100, 300, 200, 200);
		roll.setBounds(30,10,120, 40);
		roll2.setBounds(200,10,120, 40);
		d.SecondDie.setBounds(100, 500, 200, 200);
		
		
		//set placement in window
		flip.setBounds(130,100,120, 40);
		twoFlip.setBounds(130,200,120, 40);
		c.Q.setBounds(270,200,80, 40);
		c.P.setBounds(40,200,80, 40);
		
		
		results.setBounds(100, 30, 100, 100);
		results2.setBounds(140, 240, 100, 100);
		c.coin.setBounds(155, 100, 100, 100);
		c.coin1.setBounds(140, 210, 100, 100);
		c.coin2.setBounds(180, 210, 100, 100);
		c.heads.setBounds(100, 300, 200, 200);
		c.heads.setVisible(false);
		c.tails.setBounds(100, 300, 200, 200);
		c.tails.setVisible(false);
		c.heads2.setBounds(100, 500, 200, 200);
		c.heads2.setVisible(false);
		c.tails2.setBounds(100, 500, 200, 200);
		c.tails2.setVisible(false);
		
		c.PennyH.setBounds(100, 300, 200, 200);
		c.PennyH.setVisible(false);
		c.PennyT.setBounds(100, 300, 200, 200);
		c.PennyT.setVisible(false);
		c.PennyH2.setBounds(100, 500, 200, 200);
		c.PennyH2.setVisible(false);
		c.PennyT2.setBounds(100, 500, 200, 200);
		c.PennyT2.setVisible(false);
		
		//TODO set up location of die
		
		//adding actions performed when first button is pressed
		flip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				//Make sure all Coins are reset on click
				reset(c.heads, c.heads2, c.tails, c.tails2, c.PennyH, c.PennyH2, c.PennyT, c.PennyT2);
				
				d.Die.setVisible(false);
				d.SecondDie.setVisible(false);
				
				
				
				int coinresult = 3;
				//randomize flip
				coinresult = rand.nextInt(2);
				//do if flip is heads
				if(coinresult == 0) {
					c.coin.setText("Heads");
					flipResultsH++;
					//Which coin flips
					if (CC == false) {
						c.heads.setVisible(true);
					}
					else {
						c.PennyH.setVisible(true);
					}
				
				
				}
				//do if tails
				else if (coinresult == 1) {
					c.coin.setText("Tails");
					flipResultsT++;
					
					if (CC == false) {
						c.tails.setVisible(true);
					}
					else {
						c.PennyT.setVisible(true);
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
				reset(c.heads, c.heads2, c.tails, c.tails2, c.PennyH, c.PennyH2, c.PennyT, c.PennyT2);
				
				d.Die.setVisible(false);
				d.SecondDie.setVisible(false);
				
				//randomized both coins
				Random rand1 = new Random();
				Random rand2 = new Random();
				int coinresult1 = 3;
				int coinresult2 = 3;
				coinresult1 = rand1.nextInt(2);
				coinresult2 = rand2.nextInt(2);
				
				
				
				
				if(coinresult1 == 0) {
					c.coin1.setText("Heads");
					flipResults2H++;
					
					if (CC == false) {
						c.heads.setVisible(true);
					}
					else {
						c.PennyH.setVisible(true);
					}
					
				}
				else if (coinresult1 == 1) {
					c.coin1.setText("Tails");
					flipResults2T++;
					if (CC == false) {
						c.tails.setVisible(true);
					}
					else {
						c.PennyT.setVisible(true);
					}
					
				
				}
				
				if(coinresult2 == 0) {
					c.coin2.setText("Heads");
					flipResults2H++;
					if (CC == false) {
						c.heads2.setVisible(true);
					}
					else {
						c.PennyH2.setVisible(true);
					}
					
					
				}
				else if (coinresult2 == 1) {
					c.coin2.setText("Tails");
					flipResults2T++;
					
					if (CC == false) {
						c.tails2.setVisible(true);
					}
					else {
						c.PennyT2.setVisible(true);
					}
					
				}
				//record results of flips of both coins
				results2.setText("Heads: " + flipResults2H + " Tails: "+ flipResults2T);
			}
			
		});
		
		//Use Quarter when pushed
		c.Q.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CC = false;
				
			}
			
		});
		
		//Use penny when pushed
		c.P.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CC = true;
				
			}
			
		});
		
		
		roll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reset(c.heads, c.heads2, c.tails, c.tails2, c.PennyH, c.PennyH2, c.PennyT, c.PennyT2);
				
				d.Die.setVisible(true);
				d.SecondDie.setVisible(false);
				
				Random DR = new Random();
				
				int dieroll = DR.nextInt(6) + 1;
				
				switch (dieroll) {
				case 1:
					d.Die.setIcon(d.Die1);
					break;
				case 2:
					d.Die.setIcon(d.Die2);
					break;
				case 3:
					d.Die.setIcon(d.Die3);
					break;
				case 4:
					d.Die.setIcon(d.Die4);
					break;
				case 5:
					d.Die.setIcon(d.Die5);
					break;
				case 6:
					d.Die.setIcon(d.Die6);
					break;
				}
				
			}
			
		});
		
		roll2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reset(c.heads, c.heads2, c.tails, c.tails2, c.PennyH, c.PennyH2, c.PennyT, c.PennyT2);
				
				d.Die.setVisible(true);
				d.SecondDie.setVisible(true);
				
				Random DR = new Random();
				
				int dieroll = DR.nextInt(6) + 1;
				int dieroll2 = DR.nextInt(6) + 1;
				
				switch (dieroll) {
				case 1:
					d.Die.setIcon(d.Die1);
					break;
				case 2:
					d.Die.setIcon(d.Die2);
					break;
				case 3:
					d.Die.setIcon(d.Die3);
					break;
				case 4:
					d.Die.setIcon(d.Die4);
					break;
				case 5:
					d.Die.setIcon(d.Die5);
					break;
				case 6:
					d.Die.setIcon(d.Die6);
					break;
				}
				
				switch (dieroll2) {
				case 1:
					d.SecondDie.setIcon(d.Die1);
					break;
				case 2:
					d.SecondDie.setIcon(d.Die2);
					break;
				case 3:
					d.SecondDie.setIcon(d.Die3);
					break;
				case 4:
					d.SecondDie.setIcon(d.Die4);
					break;
				case 5:
					d.SecondDie.setIcon(d.Die5);
					break;
				case 6:
					d.SecondDie.setIcon(d.Die6);
					break;
				}
				
			}
			
		});
		
	}
	
	public void reset(JLabel heads, JLabel heads2, JLabel tails, JLabel tails2, JLabel PennyH, JLabel PennyH2, JLabel PennyT, JLabel PennyT2) {
		heads.setVisible(false);
		heads2.setVisible(false);
		tails.setVisible(false);
		tails2.setVisible(false);
		
		PennyH.setVisible(false);
		PennyT.setVisible(false);
		PennyH2.setVisible(false);
		PennyT2.setVisible(false);
	}
	//run program
	public static void main(String[] args) {
		new CoinFlip();
	}
}