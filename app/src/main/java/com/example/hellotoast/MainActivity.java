package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button mtoast,mcountnumber;
    public  int mcount=0;
    private TextView showcount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtoast=(Button)findViewById(R.id.toast);
        mcountnumber=(Button)findViewById(R.id.count);
        showcount=(TextView)findViewById(R.id.textcount);

        mtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"hello hi android studio",Toast.LENGTH_SHORT).show();
            }
        });
        mcountnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcount++;
                if(showcount!=null){
                    showcount.setText(Integer.toString(mcount));
                }
            }
        });
    }
}