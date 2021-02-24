package Lesson7.Homework;

import Lesson7.online.GameMap;
import Lesson7.online.MainWindow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 280;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    private static final int MIN_WIN_LENGTH_SIZE = 3;
    private static final int MAX_WIN_LENGTH_SIZE = 10;

    private JRadioButton humanVsHuman;
    private JRadioButton humanVsAi;
    private JSlider sliderFieldSize;
    private JSlider sliderWinLength;


    private MainWindow mainWindow;

    SettingsWindow(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Игра Крестики-Нолики (Настройки)");

        Rectangle rectangle = mainWindow.getBounds();
        int posX = (int)rectangle.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int)rectangle.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);

        setLayout(new GridLayout(11, 1));

        addGameModeControl();
        addFieldControl();

        JButton btnStartGame = new JButton("Новая игра");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonStartClick();
            }
        });

        add(btnStartGame);
    }

    private void addGameModeControl() {
        add(new JLabel("Режим игры"));
        humanVsHuman = new JRadioButton("Играть против человека", true);
        humanVsAi = new JRadioButton("Играть против Ai");

        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add(humanVsHuman);
        gameMode.add(humanVsAi);

        add(humanVsHuman);
        add(humanVsAi);
    }

    private void addFieldControl() {

        JLabel lbFieldSize = new JLabel("Размер поля: " + MIN_FIELD_SIZE);
        JLabel lbWinLength = new JLabel("Выигрышная комбинация: " + MIN_WIN_LENGTH_SIZE);

        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderFieldSize.getValue();
                lbFieldSize.setText("Размер поля: " + currentValue);
                sliderWinLength.setMaximum(currentValue);
            }
        });


        sliderWinLength = new JSlider(MIN_WIN_LENGTH_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (sliderWinLength.getValue() == 3){
                    lbWinLength.setText("Выигрышная комбинация: " + sliderWinLength.getValue());
                } else {
                    lbWinLength.setText("Выигрышная комбинация: " + (sliderWinLength.getValue() - 1));
                }
            }
        });


        add(new JLabel("Выбрать размер поля:"));
        add(lbFieldSize);
        add(sliderFieldSize);
        add(new JLabel("Выбрать выигрышная комбинация:"));
        add(lbWinLength);
        add(sliderWinLength);

    }

    private void buttonStartClick() {
        int gameMode;

        if (humanVsHuman.isSelected()) {
            gameMode = GameMap.GM_HVH;
        } else if (humanVsAi.isSelected()) {
            gameMode = GameMap.GM_HVA;
        } else {
            throw new RuntimeException("Выбранный режим игры не существует!");
        }

        int fieldSize = sliderFieldSize.getValue();
        int winLen = sliderWinLength.getValue();

        mainWindow.startGame(gameMode, fieldSize, fieldSize, winLen);
//        mainWindow.startGame(gameMode, sliderFieldSize.getValue(), sliderFieldSize.getValue(), sliderWinLength.getValue());

        setVisible(false);

    }
}
