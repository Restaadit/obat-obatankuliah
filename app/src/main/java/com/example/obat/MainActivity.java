package com.example.obat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pindah1(View view) {
        Intent intent = new Intent(MainActivity.this, TambahData.class);
        startActivity(intent);
    }
    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, LihatData.class);
        startActivity(intent);
    }
}