package com.example.dddd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x1,x2,answer,trueAns;
    Random random=new Random();
    String sx1;
    String sx2;

    public void func1(View view) {
        x1=random.nextInt(10);
        x2=random.nextInt(10);
        trueAns=x1*x2;
        sx1=Integer.toString(x1);
        sx2=Integer.toString(x2);


    }

    public void func2(View view) {
        x1=random.nextInt(21);
        x2=random.nextInt(21);
        trueAns=x1*x2;
        sx1=Integer.toString(x1);
        sx2=Integer.toString(x2);


    }

    public void func3(View view) {
        x1=random.nextInt(51);
        x2=random.nextInt(51);
        trueAns=x1*x2;
        sx2=Integer.toString(x2);
        sx1=Integer.toString(x1);
    }


}