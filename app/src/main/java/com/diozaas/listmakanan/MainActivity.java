package com.diozaas.listmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterMakanan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new AdapterMakanan(getApplicationContext(), dataMakanan());

        recyclerView = findViewById(R.id.recycler_makanan);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        // 3 merupakan jumlah item yang ingin ditampilkan per row gridnya
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Makanan> dataMakanan(){
        return DummyMakanan.listMakanan();
    }
}
