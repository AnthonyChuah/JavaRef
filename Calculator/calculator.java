// Bare-bones calculator in Java.

import javax.swing.*;
import java.awt.event.*;

class Calc implements ActionListener {
    JFrame appframe;
    JTextField console;
    JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0,
	opdiv, opmul, opadd, opsub, butdecim, butequals, butdelete, butclear;
    static double left = 0, right = 0, result = 0;
    static int operator = 0;

    Calc() {
	// Call constructor for JFrame and name it JavaCanDoEverything.Calculator.
	appframe = new JFrame("JavaCanDoEverything.Calculator");
	// Call constructor for a text field, it starts empty so no arg needed.
	console = new JTextField();
	// Call constructors for each button. Notice how the arg is the label for the button.
	num1 = new JButton("1");
	num2 = new JButton("2");
	num3 = new JButton("3");
	num4 = new JButton("4");
	num5 = new JButton("5");
	num6 = new JButton("6");
	num7 = new JButton("7");
	num8 = new JButton("8");
	num9 = new JButton("9");
	num0 = new JButton("0");
	opdiv = new JButton("/");
	opmul = new JButton("*");
	opadd = new JButton("+");
	opsub = new JButton("-");
	butdecim = new JButton(".");
	butequals = new JButton("=");
	butdelete = new JButton("DEL");
	butclear = new JButton("CLR");

	// Now set the relative positions of all the buttons and console.
	// Component.setBounds(int x, int y, int width, int height). x and y coord are the TOP-LEFT corner.

	console.setBounds(20, 20, 300, 40);
	butclear.setBounds(20, 90, 75, 40);
	butdelete.setBounds(170, 90, 75, 40);
	opdiv.setBounds(245, 90, 75, 40);

	num7.setBounds(20, 130, 75, 40);
	num8.setBounds(95, 130, 75, 40);
	num9.setBounds(170, 130, 75, 40);
	opmul.setBounds(245, 130, 75, 40);

	num4.setBounds(20, 170, 75, 40);
	num5.setBounds(95, 170, 75, 40);
	num6.setBounds(170, 170, 75, 40);
	opsub.setBounds(245, 170, 75, 40);

	num1.setBounds(20, 210, 75, 40);
	num2.setBounds(95, 210, 75, 40);
	num3.setBounds(170, 210, 75, 40);
	opadd.setBounds(245, 210, 75, 40);

	num0.setBounds(95, 250, 75, 40);
	butdecim.setBounds(170, 250, 75, 40);
	butequals.setBounds(245, 250, 75, 40);

	// Add all the widgets to the appframe.
	appframe.add(console);
	appframe.add(num0);
	appframe.add(num1);
	appframe.add(num2);
	appframe.add(num3);
	appframe.add(num4);
	appframe.add(num5);
	appframe.add(num6);
	appframe.add(num7);
	appframe.add(num8);
	appframe.add(num9);
	appframe.add(opdiv);
	appframe.add(opmul);
	appframe.add(opsub);
	appframe.add(opadd);
	appframe.add(butclear);
	appframe.add(butdelete);
	appframe.add(butdecim);
	appframe.add(butequals);

	appframe.setLayout(null); // No layout manager (that's bad for more sophisticated apps!).
	appframe.setVisible(true); // Can be seen. You can have invisible frames. Useful!
	appframe.setSize(340, 340); // Sets the frame size.
	appframe.setResizable(false); // Frame cannot be resized.
	appframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the app once you close.

	num0.addActionListener(this);
	num1.addActionListener(this);
	num2.addActionListener(this);
	num3.addActionListener(this);
	num4.addActionListener(this);
	num5.addActionListener(this);
	num6.addActionListener(this);
	num7.addActionListener(this);
	num8.addActionListener(this);
	num9.addActionListener(this);
	opdiv.addActionListener(this);
	opmul.addActionListener(this);
	opsub.addActionListener(this);
	opadd.addActionListener(this);
	butclear.addActionListener(this);
	butdelete.addActionListener(this);
	butdecim.addActionListener(this);
	butequals.addActionListener(this);
    }

    public void actionPerformed(ActionEvent _event) {
	if (_event.getSource() == num0) {
	    console.setText(console.getText().concat("0"));
	}
	if (_event.getSource() == num1) {
	    console.setText(console.getText().concat("1"));
	}
	if (_event.getSource() == num2) {
	    console.setText(console.getText().concat("2"));
	}
	if (_event.getSource() == num3) {
	    console.setText(console.getText().concat("3"));
	}
	if (_event.getSource() == num4) {
	    console.setText(console.getText().concat("4"));
	}
	if (_event.getSource() == num5) {
	    console.setText(console.getText().concat("5"));
	}
	if (_event.getSource() == num6) {
	    console.setText(console.getText().concat("6"));
	}
	if (_event.getSource() == num7) {
	    console.setText(console.getText().concat("7"));
	}
	if (_event.getSource() == num8) {
	    console.setText(console.getText().concat("8"));
	}
	if (_event.getSource() == num9) {
	    console.setText(console.getText().concat("9"));
	}
	if (_event.getSource() == butdecim) {
	    console.setText(console.getText().concat("."));
	}
	if (_event.getSource() == opadd) {
	    left = Double.parseDouble(console.getText());
	    operator = 1; // Indicates that calculator is in add-mode.
	    console.setText("");
	}
	if (_event.getSource() == opsub) {
	    left = Double.parseDouble(console.getText());
	    operator = 2; // Indicates that calculator is in subtract-mode.
	    console.setText("");
	}
	if (_event.getSource() == opmul) {
	    left = Double.parseDouble(console.getText());
	    operator = 3; // Indicates that calculator is in multiply-mode.
	    console.setText("");
	}
	if (_event.getSource() == opdiv) {
	    left = Double.parseDouble(console.getText());
	    operator = 4; // Indicates that calculator is in divide-mode.
	    console.setText("");
	}
	if (_event.getSource() == butequals) {
	    right = Double.parseDouble(console.getText());
	    switch(operator) {
	    case 1: result = left + right;
		break;
	    case 2: result = left - right;
		break;
	    case 3: result = left * right;
		break;
	    case 4: result = left / right;
		break;
	    default: result = right;
	    }
	    console.setText("" + result); // Add result to blank string to "cast" to string.
	}
	if (_event.getSource() == butclear) {
	    console.setText("");
	    operator = 0; left = 0; right = 0;
	}
	if (_event.getSource() == butdelete) {
	    String current = console.getText();
	    String shorter = "";
	    for (int i = 0; i < current.length() - 1; ++i) {
		shorter = shorter + current.charAt(i);
	    }
	    console.setText(shorter);
	}
    }

    public static void main(String [] args) {
	new Calc();
    }
}
