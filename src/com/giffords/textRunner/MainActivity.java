package com.giffords.textRunner;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private String[] acts = {"Knee to Knee", "Hip to Hip", "Elbow to Ear","Ear to Shoulder",
			"Nose to Face","Head to Head","Leg to Leg","Hand to Back","Hand to Hip","Hand to Knee",
			"Hand to Ankle","Nose to Thumb","Knee to Shin","Head to Elbow","Elbow to Elbow"};
	
	TextView label_1;
	TextView list_1;
	TextView text1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		label_1=(TextView)findViewById(R.id.textView1);
		list_1=(TextView)findViewById(R.id.editText2);
		list_1.setEnabled(false);
		list_1.setText("Knee to Knee" + "\n" + "Hip to Hip" + "\n" + "Elbow to Ear" + "\n" + "Ear to Shoulder" 
		+ "\n" + "Nose to Face" + "\n" + "Head to Head" + "\n" + "Leg to Leg" 
		+ "\n" + "Hand to Back" + "\n" + "Hand to Hip" + "\n" + "Hand to Kneee"
		+ "\n" + "Hand to Ankle" + "\n" + "Nose to Thumb" + "\n" + "Knee to Shin"
		+ "\n" + "Head to Elbow" + "\n" + "Elbow to Elbow");
		text1=(TextView)findViewById(R.id.textView1);
		text1.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void sendText(View view) {

		label_1.setText(anyAct());
	}
	
	//Random item from act array
	public String anyAct() {
		String item;
		Random rand = new Random();
		item = acts[rand.nextInt(acts.length)];
		return item;
	}
}