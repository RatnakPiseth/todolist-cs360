package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter> {

    Context context;
    ArrayList<com.example.anggarisky.doesapp.MyDoes> myDoes;

    public DoesAdapter (Context c, ArrayList<com.example.anggarisky.doesapp.MyDoes> p){
        context = c;
        myDoes = p;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyviewHolder(LayoutInflater.from(context).inflate(R.layout.activity_main,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder{

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descodes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }
}
