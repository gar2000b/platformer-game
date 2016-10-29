package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Digilogue on 29/10/2016.
 */
public class Acorn {
    private static final int WIDTH = 16;
    private static final int HEIGHT = 16;
    private final Rectangle collision;
    private final Texture texture;
    private final float x;
    private final float y;

    public Acorn(Texture texture, float x, float y) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.collision = new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public void draw(Batch batch) {
        batch.draw(texture,x , y);
    }

    public Rectangle getCollision() {
        return collision;
    }
}
