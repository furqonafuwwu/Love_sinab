package com.example.smpfurqon2017.sirahnabawi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void budipekerti(View view) {
        startActivity(new Intent(MainActivity.this, BudiPekerti.class));
    }

    public void menjadisuami(View view) {
        startActivity(new Intent(MainActivity.this, MenjadiSuami.class));
    }

    public void menjadiyatim(View view) {
        startActivity(new Intent(MainActivity.this, MenjadiYatim.class));
    }

    public void kelahiran(View view) {
        startActivity(new Intent(MainActivity.this, Kelahiran.class));
    }
}
