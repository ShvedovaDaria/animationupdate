public class SpriteController {

    private SpriteModel model;
    private SpriteView view;

    public SpriteController(SpriteModel model, SpriteView view) {
        this.model = model;
        this.view = view;
    }

    public void moveSprite() {
        model.increaseAngle();
        int x = model.calculateX(view.getWidth());
        int y = model.calculateY(view.getHeight());
        view.setSpritePosition(x, y);
    }
}
