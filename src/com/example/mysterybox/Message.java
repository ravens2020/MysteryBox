package com.example.mysterybox;

import com.mbibinski.mysterybox.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Message extends Activity implements OnClickListener {

	Button TakeMeBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message);
		TakeMeBack = (Button) findViewById(R.id.bToMainPage);
		TakeMeBack.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub	
		if (v.getId() == R.id.bToMainPage){
			try{
				Class ourClass = Class.forName("com.example.mysterybox.MainPage");
				Intent ourIntent = new Intent(Message.this, ourClass);
				startActivity(ourIntent);
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}
		}
	}
	
}
