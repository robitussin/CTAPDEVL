package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View v){
        Intent i = new Intent(this, HomeActivity.class);

        // this refers to the username textfield
        TextView t = findViewById(R.id.username);
        String name = t.getText().toString();
        i.putExtra("uname", name);

        TextView p = findViewById(R.id.password);
        String password = p.getText().toString();

        if (password.equals("abc123"))
        {
            startActivity(i);
        }
        else{
            Toast.makeText(this, "INCORRECT PASSWORD",  Toast.LENGTH_SHORT).show();
        }
    }







//
//    public void gotoprofile(View v){
//        Intent i = new Intent(this, Profile_Activity.class);
//
//        EditText usernametext = findViewById(R.id.username);
//        String name = usernametext.getText().toString();
//
//        i.putExtra("loginname", name);
//        startActivity(i);
//    }
////
//    public void changeMessage(View v){
//        TextView textview = findViewById(R.id.text1);
//        textview.setText("ELIZER PONIO JR");
//    }
}