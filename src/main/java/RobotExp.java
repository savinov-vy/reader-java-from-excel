
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class RobotExp {
    ArrayList<Character> listChar;

    public RobotExp(ArrayList<Character> listChar) {
        this.listChar = listChar;
    }

    public void startRobot() {
        robotWriting();

    }

    public void robotWriting() {

        try {
            java.awt.Robot robot = new java.awt.Robot();

            // Creates the delay of 5 sec so that you can open notepad before

            // Robot start writting

            robot.delay(5000);
            for (Character symbolChar : listChar)
                switch (symbolChar) {
                    case '1':
                        robot.keyPress(KeyEvent.VK_1);
                        break;
                    case '2':
                        robot.keyPress(KeyEvent.VK_2);
                        break;
                    case '3':
                        robot.keyPress(KeyEvent.VK_3);
                        break;
                    case '4':
                        robot.keyPress(KeyEvent.VK_4);
                        break;
                    case '5':
                        robot.keyPress(KeyEvent.VK_5);
                        break;
                    case '6':
                        robot.keyPress(KeyEvent.VK_6);
                        break;
                    case '7':
                        robot.keyPress(KeyEvent.VK_7);
                        break;
                    case '8':
                        robot.keyPress(KeyEvent.VK_8);
                        break;
                    case '9':
                        robot.keyPress(KeyEvent.VK_9);
                        break;
                    case '0':
                        robot.keyPress(KeyEvent.VK_0);
                        break;
                    case ',':
                        robot.keyPress(KeyEvent.VK_COMMA);
                        break;
                    // по дефолту нужно сделать выбрашенную ошибку о том что работ не понимает что делать.
                    case ' ':
                        robotManipulation();
                }


        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }


    private void robotManipulation() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.keyPress(KeyEvent.VK_DOWN); ;
        robot.keyPress(KeyEvent.VK_UP); ;
        robot.keyPress(KeyEvent.VK_DOWN); ;
        robot.keyPress(KeyEvent.VK_RIGHT); ;
        robot.keyPress(KeyEvent.VK_RIGHT); ;
        robot.keyPress(KeyEvent.VK_LEFT); ;
        robot.keyPress(KeyEvent.VK_DOWN); ;
        robot.keyPress(KeyEvent.VK_SPACE); ;
        robot.keyPress(KeyEvent.VK_ENTER); ;
        robot.keyPress(KeyEvent.VK_ENTER); ;
        robot.keyPress(KeyEvent.VK_ENTER); ;
    }

}