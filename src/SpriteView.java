import javax.swing.*;
import java.awt.*;

public class SpriteView extends JPanel {

    private ImageIcon spriteImage;
    private int x, y;

    public SpriteView() {
        spriteImage = new ImageIcon(getClass().getResource("/sprite.png"));
        setSize(spriteImage.getIconWidth(), spriteImage.getIconHeight());
        x = getWidth() / 2;
        y = getHeight() / 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(spriteImage.getImage(), x, y, this);
    }

    public void setSpritePosition(int x, int y) {
        this.x = x - spriteImage.getIconWidth() / 2;
        this.y = y - spriteImage.getIconHeight() / 2;
        repaint();
    }
}
