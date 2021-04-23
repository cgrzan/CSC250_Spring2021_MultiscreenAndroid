package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity
{
    public static int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

    }


    public void onNextScreenButtonClicked(View v)
    {
        MySingleton.initialize(num);
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
        this.startActivity(i);


    }

}
//Create a 3 screen application that asks the user for a number on screen 1,
// screen two should show the factorial of that number, screen three should show
// the square root of the number from screen 2.
//Example:
//If you entered a 4 on screen1
//Screen 2 should show a 24
//Screen 3 should show: 4.8989794856
//Note: the Math class in Java might be helpful for calculating the square root