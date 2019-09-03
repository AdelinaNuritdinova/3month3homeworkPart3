package com.example.homework3part3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final int KEY = 2;
    Button addButton;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.add_button);


        RecyclerView recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }

    public void result(View view) {
        Intent intent = new Intent(MainActivity.this, OperandsActivity.class);
        startActivityForResult(intent, KEY);

    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == KEY) {
            if (resultCode == RESULT_OK) {
                String text = data.getStringExtra(OperandsActivity.RESULT_KEY);
                adapter.addText(text);


            }
        }
    }
}