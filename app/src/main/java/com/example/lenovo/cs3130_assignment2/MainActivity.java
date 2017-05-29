package com.example.lenovo.cs3130_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText pwText;
    Button submit;
    TextView hint;
    Password password;
    String passwordText="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pwText=(EditText)findViewById(R.id.pwText);
        submit=(Button)findViewById(R.id.submit);
        hint=(TextView)findViewById(R.id.hint);



        submit.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        passwordText=pwText.getText().toString();
        password=new Password();
        Toast.makeText(getApplicationContext(),passwordText,Toast.LENGTH_SHORT).show();
        hint.setText("");
        int rule=password.checkPassword(passwordText);
        String hintContent=password.rules(rule);
        hint.setText(hintContent);
    }
}
