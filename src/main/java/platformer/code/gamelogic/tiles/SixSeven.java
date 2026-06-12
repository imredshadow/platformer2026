package platformer.code.gamelogic.tiles;

import java.awt.image.BufferedImage;

import platformer.code.gameengine.hitbox.RectHitbox;
import platformer.code.gamelogic.level.Level;

public class SixSeven extends Tile {
    public SixSeven(float x, float y, int size, BufferedImage image, Level level) {
		super(x, y, size, image, false, level);
		hitbox = new RectHitbox(x*size, y*size, 30, 0, size-30, size);
	}

	@Override
	public void update(float tslf) {
		if(hitbox.isIntersecting(Level.player.getHitbox())){
			//when i hit it
		}
	}
    
}
