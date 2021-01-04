package com.example.obat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TambahData extends Activity implements View.OnClickListener {

    private static final String TAG = "yoigan";
    private DatabaseReference database;

    private EditText nama_obat, tipe_obat, desk_obat;
    private ProgressDialog loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        database = FirebaseDatabase.getInstance().getReference();

        nama_obat = findViewById(R.id.namaObat);
        tipe_obat = findViewById(R.id.tipeObat);
        desk_obat = findViewById(R.id.desk_obat);

        findViewById(R.id.simpanData).setOnClickListener((view -> {
            String Snamaobat  = nama_obat.getText().toString();
            String Stipe_obat = tipe_obat.getText().toString();
            String Sdesk      = desk_obat.getText().toString();

            if (Snamaobat.equals("")) {
                nama_obat.setError("Silahkan Masukkan Nama Obat");
                nama_obat.requestFocus();
            } else if (Stipe_obat.equals("")) {
                tipe_obat.setError("Silahkan Masukkan Tipe Obat");
                tipe_obat.requestFocus();
            } else if (Sdesk.equals("")) {
                tipe_obat.setError("Silahkan Masukkan Deskripsi Penggunaan");
                tipe_obat.requestFocus();
            } else {
                loading   = ProgressDialog.show(TambahData.this,
                        null,
                        "Silahkan Tunggu",
                        true,
                        false
                        );
                submitData(new Obat(
                   Snamaobat.toLowerCase(),
                   Stipe_obat.toLowerCase(),
                   Sdesk.toLowerCase()));
            }
        }));
    }

    private void submitData(Obat Obat) {
        database.child("Obat")
//                .child("ObatNya")
                .push()
                .setValue(Obat)
                .addOnSuccessListener(this, new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                        loading.dismiss();

                        nama_obat.setText("");
                        tipe_obat.setText("");
                        desk_obat.setText("");

                        Toast.makeText(TambahData.this,
                                "Data Berhasil ditambahkan",
                                Toast.LENGTH_SHORT).show();

                    }
                });
    }

    @Override
    public void onClick(View view) {

    }
}