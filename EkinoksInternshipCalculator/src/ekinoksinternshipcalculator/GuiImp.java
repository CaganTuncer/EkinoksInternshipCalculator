package ekinoksinternshipcalculator;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GuiImp extends JFrame implements Gui {

	private InputProcessor InputProcessor = new InputProcessorImp();

    String[] inputs;
    boolean lang;

    Locale defaultLocale = Locale.getDefault();
    String language = defaultLocale.getLanguage();

    private JPanel contentPane;
    private final JButton subtract = new JButton("Subtract");
    private JButton add = new JButton("Add");
    private JButton divide = new JButton("Divide");
    private JButton multiply = new JButton("Multiply");
    private JButton defaultLang = new JButton("Default Lang");
    private JRadioButton tr = new JRadioButton("TR");
    private JRadioButton eng = new JRadioButton("ENG");
    private JLabel lblnumber1 = new JLabel("Number 1");
    private JLabel lblnumber2 = new JLabel("Number 2");
    private JLabel lblResult = new JLabel("Result");
    private JTextArea textArea = new JTextArea();
    private JTextField number1 = new JTextField();
    private JTextField number2 = new JTextField();

    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public GuiImp() {
    	inputs = new String[3];
        lang = true;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);


        add.setBounds(10, 232, 85, 21);
        contentPane.add(add);
        subtract.setBounds(105, 232, 85, 21);
        contentPane.add(subtract);


        divide.setBounds(200, 232, 85, 21);
        contentPane.add(divide);


        multiply.setBounds(295, 232, 85, 21);
        contentPane.add(multiply);


        lblnumber1.setBounds(10, 24, 45, 13);
        contentPane.add(lblnumber1);


        lblnumber2.setBounds(10, 66, 45, 13);
        contentPane.add(lblnumber2);


        lblResult.setBounds(10, 115, 45, 13);
        contentPane.add(lblResult);


        number1.setBounds(65, 24, 174, 19);
        contentPane.add(number1);
        number1.setColumns(10);


        number2.setColumns(10);
        number2.setBounds(65, 66, 174, 19);
        contentPane.add(number2);


        defaultLang.setBounds(323, 66, 103, 21);
        contentPane.add(defaultLang);


        tr.setBounds(323, 20, 103, 21);
        contentPane.add(tr);


        eng.setBounds(323, 43, 103, 21);
        contentPane.add(eng);


        textArea.setBounds(68, 114, 171, 16);
        contentPane.add(textArea);

        sendData();
    }

    //@Override
    public void sendData() {
        ActionListener trSelected = new ActionListener(){
          public void actionPerformed(ActionEvent e){
              eng.setSelected(false);
              setLang(false);
          }
        };
        tr.addActionListener(trSelected);

        ActionListener engSelected = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tr.setSelected(false);
                setLang(true);
            }
        };
        eng.addActionListener(engSelected);
        ActionListener adder = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tr.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "add");
                    InputProcessor.calculate(inputs, lang);
                } else if(eng.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "add");
                    InputProcessor.calculate(inputs, lang);
                }
            }
        };
        add.addActionListener(adder);

        ActionListener subber = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tr.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "sub");
                    InputProcessor.calculate(inputs, lang);
                } else if(eng.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "sub");
                    InputProcessor.calculate(inputs, lang);
                }
            }
        };
        subtract.addActionListener(subber);

        ActionListener divider = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tr.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "divide");
                    InputProcessor.calculate(inputs, lang);
                } else if(eng.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "divide");
                    InputProcessor.calculate(inputs, lang);
                }
            }
        };
        divide.addActionListener(divider);

        ActionListener multiplier = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tr.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "multiply");
                    InputProcessor.calculate(inputs, lang);
                } else if(eng.isSelected()) {
                    String input1 = number1.getText();
                    String input2 = number2.getText();
                    setInputs(input1, input2, "multiply");
                    InputProcessor.calculate(inputs, lang);
                }
            }
        };
        multiply.addActionListener(multiplier);

        ActionListener defaultButton = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                defaultLangSet();
            }
        };
        defaultLang.addActionListener(defaultButton);
    }
    public void setLang(boolean lang) {
        this.lang = lang;
        System.out.println(this.lang);
    }
    public void setInputs(String in1, String in2, String op) {
        this.inputs[0] = in1;
        this.inputs[1] = in2;
        this.inputs[2] = op;
    }
    public void defaultLangSet() {
        if(language.equals("tr")) {
            this.eng.setSelected(false);
            this.tr.setSelected(true);
            this.lang = false;
        } else if(language.equals("en")) {
            this.eng.setSelected(true);
            this.tr.setSelected(false);
            this.lang = true;
        } else {
            System.out.println("This language is not supported");
        }
    }

    public void printInputs(){
        for(int i = 0; i < 3; i++){
            System.out.println(this.inputs[i]);
        }
    }

}
