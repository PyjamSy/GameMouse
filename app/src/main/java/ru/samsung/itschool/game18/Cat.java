package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Cat extends Animal implements OnTouch{

	Cat(Context context) {
		super(context, R.drawable.cat);
	}

	Cat(float x, float y, float size, Context context) {
		super(x, y, size, context, R.drawable.cat);
	}

	@Override
	public void onTouch(float x, float y) {

		 //if (pos.x <= x && pos.y <= y &&
		//	 pos.x + size >= x && pos.y + size * pic.getHeight()/pic.getWidth() >= y)
		{ size *= 1.1f;}
	}
}
