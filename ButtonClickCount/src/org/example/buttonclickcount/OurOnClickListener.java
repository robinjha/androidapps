package org.example.buttonclickcount;

import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener{
	
	MainActivity caller;
	private int count;
	
	public OurOnClickListener(MainActivity activity){
		this.caller = activity;
		this.count = 0;
	}

	@Override
	public void onClick(View view) {
		count++;
		String outputString = "The button was clicked " +count+ " time";
		if(count != 1){
			outputString += "s";
		}
		caller.theTextView.setText(outputString);
		
	}
	
	

}
