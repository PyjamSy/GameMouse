package ru.samsung.itschool.game18;

import android.content.Context;

/**
 * Created by danic on 03.12.2016.
 */

public class HoleWithBadAnimal extends Hole {
    HoleWithBadAnimal (Context context){
        super(context,R.drawable.cat);
    }
    HoleWithBadAnimal(float x, float y, float size, Context context) {
        super(x, y, size, context,R.drawable.cat);
    }
    void move(float x, float y){
        Vector toGo = new Vector(x,y);
        Vector velocity = new Vector(toGo);
        velocity.sub(pos);
        velocity.mul((float)(Math.random()/10));
        pos.sum(velocity);
    }
}
