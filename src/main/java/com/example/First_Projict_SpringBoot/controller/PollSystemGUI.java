package com.example.First_Projict_SpringBoot.controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class PollSystemGUI {

    class PollFrame extends JFrame {

        private JRadioButton[] question1Options;
        private JRadioButton[] question2Options;
        private ButtonGroup group1, group2;
        private JButton submitButton;

        public PollFrame() {
            setTitle("Poll System");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(3, 1));

            JPanel question1Panel = new JPanel();
            question1Panel.setBorder(BorderFactory.createTitledBorder("Between the following, what do you most love to do?"));
            question1Options = createRadioButtons(new String[]{"Watch TV", "Play the computer", "Hanging out with friends", "Travel the world"}, question1Panel);
            group1 = createButtonGroup(question1Options);
            add(question1Panel);

            JPanel question2Panel = new JPanel();
            question2Panel.setBorder(BorderFactory.createTitledBorder("Where is your preferred place to travel?"));
            question2Options = createRadioButtons(new String[]{"USA", "France", "South America", "Thailand"}, question2Panel);
            group2 = createButtonGroup(question2Options);
            add(question2Panel);

            submitButton = new JButton("Submit");
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String answer1 = getSelectedButtonText(group1);
                    String answer2 = getSelectedButtonText(group2);
                    JOptionPane.showMessageDialog(null, "Your answers are:\n1. " + answer1 + "\n2. " + answer2);
                }
            });
            add(submitButton);
        }

        private JRadioButton[] createRadioButtons(String[] options, JPanel panel) {
            JRadioButton[] radioButtons = new JRadioButton[options.length];
            for (int i = 0; i < options.length; i++) {
                radioButtons[i] = new JRadioButton(options[i]);
                panel.add(radioButtons[i]);
            }
            return radioButtons;
        }

        private ButtonGroup createButtonGroup(JRadioButton[] radioButtons) {
            ButtonGroup group = new ButtonGroup();
            for (JRadioButton radioButton : radioButtons) {
                group.add(radioButton);
            }
            return group;
        }

        private String getSelectedButtonText(ButtonGroup buttonGroup) {
            for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
                AbstractButton button = buttons.nextElement();

                if (button.isSelected()) {
                    return button.getText();
                }
            }
            return null;

        }
    }
}
