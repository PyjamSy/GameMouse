package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

public class Animal {
    Vector pos;
    float size;
    Bitmap pic;

    Animal(Context context, int picResId) {
        pos = new Vector(0, 0);
        size = 1;
        pic = BitmapFactory.decodeResource
                (context.getResources(), picResId);
    }

    Animal(float x, float y, float size, Context context, int picResId) {
        pos = new Vector(x, y);
        this.size = size;
        pic = BitmapFactory.decodeResource
                (context.getResources(), picResId);
    }
    Paint paint = new Paint();
    void appear(Canvas canvas) {
        float k = (float)pic.getHeight()/pic.getWidth();
        RectF rect = new RectF(pos.x, pos.y,
                pos.x + size, pos.y + size * k );

        canvas.drawBitmap(pic, null, rect, paint);
    }
}
