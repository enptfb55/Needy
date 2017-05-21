package com.enptfb55.needy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ViewUtils;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by samato on 5/20/17.
 */

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private EditText _nameText;
    private EditText _emailText;
    private EditText _passwordText;
    private Button   _signupButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //this._nameText  = (EditText)findViewById(R.id.input_name);
        this._emailText     = (EditText)findViewById(R.id.input_email);
        this._passwordText  = (EditText)findViewById(R.id.input_password);
        this._signupButton  = (Button) findViewById(R.id.btn_login);

    }


}
