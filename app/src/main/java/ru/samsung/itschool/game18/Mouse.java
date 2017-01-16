package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Mouse extends Animal implements OnTouch{
    Vector toGo = new Vector(500, 500);
	Mouse(Context context) {
		super(context, R.drawable.mouse);
	}

	Mouse(float x, float y, float size, Context context) {
	    super(x, y, size, context, R.drawable.mouse);
	}

	public void onTouch (float x, float y)
	{
		toGo.set(x, y);
	}

    public void move()
	{
		Vector velocity = new Vector(toGo);
		velocity.sub(pos);
		velocity.mul((float)(Math.random()/5));
		pos.sum(velocity);
	}

}
