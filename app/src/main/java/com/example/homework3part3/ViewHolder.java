package com.example.homework3part3;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        TextView textView;

        textView = itemView.findViewById(R.id.vh_text_view);

        public void onBind (String text){
            textView.setText(text);
        }
    }
}
