package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by danic on 03.12.2016.
 */

public class Hole {

    Vector pos;
    float size;
    Bitmap pic;


      Hole (Context context, int picResId) {
            pos = new Vector(0, 0);
            size = 1;
            pic = BitmapFactory.decodeResource
                    (context.getResources(), picResId);
        }

        Hole (float x, float y, float size, Context context, int picResId) {
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


