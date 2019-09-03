package com.example.homework3part3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> res;

    public Adapter(){
        res = new ArrayList<>();
    }

    public void addText(String text){
        res.add(text);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String  text = res.get(position);
        holder.onBind(text);

    }

    @Override
    public int getItemCount() {
        return res.size();
    }
}
}
