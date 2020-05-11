package com.example.activitytest;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("data_return","hellofirstavtivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
//        Intent intent=getIntent();
//        String data=intent.getStringExtra("extra_data");
//        Log.d("Secondactivity",data);
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("datareturn","hellofirstactivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
