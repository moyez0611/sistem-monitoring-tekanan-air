package com.example.newtekanan;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //Data-Data yang akan dimasukkan pada listview
    private String[] SumurBor = {"Kalibagor II","Banyuputih","Asembagus","Arjasa","Mangaran","Panji Semirang II"};

    //ArrayList digunakan Untuk menampung Data sumur bor
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_item);
        data = new ArrayList<>();
        getData();
        //ArrayAdapter digunakan untuk mengatur, bagaimana item pada ListView akan tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        //menambahkan Listener, untuk menanganikejadian saat salah satu item listview di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //mendapatkan nama pada salah satu item yang di klik, berdasarkan posisinya
                String getName = data.get(position);
                // Berpindah Activity dan memasang data nama pada activity Selanjutnya
                Intent sendData = new Intent(MainActivity.this, DataTekanan.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData(){
        //Memasukkan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, SumurBor);

    }
}

