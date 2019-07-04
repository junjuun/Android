package com.example.inputtext;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener {
	//property declarations
	EditText txtName;
	Button btnOkay;
	TextView lblName;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //instantiate the properties
        this.txtName=(EditText) this.findViewById(R.id.carla);
        this.btnOkay=(Button) this.findViewById(R.id.button1);
        this.lblName=(TextView) this.findViewById(R.id.textView1);
        
        //delegate an event listener to the button
        //you cannot do this , if the button is not instantiated
        this.btnOkay.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View arg0) {
		
		//get the type text from the edit text
		String name=this.txtName.getText().toString();
		
		//if not text is typed send a warning
		if(name.equals("")){
			Toast.makeText(this, "Input Name", Toast.LENGTH_SHORT).show();
		}
		else{
			//assign the retrieved text to the label
			this.lblName.setText(name);
		
			//clear the text field after click
			this.txtName.setText("");
		}
	}
    
}
