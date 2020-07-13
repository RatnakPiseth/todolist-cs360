package com.example.todolist;

import android.os.Bundle;
import android.widget.GridView;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView titlepage, subtitlepage, endpage;
    GridView gridView;
    DatabaseReference reference;
    RecyclerView ourdoes;
    ArrayList<com.example.anggarisky.doesapp.MyDoes> list;
    DoesAdapter doesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlepage = findViewById(R.id.titledoes);
        subtitlepage = findViewById(R.id.subtitle);
        endpage = findViewById(R.id.endpage);

        //working with data
        ourdoes = findViewById(R.id.ourdoes);
        ourdoes.setLayoutManager(new LinearLayoutManager(this));
    }
}
