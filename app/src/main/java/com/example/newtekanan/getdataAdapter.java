package com.example.newtekanan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class getdataAdapter extends FirebaseRecyclerAdapter<getdata, getdataAdapter.getdataViewHolder> {

    public getdataAdapter(@NonNull FirebaseRecyclerOptions<getdata> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull getdataViewHolder holder, int i, @NonNull getdata model) {
        holder.Waktu.setText(model.getWaktu());
        holder.Tekanan.setText(model.getTekanan());
        holder.Status.setText(model.getStatus());
        holder.Pompa.setText(model.getPompa());
        holder.Angka.setText(model.getAngka());

    }

    @NonNull
    @Override
    public getdataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // layout called R.layout.message for each item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data, parent, false);

        return new getdataViewHolder(view);
    }

    static class getdataViewHolder extends RecyclerView.ViewHolder{

        TextView Waktu, Tekanan, Status, Pompa, Angka;

        public getdataViewHolder(@NonNull View itemView) {
            super(itemView);
            Waktu = itemView.findViewById(R.id.waktu);
            Tekanan = itemView.findViewById(R.id.Tekanan1);
            Status = itemView.findViewById(R.id.status);
            Pompa =itemView.findViewById(R.id.pompa);
            Angka = itemView.findViewById(R.id.NO);
        }
    }
}
