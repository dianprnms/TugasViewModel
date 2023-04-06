package com.example.tugasviewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(var listFilm: ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var name = itemView.findViewById<TextView>(R.id.nama)
        var tanggal = itemView.findViewById<TextView>(R.id.tgl)
        var img = itemView.findViewById<ImageView>(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.img.setImageResource(data.img)
        holder.name.text = data.nama
        holder.tanggal.text = data.tanggal
    }

    fun setFilmData(listStudent: ArrayList<DataFilm>){
        this.listFilm = listStudent
    }
}