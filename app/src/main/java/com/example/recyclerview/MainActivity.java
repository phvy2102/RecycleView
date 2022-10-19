package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cata.Cata;
import cata.CataAdapter;
import senda.Senda;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCata;
    private cata.CataAdapter cataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCata = findViewById(R.id.rcvCate);
        cataAdapter = new CataAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCata.setLayoutManager((linearLayoutManager));
        cataAdapter.setData(getListCata());
        rcvCata.setAdapter(cataAdapter);

    }
    private List<Cata> getListCata(){
        List<Cata> listCata = new ArrayList<>();

        List<Senda> listSenda = new ArrayList<>();
        listSenda.add(new Senda(R.drawable.img1,"Thạch Ngọc" ));
        listSenda.add(new Senda(R.drawable.img2,"Tai thỏ" ));
        listSenda.add(new Senda(R.drawable.img3,"Thái xanh" ));
        listSenda.add(new Senda(R.drawable.img4,"Hàm cá mập" ));

        listSenda.add(new Senda(R.drawable.img1,"Thạch Ngọc" ));
        listSenda.add(new Senda(R.drawable.img2,"Tai thỏ" ));
        listSenda.add(new Senda(R.drawable.img3,"Thái xanh" ));
        listSenda.add(new Senda(R.drawable.img4,"Hàm cá mập" ));

        listCata.add(new Cata("Mục 1", listSenda));
        listCata.add(new Cata("Mục 2", listSenda));
        listCata.add(new Cata("Mục 3", listSenda));
        listCata.add(new Cata("Mục 4", listSenda));
        return  listCata;
    }
}