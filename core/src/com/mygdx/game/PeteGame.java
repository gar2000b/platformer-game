package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

public class PeteGame extends Game {

    private final AssetManager assetManager = new AssetManager();

    @Override
    public void create() {
        setScreen(new GameScreen(this));
    }

    public AssetManager getAssetManager() {
        return assetManager;
    }
}
