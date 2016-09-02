package com.example.bhuvan.actv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actv;
    Button submit;

    String[] values;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button)findViewById(R.id.submit);
        actv = (AutoCompleteTextView)findViewById(R.id.autotext);
        values=getResources().getStringArray(R.array.actValues);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,values);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }

    public void submit(View view){
        Toast.makeText(this, "Welcome to RGUKT-NUZVID", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,success.class);
        startActivity(intent);


    }
}
