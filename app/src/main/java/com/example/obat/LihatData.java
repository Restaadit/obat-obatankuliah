package com.example.obat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LihatData extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
    }

    public void edit(View view) {
        Intent intent = new Intent(LihatData.this, SimpanData.class);
        startActivity(intent);
    }
}