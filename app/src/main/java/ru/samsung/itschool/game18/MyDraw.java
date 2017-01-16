package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.app.Activity;
import android.widget.SeekBar;

import static android.R.attr.button;
import static ru.samsung.itschool.game18.MainActivity.x;
import static ru.samsung.itschool.game18.MainActivity.y;


public class MyDraw extends View implements SeekBar.OnSeekBarChangeListener {

	Vector v;

	void init(Context context)
	{
goodInsiders=new HoleWithGoodAnimal[7];
		badInsiders=new HoleWithBadAnimal[7];
	    holes= new Hole[7];
		a= new int[7];
		win=new YouWin[1];
		for (int i = 1; i< holes.length;i ++){
			int c=(int)(Math.random()*5);
			if (c==1||c==2||c==3){
				holes[i] = new Hole((float) (Math.random() * 1080), (float) (Math.random() * 1920), 100f,context,R.drawable.hole);
				goodInsiders[i] = new HoleWithGoodAnimal(holes[i].pos.x,holes[i].pos.y,100f,context);
                a[i]=1;
			}
			else{
				holes[i] = new Hole((float) (Math.random() * 1080), (float) (Math.random() * 1920), 100f,context,R.drawable.hole);
				badInsiders[i] = new HoleWithBadAnimal(holes[i].pos.x,holes[i].pos.y,100f,context);
				a[i]=0;

			}

		}
		mouse= new Mouse(500,500,100,context);
holes[0]= new Hole((float) (Math.random() * 1080), (float) (Math.random() * 1920), 100f,context,R.drawable.hole);
		win[0] = new YouWin(holes[0].pos.x,holes[0].pos.y,400f,context);
		a[0]=2;
		}


	public MyDraw(Context context) {
		super(context);
		init(context);
	}
	YouWin[] win;
Mouse mouse;
Hole[] holes;
int[] a;
	int g=1;
	Boolean[] b= new Boolean[7];
	HoleWithGoodAnimal[] goodInsiders;
	HoleWithBadAnimal[] badInsiders;

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	@Override
	protected void onDraw(Canvas canvas) {

		((OnTouch)mouse).onTouch(mouse.pos.x+x, mouse.pos.y+y);
		mouse.move();
		if (g==1){
			for (int i = 0; i < b.length; i++) {
				b[i]=false;
			}
			g=0;
		}
		for (int i = 0; i < holes.length; i++) {
			holes[i].appear(canvas);
			if(a[i]==2 && b[i]==true){
				win[i].appear(canvas);
				break;
			}
			if (b[i] ){
				if (a[i]==1){
					goodInsiders[i].appear(canvas);
					goodInsiders[i].move(goodInsiders[i].pos.x,goodInsiders[i].pos.y);
				}
				else if(a[i]==0){
					badInsiders[i].appear(canvas);
					badInsiders[i].move(mouse.pos.x,mouse.pos.y);
				}


			}
			else if (((mouse.pos.x-(holes[i].pos.x)<=100) && (mouse.pos.x-holes[i].pos.x>=0)&& (mouse.pos.y-(holes[i].pos.y)<=100) && (mouse.pos.y-holes[i].pos.y>=0)  && !b[i] )
					|| ((mouse.pos.x-(holes[i].pos.x)>=-100) && (mouse.pos.x-holes[i].pos.x<=0)&&(mouse.pos.y-(holes[i].pos.y)>=-100) && (mouse.pos.y-holes[i].pos.y<=0) && !b[i])){
				if (a[i]==1){
					goodInsiders[i].appear(canvas);
					goodInsiders[i].move(goodInsiders[i].pos.x,goodInsiders[i].pos.y);
					b[i]=true;
				}
				else if (a[i]==0) {
					badInsiders[i].appear(canvas);
					badInsiders[i].move(mouse.pos.x,mouse.pos.y);
					b[i]=true;
				}
				else if (a[i]==2){
					win[i].appear(canvas);
					b[i]=true;
				}
			}


		}

		mouse.appear(canvas);
		this.invalidate();
	}
	@Override
	public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
		mouse.size = 50* (i + 100f)/100;
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {

	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {

	}
}


	/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// mouseOne.toGo.set();
		float o = event.getX();
		float h = event.getY();
		((OnTouch)mouse).onTouch(o, h);
		return true;
	}*/








