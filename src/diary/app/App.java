package diary.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollBar;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class App {

	private JFrame frame;
	private JTextField textField;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	DefaultListModel<String> initModel;
	private JScrollPane scrollPane;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		initModel = new DefaultListModel<>();
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				if(!text.equals("")) {
					textField.setText("");
					initModel.addElement(text);
					list.setModel(initModel);
				}
			}
		});
		btnNewButton.setBounds(465, 31, 62, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(214, 32, 241, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 192, 239);
		frame.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnNewButton_1 = new JButton("Delete Selected");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				if(index >= 0) {
					initModel.remove(index);  
					list.setModel(initModel);
				}
			}
		});
		btnNewButton_1.setBounds(433, 92, 107, 52);
		frame.getContentPane().add(btnNewButton_1);
			
	}
}
