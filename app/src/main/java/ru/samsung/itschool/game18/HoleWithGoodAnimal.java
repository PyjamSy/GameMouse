package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.BitmapFactory;

/**
 * Created by danic on 03.12.2016.
 */

public class HoleWithGoodAnimal extends Hole {
    HoleWithGoodAnimal (Context context){
        super(context, R.drawable.belka);
    }

    HoleWithGoodAnimal(float x, float y, float size, Context context) {
        super(x, y, size, context,R.drawable.belka);
    }



    public void move(float x,float y)
    {
        Vector toGo = new Vector(x, -5000);
        Vector velocity = new Vector(toGo);
        velocity.sub(pos);
        velocity.mul((float)(Math.random()/100));
        pos.sum(velocity);
    }
}
