//package Lesson7.Homework;
//
//import Lesson7.online.GameMap;
//import Lesson7.online.MainWindow;
//
//import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SettingsWindow extends JFrame {
//
//    private static final int WINDOW_WIDTH = 350;
//    private static final int WINDOW_HEIGHT = 280;
//    private static final int MIN_FIELD_SIZE = 3;
//    private static final int MAX_FIELD_SIZE = 10;
//    private static final int MIN_WIN_LENGTH_SIZE = 3;
//    private static final int MAX_WIN_LENGTH_SIZE = 10;
//
//    private JRadioButton humanVsHuman;
//    private JRadioButton humanVsAi;
//    private JSlider sliderFieldSize;
//    private JSlider sliderWinLength;
//
//    private MainWindow mainWindow;
//
//    SettingsWindow(MainWindow mainWindow){
//        this.mainWindow = mainWindow;
//        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //задаётся размер окна
//        setTitle("Игра Крестики-Нолики (Настройки)"); //Название окна
//        Rectangle rectangle = mainWindow.getBounds(); //
//        int posX = (int)rectangle.getCenterX() - WINDOW_WIDTH / 2; //Определение точки по оси Х, вычисляя половину длины от края основного окна до центра
//        int posY = (int)rectangle.getCenterY() - WINDOW_HEIGHT / 2; //Определение точки по оси У, вычисляя половину высоты от края основного окна до центра
//        setLocation(posX, posY); //передача точки отрисовки окна
//        setResizable(false); //отключене изменения размера окна
//        setLayout(new GridLayout(11, 1)); //создание шаблона для настроек
//        addGameModeControl(); //добавлене настроек режима игры в окно
//        addFieldControl(); //добавление настроек поля в окно
//        JButton btnStartGame = new JButton("Новая игра"); //создание объекта кнопки старта игры
//        btnStartGame.addActionListener(new ActionListener() { //создание листнера для кнопки старта игры
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                buttonStartClick();
//            }
//        });
//        add(btnStartGame); //добавление кнопки старта игры в окно
//    }
//
//    private void addGameModeControl() { //создание настроек режима игры
//        add(new JLabel("Режим игры")); //создание заголовка раздела
//        humanVsHuman = new JRadioButton("Играть против человека", true); //радиобаттон для выбора режима игры
//        humanVsAi = new JRadioButton("Играть против Ai"); //радиобаттон для выбора режима игры
//        ButtonGroup gameMode = new ButtonGroup(); //создание группы объединения для радиобаттонов
//        gameMode.add(humanVsHuman); //добавление радиобаттона в группу
//        gameMode.add(humanVsAi);//добавление радиобаттона в группу
//        add(humanVsHuman);
//        add(humanVsAi);
//    }
//
//    private void addFieldControl() { //создание настроек для игрового поля
//        JLabel lbFieldSize = new JLabel("Размер поля: " + MIN_FIELD_SIZE); //создание объекта ползунка для размера поля с указанием минимального размера
//        JLabel lbWinLength = new JLabel("Выигрышная комбинация: " + MIN_WIN_LENGTH_SIZE); //создание объекта ползунка для выигрышной комбинации с указанием минимального значения
//        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE); //создание ползунка поля с мин, макс, и дефолтным (мин) значениями
//        sliderFieldSize.addChangeListener(new ChangeListener() { //создание листнера ползунка с переопределением метода
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                int currentValue = sliderFieldSize.getValue(); //переменная для получения текущего значения ползунка
//                lbFieldSize.setText("Размер поля: " + currentValue); //вывод текущего значения ползунка
//                sliderWinLength.setMaximum(currentValue);
//            }
//        });
//
//        sliderWinLength = new JSlider(MIN_WIN_LENGTH_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);//создание ползунка победы с мин, макс, и дефолтным (мин) значениями
//        sliderWinLength.addChangeListener(new ChangeListener() { //листнер для ползунка победы с переопределённым методом
//            @Override
//            public void stateChanged(ChangeEvent e) { //здесь я решил немного изменить алгоритм для рассчёта длины победной комбинации
//                if (sliderWinLength.getValue() == 3){  //если комбинация равна 3 то выводится деволтное значение
//                    lbWinLength.setText("Выигрышная комбинация: " + sliderWinLength.getValue());
//                } else { //для остальных значений победная комбинация будет на 1 меньше от размера поля
//                    lbWinLength.setText("Выигрышная комбинация: " + (sliderWinLength.getValue() - 1));
//                }
//            }
//        });
//        add(new JLabel("Выбрать размер поля:")); //добавление надписи для поля
//        add(lbFieldSize); //добавление вывода размера поля в цыфрах
//        add(sliderFieldSize); //вывод бегунка изменения размера поля
//        add(new JLabel("Выбрать выигрышную комбинация:")); //добавление надписи для выигрышной комбинации
//        add(lbWinLength); //добавление вывода размера комбинации
//        add(sliderWinLength); //добавление слайдера комбинации
//    }
//
//    private void buttonStartClick() { //метод передачи игрового режима, размеров поля и победной комбинации
//        int gameMode; //создание переменной для определения типа режима
//        if (humanVsHuman.isSelected()) { //создание условия для определения что передавать, в зависимости от выбранного режима
//            gameMode = GameMap.GM_HVH;
//        } else if (humanVsAi.isSelected()) {
//            gameMode = GameMap.GM_HVA;
//        } else { //условие если появится режим который мы не обработали
//            throw new RuntimeException("Выбранный режим игры не существует!");
//        }
//        int fieldSize = sliderFieldSize.getValue(); //переменная которая берёт в себя значения размера игрового поля
//        int winLen = sliderWinLength.getValue(); //переменная которая берёт в себя значения победной комбинации
//        mainWindow.startGame(gameMode, fieldSize, fieldSize, winLen); //передача значений в основное окно игры
//        setVisible(false); //скрытие окна
//    }
//}
