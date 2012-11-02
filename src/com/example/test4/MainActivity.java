package com.example.test4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	Button btn1;
	TextView text;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        
        text = (TextView)findViewById(R.id.textView1); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		text.setText("sunggyu");
	}
}
