package game;

import engine.AbstractGame;
import engine.GameContainer;
import engine.Renderer;
import engine.audio.SoundClip;
import engine.gfx.Image;
import engine.gfx.ImageTile;
import engine.gfx.Light;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GameManager extends AbstractGame {

    private ImageTile image;
    private float temp = 0;
    private SoundClip clip;
    private Image image1;
    private Image image2;
    private Image image3;
    private Light light;
    private Image imgBg;

    public GameManager() {
//        image = new ImageTile("/crosshair.png", 16, 16);
//        clip = new SoundClip("/audio/gunsound.wav");
//        clip.setVolume(-10);
        imgBg = new Image("/bg.png");
        imgBg.setAlpha(true);
        image1 = new Image("/human.png");
        image1.setLightBlock(Light.FULL);
        image1.setAlpha(true);
        image3 = new Image("/image3.png");
        image3.setLightBlock(Light.FULL);
        image3.setAlpha(true);
//        image2 = new Image("/transparent.png");
//        image2.setAlpha(true);
        light = new Light(500, 0xff00ffff);
    }

    @Override
    public void update(GameContainer gc, float dt) {
//        if (gc.getInput().isButtonDown(MouseEvent.BUTTON1)) {
//            clip.play();
//        }

        temp += dt * 20;
        if (temp > 4) {
            temp = 0;
        }
    }

    @Override
    public void render(GameContainer gc, Renderer r) {
//         r.drawImageTile(image, gc.getInput().getMouseX() - 8, gc.getInput().getMouseY() - 16, (int) temp, 0);
//        for (int x = 0; x < image1.getW(); x++) {
//            for (int y = 0; y < image1.getH(); y++) {
//                r.setLightMap(x+100, y+100, image1.getP()[x + y * image1.getW()]);
//            }
//        }
//        r.setzDepth(0);

//        for (int x = 0; x < light.getDiameter(); x++) {
//            for (int y = 0; y < light.getDiameter(); y++) {
//                r.setLightMap(x, y, light.getLm()[x + y * light.getDiameter()]);
//            }
//        }
        r.setzDepth(0);
        r.drawImage(imgBg, 0, 0);
//        r.drawImage(image1, gc.getInput().getMouseX()-32,gc.getInput().getMouseY()-32);
        r.drawImage(image3, 100, 50);
        r.drawLight(light, 200,100);
        r.drawLight(light, gc.getInput().getMouseX(),gc.getInput().getMouseY());

    }
}
