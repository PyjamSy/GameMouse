package ru.samsung.itschool.game18;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;


public class MainActivity extends Activity {
	static float x;
	static float y;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyDraw myDraw = (MyDraw)findViewById(R.id.view);
		Button up=(Button) findViewById(R.id.button);
		Button left=(Button) findViewById(R.id.button2);
		Button right=(Button) findViewById(R.id.button3);
		Button down=(Button) findViewById(R.id.button4);

		right.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				x = 50;
			}
		});
		left.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				x = -50;
			}
		});
		up.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				y = -50;
			}
		});
		down.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				y = 50;
			}
		});
		SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
		seekBar.setOnSeekBarChangeListener(myDraw);
	}
}
