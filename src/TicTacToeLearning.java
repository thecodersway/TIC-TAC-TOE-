import java.awt.EventQueue; 


import javax.swing.JFrame;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
public class TicTacToeLearning {

	private JFrame frame;
	private JLabel xcount;
	private int xcount1=0;
	private int ocount1=0;
	private int totalcount=0;
	private String startgame="X";
     private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
private JLabel oCount;
private JLabel Totalcount;
private int b1=10;
private int b2=10;
private int b3=10;
private int b4=10;
private int b5=10;
private int b6=10;
private int b7=10;
private int b8=10;
private int b9=10;
private int i=0;	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeLearning window = new TicTacToeLearning();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void date() {
		
		LocalDate now=LocalDate.now();
		
		lblNewLabel_4.setText(String.valueOf(now));
	}
	public void clock()
	{
		Thread clock=new Thread()
		{
		public void run() {	
		try {
			while(true) {
		LocalTime now=LocalTime.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("hh:mm:ss a");
		lblNewLabel_3.setText(String.valueOf(now.format(d)));
		sleep(1000);
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		};clock.start();
	}
	

	/**
	 * Create the application.
	 */
	public TicTacToeLearning() {
		initialize();
	}
	private void winningGame()
	{
		if(b1==1 &&b2==1&&b3==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b4==1 &&b5==1&&b6==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b7==1 &&b8==1&&b9==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b1==1 &&b4==1&&b7==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b2==1 &&b5==1&&b8==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b3==1 &&b6==1&&b9==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b1==1 &&b5==1&&b9==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b3==1 &&b5==1&&b7==1)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER X WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			xcount.setText(String.valueOf(xcount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b1==0 &&b2==0&&b3==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b4==0 &&b5==0&&b6==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b7==0 &&b8==0&&b9==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b1==0 &&b5==0&&b9==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b3==0 &&b5==0&&b7==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b1==0 &&b4==0&&b7==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b2==0 &&b5==0&&b8==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(b3==0 &&b6==0&&b9==0)
		{
			JOptionPane.showMessageDialog(frame,"PLAYER 0 WINS","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			ocount1++;
			oCount.setText(String.valueOf(ocount1));
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		else if(i==9)
		{
			JOptionPane.showMessageDialog(frame,"ITS A TIE","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			totalcount++;
			Totalcount.setText(String.valueOf(totalcount));
		}
		
	}
	
	
private void choosePlayer()
{
	if(startgame.equalsIgnoreCase("X"))
		startgame="O";
	else
		startgame="X";
}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 5, 2, 2));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
	   final	JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.getText()!="X" && btn1.getText()!="O") {
				btn1.setText(startgame);
				
				if(startgame.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.RED);
					b1=1;i++;
				}
				else {
					btn1.setForeground(Color.BLUE);
				b1=0;i++;}
				choosePlayer();
				winningGame();
				
			}}
		});
		panel_1.add(btn1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.getText()!="X" && btn2.getText()!="O") {
				btn2.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
					b2=1;i++;
				}
				else {
					btn2.setForeground(Color.BLUE);
				b2=0;i++;}
				choosePlayer();
				winningGame();
			}}
		});
		panel_2.add(btn2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn3.getText()!="X" && btn3.getText()!="O") {
				btn3.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
					b3=1;i++;
				}
				else {
					btn3.setForeground(Color.BLUE);
				b3=0;i++;
				
			}
				choosePlayer();
				winningGame();
			}}
			
		});
		panel_3.add(btn3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		xcount = new JLabel();
		panel_5.add(xcount);
		xcount.setHorizontalAlignment(SwingConstants.CENTER);
		xcount.setFont(new Font("Tahoma", Font.BOLD, 99));
		xcount.setText("0");
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.getText()!="X" && btn4.getText()!="O") {
				btn4.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
					b4=1;i++;
				}
				else {
					btn4.setForeground(Color.BLUE);
				b4=0;i++;}
				choosePlayer();
				winningGame();
			}}
		});
		panel_6.add(btn4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
	  final	JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn5.getText()!="X" && btn5.getText()!="O") {
				btn5.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
					b5=1;i++;
				}
				else {
					btn5.setForeground(Color.BLUE);
				b5=0;i++;
			}				choosePlayer();
			winningGame();
			}}
		});
		panel_7.add(btn5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn6.getText()!="X" && btn6.getText()!="O") {
				btn6.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
					b6=1;i++;
				}
				else {
					btn6.setForeground(Color.BLUE);
					b6=0;i++;}
				choosePlayer();
				winningGame();
			}}
		});
		panel_8.add(btn6);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblNewLabel_1 = new JLabel("PLAYER 0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_10.add(lblNewLabel_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		oCount = new JLabel();
		panel_11.add(oCount);
		oCount.setFont(new Font("Tahoma", Font.BOLD, 99));
		oCount.setText("0");
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.getText()!="X" && btn7.getText()!="O") {
				btn7.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
					b7=1;i++;
				}
				else {
					btn7.setForeground(Color.BLUE);
				b7=0;i++;}
				choosePlayer();
				winningGame();
			}}
		});
		panel_12.add(btn7);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.getText()!="X" && btn8.getText()!="O") {
				btn8.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
					b8=1;i++;
				}
				else {
				btn8.setForeground(Color.BLUE);
					b8=0;i++;}
				choosePlayer();
				winningGame();
			}}
		});
		panel_13.add(btn8);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		final JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.getText()!="X" && btn9.getText()!="O") {
				btn9.setText(startgame);
				if(startgame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
					b9=1;i++;
				}
				else {
					btn9.setForeground(Color.BLUE);
					b9=0;i++;
				}				choosePlayer();winningGame();
				
			}}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_14.add(btn9);
		
		
		
		
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL GAMES");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel_16.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_17.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_17.setBounds(0,0,100,100);
		panel.add(panel_17);
		
		Totalcount = new JLabel();
		panel_17.add(Totalcount);
		Totalcount.setHorizontalAlignment(SwingConstants.CENTER);
		Totalcount.setFont(new Font("Tahoma", Font.BOLD, 99));
		Totalcount.setText("0");
		
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 1, 0, 0));
		
		 lblNewLabel_3 = new JLabel("");
		 lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel_18.add(lblNewLabel_3);
		
		
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_19);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));
	 lblNewLabel_4 = new JLabel("");
	 lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel_19.add(lblNewLabel_4);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_20);
		
		panel_20.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel image = new JLabel("");
		panel_20.add(image);
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setIcon(new ImageIcon(TicTacToeLearning.class.getResource("/tictactoe.jpg")));
		
		
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
b1=10;
b2=10;
b3=10;
b4=10;
b5=10;
b6=10;
b7=10;
b8=10;
b9=10;


			i=0;
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel_15.add(btnNewButton);

		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnexit = new JButton("EXIT");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}	
				});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel_9.add(btnexit, BorderLayout.CENTER);
		
		
		clock();
		date();
	}

}
	


