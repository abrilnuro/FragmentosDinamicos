package com.example.aimew.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimew.fragmentos.models.Libro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aimew on 26/09/2016.
 */

public class RecyclerFragmentLibro extends android.support.v4.app.Fragment {

    private List<Libro> listaLibros;
    private RecyclerView recyclerView;
    private LinearLayoutManager llm;
    private LibrosAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //crear la lista
        listaLibros = new ArrayList<Libro>();
        //llenar la lista
        llenaLista();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflar el fragmento
        View view = inflater.inflate(R.layout.recycler_fragment_libros, container, false);

        //referencia la recyclerView de la vista que se acaba de inflar
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_libros);

        //crear al LayoutManager
        llm = new LinearLayoutManager(getContext());

        //asignar el LayoutManager al recyclerView
        recyclerView.setLayoutManager(llm);

        //Crear la instancia del adaptador y agregarle la lista
        adapter = new LibrosAdapter(listaLibros);

        //asignar el adaptador a la recyclerView
        recyclerView.setAdapter(adapter);

        return view;
    }

    //metodo para llenar la lista
    public void llenaLista(){
        listaLibros.add(new Libro("ZigZag", android.R.drawable.ic_media_play));
        listaLibros.add(new Libro("ZigZag", android.R.drawable.ic_media_play));
        listaLibros.add(new Libro("ZigZag", android.R.drawable.ic_media_play));
        listaLibros.add(new Libro("ZigZag", android.R.drawable.ic_media_play));
        listaLibros.add(new Libro("ZigZag", android.R.drawable.ic_media_play));
    }


}//class
