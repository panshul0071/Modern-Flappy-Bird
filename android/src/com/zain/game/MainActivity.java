package com.zain.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.badlogic.gdx.ApplicationListener;

public class MainActivity extends Activity implements ApplicationListener {
    private Button button;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlappyBird();
            }
        });




    }
    public void openMainActivity2()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
    public void openFlappyBird()
    {
        Intent intent = new Intent(this,FlappyBird.class);
        startActivity(intent);
    }


