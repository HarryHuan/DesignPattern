package com;

import com.Adapter.AudioPlayer;
import com.Bridge.Circle;
import com.Bridge.GreenCircle;
import com.Bridge.RedCircle;
import com.Bridge.Shape1;
import com.Prototype.Shape;
import com.Prototype.ShapeCache;

public class main {
    public static void main(String[] args) {
        // 原型模式
//        ShapeCache.loadCache();
//
//        Shape clonedShape = ShapeCache.getShape("1");
//        System.out.println("Shape : " + clonedShape.getType());
//
//        Shape clonedShape2 = ShapeCache.getShape("2");
//        System.out.println("Shape : " + clonedShape2.getType());

        // 适配器模式
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play("mp3", "beyond the horizon.mp3");
//        audioPlayer.play("mp4", "alone.mp4");
//        audioPlayer.play("vlc", "far far away.vlc");
//        audioPlayer.play("avi", "mind me.avi");

        // 桥接模式
        Shape1 redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape1 greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
