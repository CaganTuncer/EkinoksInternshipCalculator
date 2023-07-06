package ekinoksinternshipcalculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiImp extends JFrame implements Gui {

	private InputProcessor InputProcessor = new InputProcessorImp();
	
	private JPanel contentPane;
	private final JButton btnNewButton_1 = new JButton("Subtract");
	private JButton btnNewButton = new JButton("Add");
	private JButton btnNewButton_1_1 = new JButton("Divide");
	private JButton btnNewButton_1_1_1 = new JButton("Multiply");
	private JLabel lblNewLabel = new JLabel("Number 1");
	private JLabel lblNumber = new JLabel("Number 2");
	private JLabel lblResult = new JLabel("Result");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiImp frame = new GuiImp();
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
	public GuiImp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnNewButton.setBounds(10, 232, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton_1.setBounds(105, 232, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
		btnNewButton_1_1.setBounds(200, 232, 85, 21);
		contentPane.add(btnNewButton_1_1);
		
		
		btnNewButton_1_1_1.setBounds(295, 232, 85, 21);
		contentPane.add(btnNewButton_1_1_1);
		
		
		lblNewLabel.setBounds(10, 24, 45, 13);
		contentPane.add(lblNewLabel);
		
		
		lblNumber.setBounds(10, 66, 45, 13);
		contentPane.add(lblNumber);
		
		
		lblResult.setBounds(10, 115, 45, 13);
		contentPane.add(lblResult);
		
		textField = new JTextField();
		textField.setBounds(65, 21, 174, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 63, 174, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(65, 112, 174, 19);
		contentPane.add(textField_2);
		
		JButton btnNewButton_2 = new JButton("ENG");
		btnNewButton_2.setBounds(341, 20, 85, 21);
		contentPane.add(btnNewButton_2);
	}

	@Override
	public void sendData(String[] inputs, boolean lang) {
		InputProcessor.calculate(inputs, lang);
	}
}
