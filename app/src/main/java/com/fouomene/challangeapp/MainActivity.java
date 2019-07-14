package com.fouomene.challangeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickAboutAlc();
        onClickMyprofile();

    }

    public void onClickMyprofile()
    {
        button = (Button)findViewById(R.id.btn_profile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MyProfile.class));
            }
        });
    }


    public void onClickAboutAlc()
    {
        button = (Button)findViewById(R.id.btn_alc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, AboutALC.class));
            }
        });
    }

}
