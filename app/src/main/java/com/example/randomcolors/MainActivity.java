package com.example.randomcolors;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    public void RandomColor (View v) {
        int red = (int) (256 * Math.random());
        int blue = (int) (256 * Math.random());
        int green = (int) (256 * Math.random());

        int leftRed = red / 16;
        int rightRed = red - 16 * leftRed;
        String leftStrRed;
        String rightStrRed;
        int leftGreen = green/16;
        int rightGreen =  green - 16 * leftGreen;
        String leftStrGreen;
        String rightStrGreen;
        int leftBlue = blue/16;
        int rightBlue =  blue - 16 * leftBlue;
        String leftStrBlue;
        String rightStrBlue;

        int color = Color.rgb(red, green, blue);
        Button btn = findViewById(R.id.colors);
        btn.setBackgroundColor(color);

        double redValue = (red / 255.0) * 100;
        double greenValue = (green / 255.0) * 100;
        double blueValue = (blue / 255.0) * 100;

        String red2 = String.format("%.0f", redValue);
        String green2 = String.format("%.0f", greenValue);
        String blue2 = String.format("%.0f", blueValue);

        String result = "Relative RGB values are: R = " + red2 + "%, " + "G = " + green2 + "%, " + "B = " + blue2 + "%";


        Map<Integer, String> colors = new TreeMap<>();
        colors.put(10 , "A");
        colors.put(11 , "B");
        colors.put(12 , "C");
        colors.put(13 , "D");
        colors.put(14 , "E");
        colors.put(15 , "F");

        if (leftRed >= 10 && leftRed <= 15) {
            leftStrRed = colors.get(leftRed);
        }else {
            leftStrRed = String.valueOf(leftRed);
        }
        if(rightRed >= 10 && rightRed <= 15) {
            rightStrRed = colors.get(rightRed);

        } else {
            rightStrRed = String.valueOf(rightRed);
        }

        String resultRed = leftStrRed + rightStrRed;

        if (leftGreen >= 10 && leftGreen <= 15) {
            leftStrGreen = colors.get(leftGreen);
        }
        else {
            leftStrGreen = String.valueOf(leftGreen);
        }

        if(rightGreen >= 10 && rightGreen <= 15) {
            rightStrGreen = colors.get(rightGreen);

        } else {
            rightStrGreen = String.valueOf(rightGreen);
        }

        String resultGreen = leftStrGreen + rightStrGreen;

        if (leftBlue >= 10 && leftBlue <= 15) {
            leftStrBlue = colors.get(leftBlue);
        }
        else {
            leftStrBlue = String.valueOf(leftBlue);
        }

        if(rightBlue >= 10 && rightBlue <= 15) {
            rightStrBlue = colors.get(rightBlue);
        } else {
            rightStrBlue = String.valueOf(rightBlue);
        }

        String resultBlue = leftStrBlue + rightStrBlue;
        String finalResult = "#" + resultRed + resultGreen + resultBlue;

        String rgb = String.valueOf(red) + ", " + String.valueOf(green) + ", " + String.valueOf(blue);

        TextView textView = findViewById(R.id.values);
        textView.setText(result + "\n" + "HexaCode for this color is: " + finalResult + "\n" + "RGB value for this color is: " + rgb);




    }

}
