package com.example.newtekanan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DataTekanan extends AppCompatActivity {

    //deklarasi variable
    private TextView Nama;
    private TextView Status;
    private TextView Tekanan;
    private TextView Pompa;
    private Button DATALOG;
    private TextView dataNama;
    private TextView dataStatus;
    private TextView dataTekanan;
    private TextView dataPompa;
    //private DatabaseReference DatabaseReferance;

    //FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_tekanan);
        getSupportActionBar().setTitle("Data");
        Nama = findViewById(R.id.Nama);
        Status = findViewById(R.id.Status);
        Tekanan = findViewById(R.id.Tekanan);
        Pompa = findViewById(R.id.Pompa);
        dataNama = findViewById(R.id.dataNama);
        dataStatus = findViewById(R.id.dataStatus);
        dataTekanan = findViewById(R.id.dataTekanan);
        dataPompa = findViewById(R.id.dataPompa);
        DATALOG = findViewById(R.id.button);


        DatabaseReference data = FirebaseDatabase.getInstance().getReference("data");
        data.keepSynced(true);
        DatabaseReference myref2 = data.child("Kalibagor II");
        DatabaseReference myref3 = data.child("Banyuputih");
        DatabaseReference myref4 = data.child("Asembagus");

        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //mendapatkan nama mahasiswa dari activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //menentukan identitas yang di tampilkan berdasarkan nama yang dipilih
        switch (nama) {
            case "Kalibagor II":

                DATALOG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DataTekanan.this,RecycleView.class));
                        // ngirim data brp string "Kalijhh"
                    }
                });

                DatabaseReference myref2 = FirebaseDatabase.getInstance().getReference("Kalibagor II");
                myref2.keepSynced(true);
                DatabaseReference my1ref2 = myref2.child("Nama");
                DatabaseReference my2ref2 = myref2.child("Status");
                DatabaseReference my3ref2 = myref2.child("Tekanan");
                DatabaseReference my4ref2 = myref2.child("Pompa");


                my1ref2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value1 = dataSnapshot.getValue(String.class);
                        dataNama.setText(value1);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my2ref2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value2 = dataSnapshot.getValue(String.class);
                        dataStatus.setText(value2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my3ref2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value3 = dataSnapshot.getValue(String.class);
                        dataTekanan.setText(value3);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my4ref2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value3 = dataSnapshot.getValue(String.class);
                        dataPompa.setText(value3);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                break;


            case "Banyuputih":
                DatabaseReference myref3 = FirebaseDatabase.getInstance().getReference("Banyuputih");
                myref3.keepSynced(true);
                DatabaseReference my1ref3 = myref3.child("Nama");
                DatabaseReference my2ref3 = myref3.child("Status");
                DatabaseReference my3ref3 = myref3.child("Tekanan");

                my1ref3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value1 = dataSnapshot.getValue(String.class);
                        dataNama.setText(value1);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my2ref3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value2 = dataSnapshot.getValue(String.class);
                        dataStatus.setText(value2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my3ref3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value3 = dataSnapshot.getValue(String.class);
                        dataTekanan.setText(value3);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                break;
            case "Asembagus":
                DatabaseReference myref4 = FirebaseDatabase.getInstance().getReference("Asembagus");
                myref4.keepSynced(true);
                DatabaseReference my1ref4 = myref4.child("Nama");
                DatabaseReference my2ref4 = myref4.child("Status");
                DatabaseReference my3ref4 = myref4.child("Tekanan");

                my1ref4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value1 = dataSnapshot.getValue(String.class);
                        dataNama.setText(value1);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my2ref4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value2 = dataSnapshot.getValue(String.class);
                        dataStatus.setText(value2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                my3ref4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value3 = dataSnapshot.getValue(String.class);
                        dataTekanan.setText(value3);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                break;
            case "Mangaran":
                break;
            case "Panji Semirang II":
                break;
            default:

        }
    }



}