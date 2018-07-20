package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button askQuestion = findViewById(R.id.button_ask);

        final ImageView anwser = findViewById(R.id.image_ball);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball1,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Ball8", "Ze button has been pressed!");
                Random randdomNumGen = new Random();
                int ballNumber = randdomNumGen.nextInt(5);
                Log.d("Ball8", "Ball number is: " + ballNumber);
                anwser.setImageResource(ballArray[ballNumber]);


            }
        });



    }
}
