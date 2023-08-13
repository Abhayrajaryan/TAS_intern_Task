package currencyconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame implements ActionListener {

    String[] currencies = {"INR", "DOLLAR", "YEN", "EURO", "RIYAL", "POUND"};
    JTextField toConvert, converted;
    JComboBox sourceBox, targetBox;
    Button convertButton;

    CurrencyConverter() {
        setLayout(null);
        setTitle("Currency Converter");

        JLabel heading = new JLabel("Currency Converter");
        heading.setFont(new Font("Raleway", Font.BOLD, 16));
        heading.setBounds(150, 10, 150, 30);
        add(heading);

        toConvert = new JTextField();
        toConvert.setFont(new Font("Ariel", Font.BOLD, 14));
        toConvert.setBounds(125, 60, 200, 30);
        add(toConvert);

        sourceBox = new JComboBox(currencies);
        sourceBox.setBounds(85, 120, 100, 25);
        sourceBox.setFont(new Font("Raleway", Font.BOLD, 10));
        sourceBox.addActionListener(this);
        add(sourceBox);

        JLabel to = new JLabel("TO");
        to.setFont(new Font("Raleway", Font.BOLD, 16));
        to.setBounds(205, 120, 30, 25);
        add(to);

        targetBox = new JComboBox(currencies);
        targetBox.setBounds(255, 120, 100, 25);
        targetBox.setFont(new Font("Raleway", Font.BOLD, 10));
        targetBox.addActionListener(this);
        add(targetBox);

        convertButton = new Button("CONVERT");
        convertButton.setFont(new Font("Raleway", Font.BOLD, 10));
        convertButton.setBounds(175, 180, 100, 25);
        convertButton.addActionListener(this);
        add(convertButton);

        converted = new JTextField();
        converted.setFont(new Font("Ariel", Font.BOLD, 14));
        converted.setBounds(125, 220, 200, 30);
        add(converted);

        setVisible(true);
        setSize(450, 300);
        setLocation(450, 250);
        Color color = new Color(171, 219, 227);
        getContentPane().setBackground(color);
    }

    public void actionPerformed(ActionEvent e) {
        String source = sourceBox.getSelectedItem().toString();
        String target = targetBox.getSelectedItem().toString();
        String amount = toConvert.getText();

        if (e.getSource() == convertButton) {

            if (amount.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount.");
            } else {
                double amt = Double.parseDouble(amount);
                double convertedAmount;

                switch (source) {
                    case "INR":
                        switch (target) {
                            case "INR":
                                converted.setText(amount);
                                break;
                            case "DOLLAR":
                                convertedAmount = amt * 0.012;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "YEN":
                                convertedAmount = amt * 1.72;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "EURO":
                                convertedAmount = amt * 0.011;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "RIYAL":
                                convertedAmount = amt * 0.046;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "POUND":
                                convertedAmount = amt * 0.0095;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                        }
                        break;
                    case "DOLLAR":
                        switch (target) {
                            case "INR":
                                convertedAmount = amt * 81.81;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "DOLLAR":
                                converted.setText(amount);
                                break;
                            case "YEN":
                                convertedAmount = amt * 141.10;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "EURO":
                                convertedAmount = amt * 0.90;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "RIYAL":
                                convertedAmount = amt * 3.75;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "POUND":
                                convertedAmount = amt * 0.78;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                        }
                        break;
                    case "YEN":
                        switch (target) {
                            case "INR":
                                convertedAmount = amt * 0.58;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "DOLLAR":
                                convertedAmount = amt * 0.0071;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "YEN":
                                converted.setText(amount);
                                break;
                            case "EURO":
                                convertedAmount = amt * 0.0064;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "RIYAL":
                                convertedAmount = amt * 0.027;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "POUND":
                                convertedAmount = amt * 0.0055;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                        }
                        break;
                    case "EURO":
                        switch (target) {
                            case "INR":
                                convertedAmount = amt * 90.71;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "DOLLAR":
                                convertedAmount = amt * 1.11;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "YEN":
                                convertedAmount = amt * 156.42;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "EURO":
                                converted.setText(amount);
                                break;
                            case "RIYAL":
                                convertedAmount = amt * 4.16;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "POUND":
                                convertedAmount = amt * 0.86;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                        }
                        break;
                    case "RIYAL":
                        switch (target) {
                            case "INR":
                                convertedAmount = amt * 21.81;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "DOLLAR":
                                convertedAmount = amt * 0.27;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "YEN":
                                convertedAmount = amt * 37.60;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "EURO":
                                convertedAmount = amt * 0.24;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "RIYAL":
                                converted.setText(amount);
                                break;
                            case "POUND":
                                convertedAmount = amt * 0.21;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                        }
                        break;
                    case "POUND":
                        switch (target) {
                            case "INR":
                                convertedAmount = amt * 104.92;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "DOLLAR":
                                convertedAmount = amt * 1.28;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "YEN":
                                convertedAmount = amt * 180.91;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "EURO":
                                convertedAmount = amt * 1.16;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "RIYAL":
                                convertedAmount = amt * 4.81;
                                converted.setText(String.valueOf(convertedAmount));
                                break;
                            case "POUND":
                                converted.setText(amount);
                                break;
                        }
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }

}
