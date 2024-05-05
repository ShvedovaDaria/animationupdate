import javax.swing.*;
import java.awt.*;

public class BackgroundAnimator {
    private SpriteView view;
    private Color[] themes = {Color.WHITE, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.ORANGE, Color.BLUE,Color.LIGHT_GRAY};
    private int currentThemeIndex = 0;

    public BackgroundAnimator(SpriteView view) {
        this.view = view;
    }

    public void changeTheme() {
        currentThemeIndex = (currentThemeIndex + 1) % themes.length;
        view.setBackground(themes[currentThemeIndex]);
    }

    public void animate() {
        // Add any background animation logic here
    }
}
