package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x=0,y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void appendScoreBy2(View view)
    {
        x+=2;
        displayForA2(x);
    }

    public void appendScoreBy3(View view)
    {
        x+=3;
        displayForA3(x);
    }

    public void appendScoreBy1(View view)
    {
        x+=1;
        displayForA1(x);
    }
    public void resetScore(View view)
    {
        x=0;
        y=0;
        displayForB(y);
        displayreset(x);
        displayR("Match is Running");
    }

    private void displayR(String s)
    {
        TextView scoreView=(TextView) findViewById(R.id.winning_view);
        scoreView.setText(s);
    }

    private void displayreset(int num)
    {
        TextView scoreView=(TextView) findViewById(R.id.score_view);
        scoreView.setText(String.valueOf(num));
    }

    public void findWinner(View view)
    {
        if(x<y)
        {
            display("Team-B is Winner");
        }
        else if(y<x)
        {
            display("Team-A is Winner");
        }
        else if(y==x)
        {
            display("Match is tie");
        }

    }

    private void displayForA1(int num)
    {
        TextView scoreView=(TextView) findViewById(R.id.score_view);
        scoreView.setText(String.valueOf(num));
    }
    private void displayForA2(int num)
    {
        TextView scoreView=(TextView) findViewById(R.id.score_view);
        scoreView.setText(String.valueOf(num));
    }
    private void displayForA3(int num)
    {
        TextView scoreView=(TextView) findViewById(R.id.score_view);
        scoreView.setText(String.valueOf(num));
    }
    public void appendScoreBy2B(View view)
    {
        y+=2;
        displayForB(y);
    }

    public void appendScoreBy3B(View view)
    {
        y+=3;
        displayForB(y);
    }

    public void appendScoreBy1B(View view)
    {
        y+=1;
        displayForB(y);
    }

    private void displayForB(int num)
    {
        TextView scoreView=(TextView) findViewById(R.id.score_viewB);
        scoreView.setText(String.valueOf(num));
    }

    private void display(String s)
    {
        TextView scoreView=(TextView) findViewById(R.id.winning_view);
        scoreView.setText(s+" \n Match is End ");
    }


    
}