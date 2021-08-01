package com.example.newtekanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Re extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    private RecyclerView recyclerView;
    private getdataAdapter adapter;
    private SwipeRefreshLayout mSRL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re);
        recyclerView = findViewById(R.id.Re);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mSRL = (SwipeRefreshLayout) findViewById(R.id.SwipeRefresh);
        mSRL.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) this);
        FirebaseRecyclerOptions<getdata> options =
                new FirebaseRecyclerOptions.Builder<getdata>()
                        .setQuery(FirebaseDatabase.getInstance().getReference("Kalibagor II").child("datalog"), getdata.class)
                        .build();

        adapter = new getdataAdapter(options);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    public void onRefresh(){
        Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mSRL.setRefreshing(false);
                recyclerView.setAdapter(adapter);
            }
        }, 2000);
    }
}

