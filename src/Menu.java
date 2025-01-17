import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Menu extends JFrame{
	Menu(){
		
		Font  f1  = new Font(Font.DIALOG,  Font.BOLD, 16);
		
		JLabel title = new JLabel("Menu");
		title.setBounds(180, 40, 80, 20);
		title.setForeground(Color.yellow);
		title.setFont(f1);
		add(title);
		
		Color purp = new Color(122,136,222);
		this.getContentPane().setBackground(purp);
		
		JLabel foodName = new JLabel("Food Name:");
		foodName.setBounds(100, 75, 100, 30);
		foodName.setForeground(Color.yellow);
		foodName.setFont(f1);
		add(foodName);
		
		JTextField nameInput = new JTextField();
		nameInput.setBounds(220, 75, 100, 30);
		add(nameInput);

		JLabel foodPrice = new JLabel("Price:");
		foodPrice.setBounds(100, 125, 100, 30);
		foodPrice.setForeground(Color.yellow);
		foodPrice.setFont(f1);
		add(foodPrice);
		
		JTextField priceInput = new JTextField();
		priceInput.setBounds(220, 125, 100, 30);
		add(priceInput);

		JButton addFood = new JButton("Add");
		addFood.setBounds(180, 190, 100, 40);
		addFood.setBackground(Color.yellow);
		add(addFood);
		
		
		setLayout(null);
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Menu();
	}

}
