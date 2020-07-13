package com.example.todolist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyviewHolder> {

    Context context;
    ArrayList<com.example.anggarisky.doesapp.MyDoes> myDoes;

    public DoesAdapter (Context c, ArrayList<com.example.anggarisky.doesapp.MyDoes> p){
        context = c;
        myDoes = p;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyviewHolder(LayoutInflater.from(context).inflate(R.layout.activity_main,viewGroup,false));
    }

    @Override
    public void onBindViewHolder (@NonNull MyviewHolder myViewHolder,int i) {
        myViewHolder.titledoes.setText(myDoes.get(i).getTitledoes());
        myViewHolder.descodes.setText(myDoes.get(i).getDescdoes());
        myViewHolder.datedoes.setText(myDoes.get(i).getDatedoes());

    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder{
        TextView titledoes, descodes, datedoes;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descodes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }
}
