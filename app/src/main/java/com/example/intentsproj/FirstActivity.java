package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnOK=findViewById(R.id.button2);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText( FirstActivity.this,"Sending message",Toast.LENGTH_LONG);
                toast.show();
                sendMessage();

            }
        });

    }
    public void sendMessage(){
        Intent intent = new Intent(this,SecondActivity.class );
        startActivity(intent);
    }
}