package com.example.obat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends Activity {

    private Button buttonCreate;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCreate = (Button) findViewById(R.id.button1);
        buttonView = (Button) findViewById(R.id.button2);


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