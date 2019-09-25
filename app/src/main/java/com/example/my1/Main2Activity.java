package com.example.my1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView Title;
    private ImageView tv_kc;
    private ImageView tv_gj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Title = findViewById(R.id.Title);
        Intent intent = getIntent();
        String name = intent.getStringExtra("xxx");
        if (name != null){
            Title.setText(name+"欢迎来到的空间");
        }

        tv_kc = findViewById(R.id.t1);
        tv_gj = findViewById(R.id.t2);

        tv_kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,CourseActivity.class);
                startActivity(intent);
            }
        });
    }

}
