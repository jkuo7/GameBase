import javax.swing.*;

public class GameLauncher {

    /** Launches game */
    public static void startGUI(JKGame game, String name){
        SwingUtilities.invokeLater(() -> createAndShowGUI(game, name));
    }

    private static void createAndShowGUI(JKGame game, String name){
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(game);
        frame.pack();
        frame.setVisible(true);
    }

}
