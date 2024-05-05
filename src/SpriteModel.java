public class SpriteModel {
    private double angle;

    public SpriteModel() {
        angle = 0;
    }

    public void increaseAngle() {
        angle += Math.toRadians(5);
    }

    public int calculateX(int width) {
        return (int) (width / 2 + Math.cos(angle) * 200);
    }

    public int calculateY(int height) {
        return (int) (height / 2 + Math.sin(angle) * 200);
    }
}
