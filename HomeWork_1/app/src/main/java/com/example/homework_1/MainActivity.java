package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView n=findViewById(R.id.name);
        TextView numb1=findViewById(R.id.numb);
        TextView e=findViewById(R.id.email);
        TextView ad=findViewById(R.id.addresses);
        Button b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                String nam=n.getText().toString();
                String num=numb1.getText().toString();
                String email=e.getText().toString();
                String addres=ad.getText().toString();





                i.putExtra("usnam",nam);
                i.putExtra("usnum",num);
                i.putExtra("useemail",email);
                i.putExtra("useadd",addres);


                startActivity(i);

            }
        });





    }
}