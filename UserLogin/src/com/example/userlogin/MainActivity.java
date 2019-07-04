package com.example.userlogin;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;

public class MainActivity extends Activity implements OnClickListener {

	//login information
	final static String USERNAME="admin";
	final static String PASSWORD="user123";
	
	
	EditText txtUsernmae, pwdPassword;
	Button btnLogin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiate the UI elements
        this.txtUsernmae=(EditText) this.findViewById(R.id.editText1);
        this.pwdPassword=(EditText) this.findViewById(R.id.editText2);
        this.btnLogin=(Button) this.findViewById(R.id.button1);
        
        //assign a click listener to the button
        this.btnLogin.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String username=this.txtUsernmae.getText().toString();
		String password=this.pwdPassword.getText().toString();
		if(username.equals(USERNAME) && password.equals(PASSWORD)){
			Toast.makeText(this, "LOGIN ACCEPTED !", Toast.LENGTH_SHORT).show();
		}
		else{
			
			AlertDialog.Builder builder=new AlertDialog.Builder(this);
			builder.setTitle("Error");
			builder.setMessage("INVALID USER");
			builder.setNeutralButton("Okay", null);
			//
			AlertDialog dialog=builder.create();
				dialog.show();
		}
		//clear the fields
		this.txtUsernmae.setText("");
		this.pwdPassword.setText("");
		
		this.txtUsernmae.requestFocus();
	}
}
