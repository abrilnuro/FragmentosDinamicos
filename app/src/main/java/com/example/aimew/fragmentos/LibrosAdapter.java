package com.example.aimew.fragmentos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aimew.fragmentos.models.Libro;

import java.util.List;

/**
 * Created by aimew on 26/09/2016.
 */

public class LibrosAdapter extends RecyclerView.Adapter<LibrosAdapter.LibrosAdapterViewHolder>{

    List<Libro> listaLibros;

    //constructor
    public LibrosAdapter(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }


    //clase ViewHolder
    public static class LibrosAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView textNombre;
        ImageView imageLibro;

        //constructor
        public LibrosAdapterViewHolder(View itemView) {
            super(itemView);
            textNombre = (TextView)itemView.findViewById(R.id.text_libro);
            imageLibro = (ImageView)itemView.findViewById(R.id.image_libro);
        }
    }

    @Override
    public LibrosAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_libros, parent, false);
        LibrosAdapterViewHolder lavh = new LibrosAdapterViewHolder(view);
        return lavh;
    }

    @Override
    public void onBindViewHolder(LibrosAdapterViewHolder holder, int position) {
        holder.textNombre.setText(listaLibros.get(position).getNombre());
        holder.imageLibro.setImageResource(listaLibros.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaLibros.size();
    }


}//class
