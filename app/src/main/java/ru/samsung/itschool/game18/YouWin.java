package ru.samsung.itschool.game18;

import android.content.Context;

/**
 * Created by danic on 12.12.2016.
 */

public class YouWin extends Hole {

        YouWin (Context context){
            super(context, R.drawable.win);
        }

        YouWin(float x, float y, float size, Context context) {
            super(x, y, size, context,R.drawable.win);
        }
}
