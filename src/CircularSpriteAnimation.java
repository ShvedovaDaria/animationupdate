import javax.swing.*;
import java.awt.*;

public class CircularSpriteAnimation extends JFrame {

    public CircularSpriteAnimation() {
        setTitle("Circular Sprite Animation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpriteModel model = new SpriteModel();
        SpriteView view = new SpriteView();
        SpriteController controller = new SpriteController(model, view);
        BackgroundAnimator backgroundAnimator = new BackgroundAnimator(view);

        add(view);

        JPanel controlPanel = new JPanel();
        JButton changeThemeButton = new JButton("Change Theme");
        changeThemeButton.addActionListener(e -> backgroundAnimator.changeTheme());
        controlPanel.add(changeThemeButton);
        add(controlPanel, BorderLayout.SOUTH);

        Timer timer = new Timer(50, e -> {
            controller.moveSprite();
            backgroundAnimator.animate();
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircularSpriteAnimation animation = new CircularSpriteAnimation();
            animation.setVisible(true);
        });
    }
}
