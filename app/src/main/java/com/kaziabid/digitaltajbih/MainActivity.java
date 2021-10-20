package com.kaziabid.digitaltajbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button SubhanAllah,sub,reset,Alhamdulillah, Count, AllahuAkber;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.display);
        SubhanAllah=findViewById(R.id.SubhanAllah);
        Alhamdulillah=findViewById(R.id.Alhamdulillah);
        AllahuAkber=findViewById(R.id.AllahuAkber);
        Count=findViewById(R.id.Count);
        sub=findViewById(R.id.sub);
        reset=findViewById(R.id.reset);

        SubhanAllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count= count+1;
                display.setText("SubhanAllah      " +count);

            }
        });

        Alhamdulillah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                count=count+1;
                display.setText("Alhamdulillah      "+count);

            }
        });


        AllahuAkber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count=count+1;
                display.setText("AllahuAkber      "+count);

            }
        });

        Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count=count+1;
                display.setText("                             "+count);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count= count-1;
                display.setText("                             "+count);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count= 0;
                display.setText(""+count);

            }
        });

    }
}