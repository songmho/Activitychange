package com.example.activitychange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Button one_button=(Button)findViewById(R.id.one_button);

        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twoActivity=new Intent(OneActivity.this,TwoActivity.class);
                startActivity(twoActivity);
                finish();
            }
        });
    }

}
