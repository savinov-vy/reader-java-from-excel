
import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

public class Manipulator {


    public void robotWriting(String str) {

        char[] listChar = str.toCharArray();

        try {
            java.awt.Robot robot = new java.awt.Robot();

            // Robot start writting

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
                    case '.':
                        robot.keyPress(KeyEvent.VK_COMMA);
                        break;
                    case ' ':
                        robot.keyPress(KeyEvent.VK_0);
                        break;
                }


        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }


    public void robotManipulation(String str) {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        if (str.equals("cell")) robot.keyPress(KeyEvent.VK_SPACE);

        else if (str.equals("row")) robot.keyPress(KeyEvent.VK_ENTER);

       /* robot.keyPress(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_UP);

        robot.keyPress(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_RIGHT);

        robot.keyPress(KeyEvent.VK_RIGHT);

        robot.keyPress(KeyEvent.VK_LEFT);

        robot.keyPress(KeyEvent.VK_DOWN);


        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_ENTER);
        */
    }

}