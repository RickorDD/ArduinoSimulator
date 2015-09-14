import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimulatorFrame extends JFrame implements ActionListener {

    JComboBox comboD1;
    JComboBox comboD2;
    JComboBox comboD3;
    JComboBox comboD4;
    JComboBox comboD5;
    JComboBox comboD6;
    JComboBox comboD7;
    JComboBox comboD8;
    JComboBox comboD9;
    JComboBox comboD10;
    JComboBox comboD11;
    JComboBox comboD12;
    JComboBox comboD13;

    JLabel textD1;
    JLabel textD2;
    JLabel textD3;
    JLabel textD4;
    JLabel textD5;
    JLabel textD6;
    JLabel textD7;
    JLabel textD8;
    JLabel textD9;
    JLabel textD10;
    JLabel textD11;
    JLabel textD12;
    JLabel textD13;

    JLabel textA0;
    JLabel textA1;
    JLabel textA2;
    JLabel textA3;
    JLabel textA4;
    JLabel textA5;
    JLabel textblind;

    JTextField textFieldA0;
    JTextField textFieldA1;
    JTextField textFieldA2;
    JTextField textFieldA3;
    JTextField textFieldA4;
    JTextField textFieldA5;

    JButton button1;

    GridBagLayout layout = new GridBagLayout();

    public SimulatorFrame(String name) {
	super(name);
	setResizable(false);

    }

    private static void createGUI() {

	SimulatorFrame frame = new SimulatorFrame("Simulator");
	frame.setBounds(550, 100, 200, 450);
	frame.addComponents(frame.getContentPane());
	frame.setVisible(true);
    }

    public void addComponents(Container pane) {
	String[] Select = { " ", "0", "1" };

	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	comboD1 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 0;
	pane.add(comboD1, c);
	comboD1.addActionListener(this);

	comboD2 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 1;
	pane.add(comboD2, c);

	comboD3 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 2;
	pane.add(comboD3, c);

	comboD4 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 3;
	pane.add(comboD4, c);

	comboD5 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 4;
	pane.add(comboD5, c);

	comboD6 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 5;
	pane.add(comboD6, c);

	comboD7 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 6;
	pane.add(comboD7, c);

	comboD8 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 7;
	pane.add(comboD8, c);

	comboD9 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 8;
	pane.add(comboD9, c);

	comboD10 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 9;
	pane.add(comboD10, c);

	comboD11 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 10;
	pane.add(comboD11, c);

	comboD12 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 11;
	pane.add(comboD12, c);

	comboD13 = new JComboBox(Select);
	c.gridx = 0;
	c.gridy = 12;
	pane.add(comboD13, c);

	textD1 = new JLabel("D1");
	textD1.setFont(textD1.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 0;
	pane.add(textD1, c);

	textD2 = new JLabel("D2");
	textD2.setFont(textD1.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 1;
	pane.add(textD2, c);

	textD3 = new JLabel("D3");
	textD3.setFont(textD3.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 2;
	pane.add(textD3, c);

	textD4 = new JLabel("D4");
	textD4.setFont(textD4.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 3;
	pane.add(textD4, c);

	textD5 = new JLabel("D5");
	textD5.setFont(textD5.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 4;
	pane.add(textD5, c);

	textD6 = new JLabel("D6");
	textD6.setFont(textD6.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 5;
	pane.add(textD6, c);

	textD7 = new JLabel("D7");
	textD7.setFont(textD7.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 6;
	pane.add(textD7, c);

	textD8 = new JLabel("D8");
	textD8.setFont(textD8.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 7;
	pane.add(textD8, c);

	textD9 = new JLabel("D9");
	textD9.setFont(textD9.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 8;
	pane.add(textD9, c);

	textD10 = new JLabel(" D10");
	textD10.setFont(textD10.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 9;
	pane.add(textD10, c);

	textD11 = new JLabel(" D11");
	textD11.setFont(textD11.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 10;
	pane.add(textD11, c);

	textD12 = new JLabel(" D12");
	textD12.setFont(textD12.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 11;
	pane.add(textD12, c);

	textD13 = new JLabel(" D13");
	textD13.setFont(textD13.getFont().deriveFont(Font.BOLD));
	c.gridx = 1;
	c.gridy = 12;
	pane.add(textD13, c);

	textFieldA0 = new JTextField(3);
	c.gridx = 2;
	c.gridy = 0;
	pane.add(textFieldA0, c);
	textFieldA0.addActionListener(this);

	textFieldA1 = new JTextField(3);
	c.gridx = 2;
	c.gridy = 1;
	pane.add(textFieldA1, c);

	textFieldA2 = new JTextField(3);
	c.gridx = 2;
	c.gridy = 2;
	pane.add(textFieldA2, c);

	textFieldA3 = new JTextField(3);
	c.gridx = 2;
	c.gridy = 3;
	pane.add(textFieldA3, c);

	textFieldA4 = new JTextField(3);
	c.gridx = 2;
	c.gridy = 4;
	pane.add(textFieldA4, c);

	textFieldA5 = new JTextField(3);
	c.gridx = 2;
	c.gridy = 5;
	pane.add(textFieldA5, c);

	textA0 = new JLabel(" A0 ");
	textA0.setFont(textA0.getFont().deriveFont(Font.BOLD));
	c.gridx = 3;
	c.gridy = 0;
	pane.add(textA0, c);

	textA1 = new JLabel(" A1 ");
	textA1.setFont(textA1.getFont().deriveFont(Font.BOLD));
	c.gridx = 3;
	c.gridy = 1;
	pane.add(textA1, c);

	textA2 = new JLabel(" A2 ");
	textA2.setFont(textA2.getFont().deriveFont(Font.BOLD));
	c.gridx = 3;
	c.gridy = 2;
	pane.add(textA2, c);

	textA3 = new JLabel(" A3 ");
	textA3.setFont(textA3.getFont().deriveFont(Font.BOLD));
	c.gridx = 3;
	c.gridy = 3;
	pane.add(textA3, c);

	textA4 = new JLabel(" A4 ");
	textA4.setFont(textA4.getFont().deriveFont(Font.BOLD));
	c.gridx = 3;
	c.gridy = 4;
	pane.add(textA4, c);

	textA5 = new JLabel(" A5 ");
	textA5.setFont(textA5.getFont().deriveFont(Font.BOLD));
	c.gridx = 3;
	c.gridy = 5;
	pane.add(textA5, c);

	textblind = new JLabel("          ");
	c.gridx = 0;
	c.gridy = 13;
	c.gridwidth = 4;
	pane.add(textblind, c);

	button1 = new JButton("Speichern");
	c.gridx = 0;
	c.gridy = 14;
	c.gridwidth = 3;
	pane.add(button1, c);
	button1.addActionListener(this);
    }

    public void addFileAnalog() {
	try {
	    FileWriter fw;
	    fw = new FileWriter(new File("C:\\Daten\\C++\\TRED\\analogvalue.txt"));
	    String TextA0 = textFieldA0.getText();
	    String TextA1 = textFieldA1.getText();
	    String TextA2 = textFieldA2.getText();
	    String TextA3 = textFieldA3.getText();
	    String TextA4 = textFieldA4.getText();
	    String TextA5 = textFieldA5.getText();
	    if (!TextA0.isEmpty()) {
	    	fw.write("0");
		fw.write(" ");
		fw.write(TextA0);
		fw.write(System.lineSeparator());
	    }
	    if (!TextA1.isEmpty()) {
		fw.write("1");
		fw.write(" ");
		fw.write(TextA1);
		fw.write(System.lineSeparator());
	    }
	    if (!TextA2.isEmpty()) {
		fw.write("2");
		fw.write(" ");
		fw.write(TextA2);
		fw.write(System.lineSeparator());
	    }
	    if (!TextA3.isEmpty()) {
		fw.write("3");
		fw.write(" ");
		fw.write(TextA3);
		fw.write(System.lineSeparator());
	    }
	    if (!TextA4.isEmpty()) {
		fw.write("4");
		fw.write(" ");
		fw.write(TextA4);
		fw.write(System.lineSeparator());
	    }
	    if (!TextA5.isEmpty()) {
		fw.write("5");
		fw.write(" ");
		fw.write(TextA5);
		fw.write(System.lineSeparator());
	    }
	    fw.close();
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
    }

    public void addFileDigital() {
	try {
	    FileWriter fw;
	    fw = new FileWriter(new File("C:\\Daten\\C++\\TRED\\digitalvalue.txt"));
	    String SelectionD1 = (String) comboD1.getSelectedItem();
	    String SelectionD2 = (String) comboD2.getSelectedItem();
	    String SelectionD3 = (String) comboD3.getSelectedItem();
	    String SelectionD4 = (String) comboD4.getSelectedItem();
	    String SelectionD5 = (String) comboD5.getSelectedItem();
	    String SelectionD6 = (String) comboD6.getSelectedItem();
	    String SelectionD7 = (String) comboD7.getSelectedItem();
	    String SelectionD8 = (String) comboD8.getSelectedItem();
	    String SelectionD9 = (String) comboD9.getSelectedItem();
	    String SelectionD10 = (String) comboD10.getSelectedItem();
	    String SelectionD11 = (String) comboD11.getSelectedItem();
	    String SelectionD12 = (String) comboD12.getSelectedItem();
	    String SelectionD13 = (String) comboD13.getSelectedItem();
	    if (SelectionD1 != " ") {
		fw.write("1");
		fw.write(" ");
		fw.write(SelectionD1);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD2 != " ") {
		fw.write("2");
		fw.write(" ");
		fw.write(SelectionD2);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD3 != " ") {
		fw.write("3");
		fw.write(" ");
		fw.write(SelectionD3);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD4 != " ") {
		fw.write("4");
		fw.write(" ");
		fw.write(SelectionD4);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD5 != " ") {
		fw.write("5");
		fw.write(" ");
		fw.write(SelectionD5);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD6 != " ") {
		fw.write("6");
		fw.write(" ");
		fw.write(SelectionD6);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD7 != " ") {
		fw.write("7");
		fw.write(" ");
		fw.write(SelectionD7);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD8 != " ") {
		fw.write("8");
		fw.write(" ");
		fw.write(SelectionD8);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD9 != " ") {
		fw.write("9");
		fw.write(" ");
		fw.write(SelectionD9);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD10 != " ") {
		fw.write("10");
		fw.write(" ");
		fw.write(SelectionD10);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD11 != " ") {
		fw.write("11");
		fw.write(" ");
		fw.write(SelectionD11);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD12 != " ") {
		fw.write("12");
		fw.write(" ");
		fw.write(SelectionD12);
		fw.write(System.lineSeparator());
	    }
	    if (SelectionD13 != " ") {
		fw.write("13");
		fw.write(" ");
		fw.write(SelectionD13);
		fw.write(System.lineSeparator());
	    }
	    fw.close();
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button1) {
	    addFileDigital();
	    addFileAnalog();
	}
    }

    public void windowClosing(WindowEvent e) {
	dispose();
	System.exit(0);
    }

    public static void main(String[] args) {
	createGUI();
    }
}
