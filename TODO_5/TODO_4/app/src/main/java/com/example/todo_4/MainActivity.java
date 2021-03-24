package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.todo_4";
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int textRequest = 1;
    private EditText send_message;

    private TextView reply_header;
    private TextView reply_message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "onCreate");
        send_message = findViewById(R.id.text_send);
        reply_header = findViewById(R.id.displayreply);
        reply_message = findViewById(R.id.display_messagereply);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void SEND(View view) {
        Intent obj = new Intent(this, MainActivity2.class);
        String mssg = send_message.getText().toString();
        obj.putExtra(EXTRA_MESSAGE, mssg);
        startActivityForResult(obj, textRequest);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == textRequest) {
            if (resultCode == RESULT_OK) {
                String final_mssg = data.getStringExtra(MainActivity2.EXTRA_REPLY);
                reply_header.setVisibility(View.VISIBLE);
                reply_message.setText(final_mssg);
                reply_message.setVisibility(View.VISIBLE);
            }
        }
    }
}