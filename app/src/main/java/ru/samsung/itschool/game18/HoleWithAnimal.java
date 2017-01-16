package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;


/**
 * Created by danic on 03.12.2016.
 */

public class HoleWithAnimal extends Hole {

    HoleWithAnimal (Context context){
        super(context, R.drawable.hole);
    }
    HoleWithAnimal(float x, float y, float size, Context context) {
        super(x, y, size, context, R.drawable.hole);
    }
    Bitmap animalImage;



    void animalInside(Bitmap animalImage){
pic=animalImage;
}

    }

