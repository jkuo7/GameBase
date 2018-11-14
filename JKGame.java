import java.awt.*;
import javax.swing.*;

public abstract class JKGame extends JPanel{

    /** Binds keys to game actions */
    abstract void bindKeyStrokes();

    /** Binds KeyStroke to action */
    public void bindKeyStrokeTo(String name, KeyStroke keyStroke, Action action) {
        InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getActionMap();
        im.put(keyStroke, name);
        am.put(name, action);
    }

    /** Displays game over message */
    void gameOver(String message, String result){
        JOptionPane.showMessageDialog(this, message, result, JOptionPane.INFORMATION_MESSAGE);
        System.exit(ABORT);
    }

}