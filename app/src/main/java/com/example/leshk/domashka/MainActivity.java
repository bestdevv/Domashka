package com.example.leshk.domashka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbutclick(View v){
        EditText f = (EditText)findViewById(R.id.fr);
        EditText t = (EditText)findViewById(R.id.tw);
        TextView pesl = (TextView)findViewById(R.id.res);

        int f1 = Integer.parseInt(f.getText().toString());
        int t1 = Integer.parseInt(t.getText().toString());
        int resSum = f1+ t1;
        pesl.setText(Integer.toString(resSum));
    }

}
