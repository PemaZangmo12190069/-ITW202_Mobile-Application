package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.todo_4";
    private EditText reply_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent obj = getIntent();
        String message = obj.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView text = findViewById(R.id.display_message);
        text.setText(message);
        reply_Message = findViewById(R.id.display_replymessage);
    }

    public void REPLY(View view) {
        Intent returnobj = new Intent();
        String ReturnMess = reply_Message.getText().toString();
        returnobj.putExtra(EXTRA_REPLY, ReturnMess);
        setResult(RESULT_OK, returnobj);
        finish();
    }
}