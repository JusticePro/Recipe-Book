package me.justicepro.recipebook;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setTitle("Recipe Book");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(960, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		textField = new JTextField();
		
		JLabel lblAllRecipes = new JLabel("All Recipes: $FOUND$");
		lblAllRecipes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Desktop.getDesktop().browse(new URI("http://allrecipes.com/search/results/?wt=" + textField.getText().replaceAll(" ", "%20")));
				} catch (IOException | URISyntaxException exe) {
					// TODO Auto-generated catch block
					exe.printStackTrace();
				}
			}
		});
		lblAllRecipes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblFoodNetworkfound = new JLabel("Food Network: $FOUND$");
		lblFoodNetworkfound.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Desktop.getDesktop().browse(new URI("http://www.foodnetwork.com/search/" + textField.getText().replaceAll(" ", "%20") + "-"));
				} catch (IOException | URISyntaxException exe) {
					// TODO Auto-generated catch block
					exe.printStackTrace();
				}
			}
		});
		lblFoodNetworkfound.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblInspiredtastefound = new JLabel("Inspired Taste: $FOUND$");
		lblInspiredtastefound.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://www.inspiredtaste.net/?s=" + textField.getText().replaceAll(" ", "%20")));
				} catch (IOException | URISyntaxException exe) {
					// TODO Auto-generated catch block
					exe.printStackTrace();
				}
			}
		});
		lblInspiredtastefound.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNerdyNummiesrosanna = new JLabel("Nerdy Nummies: $FOUND$");
		lblNerdyNummiesrosanna.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://rosannapansino.com/?s=" + textField.getText().replaceAll(" ", "%20")));
				} catch (IOException | URISyntaxException exe) {
					// TODO Auto-generated catch block
					exe.printStackTrace();
				}
			}
		});
		lblNerdyNummiesrosanna.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblInstructablesfound = new JLabel("Instructables: $FOUND$");
		lblInstructablesfound.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.instructables.com/howto/" + textField.getText().replaceAll(" ", "%20")));
				} catch (IOException | URISyntaxException exe) {
					// TODO Auto-generated catch block
					exe.printStackTrace();
				}
			}
		});
		lblInstructablesfound.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(564, Short.MAX_VALUE)
					.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblFoodNetworkfound, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
						.addComponent(lblAllRecipes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(lblInspiredtastefound, GroupLayout.PREFERRED_SIZE, 934, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(lblNerdyNummiesrosanna, GroupLayout.PREFERRED_SIZE, 934, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(lblInstructablesfound, GroupLayout.PREFERRED_SIZE, 934, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAllRecipes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFoodNetworkfound, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInspiredtastefound, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNerdyNummiesrosanna, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInstructablesfound, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
					.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField.getText().equalsIgnoreCase("")) {
					lblFoodNetworkfound.setText("Food Network: " + textField.getText());
					lblInspiredtastefound.setText("Inspired Taste: " + textField.getText());
					lblInstructablesfound.setText("Instructables: " + textField.getText());
					lblNerdyNummiesrosanna.setText("Nerdy Nummies: " + textField.getText());
					lblAllRecipes.setText("All Recipes: " + textField.getText());
				}else {
					JOptionPane.showMessageDialog(null, "You can't input nothing.");
				}
			}
		});
		
	}
	
}