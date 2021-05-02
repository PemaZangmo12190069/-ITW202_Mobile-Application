package edu.gcit.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloWorld;

    private String[] mColor = {"purple_200","purple_500", "purple_700","teal_200","teal_700","black","white","green","pink","yellow","red","blue","purple","orange","brown"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloWorld = findViewById(R.id.textview);
    }

    public void changeColor(View view) {
        Random random = new Random();
        String color = mColor[random.nextInt(15)];

        int colorValue = getResources().getIdentifier(color, "color", getApplicationContext().getPackageName());
        //int colorResult = getResources().getColor();
        int colorResult = ContextCompat.getColor(this, colorValue);
        mHelloWorld.setTextColor(colorResult);

    }
}