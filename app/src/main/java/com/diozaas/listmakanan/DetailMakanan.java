package com.diozaas.listmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailMakanan extends AppCompatActivity {

    TextView txt_nama, desc;
    ImageView gambar;

    String nama, detail;
    int photo;

    Spinner spinner;

    private String[] namaHewan = {"Jerapah", "Gajah", "Sapi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        nama = getIntent().getStringExtra("nama");
        photo = getIntent().getIntExtra("gambar",0);
        detail = getIntent().getStringExtra("detail");

        // menampilkan Tanda Panah Back Arrow, untuk back ke halaman sebelumnya, dengan di definisikan di manifest
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        txt_nama = findViewById(R.id.txt_namamakanan);
        desc = findViewById(R.id.desc_detail);
        gambar = findViewById(R.id.image_detail);
        spinner = findViewById(R.id.spinner);

        txt_nama.setText(nama);
        desc.setText(detail);
        Glide.with(getApplicationContext()).load(photo).into(gambar);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item,namaHewan);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            // aksi jika spinner dipilih
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(DetailMakanan.this, "Kamu pelihara "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            // aksi jika spinner sedang tidak dipilih
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
