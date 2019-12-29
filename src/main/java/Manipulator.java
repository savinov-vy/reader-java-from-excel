
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Manipulator {

    public static Boolean stopAllowed;

    public void robotWriting(ArrayList<Character> ch) {

        try {
            java.awt.Robot robot = new java.awt.Robot();

            // Robot start writting

            for (Character symbolChar : ch) {
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
                    case '.':
                        robot.keyPress(KeyEvent.VK_PERIOD);
                        break;
                    case ',':
                        robot.keyPress(KeyEvent.VK_PERIOD);
                        break;
                }


            }
            if (!stopAllowed) {
                robot.keyPress(KeyEvent.VK_ENTER);
                stopAllowed = true;
            }
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }


    public void robotEnter() {

        try {
            java.awt.Robot robotEnt = new java.awt.Robot();
            // Robot start writting
            if (!stopAllowed) {
                robotEnt.keyPress(KeyEvent.VK_ENTER);
                Manipulator.stopAllowed = true;
            }
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
}

