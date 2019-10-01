package com.e.mhscardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        View.OnClickListener simpanButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UpdateActivity.this,MainActivity.class);
                startActivity(intent);
            }
        };
        Button simpanBtn = (Button)findViewById(R.id.btnSimpar);
        simpanBtn.setOnClickListener(simpanButtonListener);
    }
}
