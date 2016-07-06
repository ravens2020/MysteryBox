package com.example.mysterybox;

import com.mbibinski.mysterybox.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainPage extends Activity implements OnClickListener {

	int counter;
	Button MysteryBoxButton;
	TextView CounterText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_page);
		counter = 100000;
		MysteryBoxButton = (Button) findViewById(R.id.bMysteryBox);
		CounterText = (TextView) findViewById(R.id.tvCounter);
		MysteryBoxButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.bMysteryBox){
			counter--;
			CounterText.setText(Integer.toString(counter));
			if (counter <= 0){
				try{
					Class ourClass = Class.forName("com.example.mysterybox.Message");
					Intent ourIntent = new Intent(MainPage.this, ourClass);
					startActivity(ourIntent);
					}catch(ClassNotFoundException e){
						e.printStackTrace();
					}
			}
		}
	}

}
