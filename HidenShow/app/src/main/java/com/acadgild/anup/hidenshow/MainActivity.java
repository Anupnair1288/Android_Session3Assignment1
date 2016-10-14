package com.acadgild.anup.hidenshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button but1;
    private TextView tv1;
    private boolean show= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1=(Button)findViewById(R.id.but);
        tv1=(TextView)findViewById(R.id.tv1);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show)
                    {
                    tv1.setVisibility(View.INVISIBLE);
                    show=false;
                    but1.setText(R.string.show);
                    }
                else
                    {
                    tv1.setVisibility(View.VISIBLE);
                    show=true;
                    but1.setText(R.string.hide);
                    }
            }
        });
    }
}
