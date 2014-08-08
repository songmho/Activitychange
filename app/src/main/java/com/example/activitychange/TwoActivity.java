package com.example.activitychange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by songmho on 2014-08-08.
 */
public class TwoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button two_button=(Button)findViewById(R.id.two_button);

        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oneActivity=new Intent(TwoActivity.this,OneActivity.class);
                startActivity(oneActivity);
                finish();
            }
        });
    }
}
