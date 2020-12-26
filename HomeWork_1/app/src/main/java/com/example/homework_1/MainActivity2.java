package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b1 = getIntent().getExtras();
        String n = b1.getString("usnam");
        String phone = b1.getString("usnum");
        String email = b1.getString("useemail");
        String address = b1.getString("useadd");

        TextView numb = findViewById(R.id.name);
        TextView ph = findViewById(R.id.num);
        TextView email1 = findViewById(R.id.emil);
        TextView add = findViewById(R.id.addres);

        numb.setText(n);
        ph.setText(phone);
        email1.setText(email);
        add.setText(address);

        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel"+phone));
                startActivity(callIntent);
            }

        });
        email1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, email);
                email.putExtra(Intent.EXTRA_SUBJECT, "161066@studen.kcst.edu.kw");
                email.putExtra(Intent.EXTRA_TEXT, "Kuwait");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                Uri gmmIntentUri=Uri.parse("https://goo.gl/maps/FiCV9StKztf6nZpH6");
                         Intent mapIntent= new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        }

}



