package com.example.todo_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mtextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView = findViewById(R.id.textView1);
        Button btn = findViewById(R.id.button);
    }

    public void startTask(View view) {
        mtextView.setText("Napping...............");
        new SimpleAsyncTask(mtextView).execute();
    }
}