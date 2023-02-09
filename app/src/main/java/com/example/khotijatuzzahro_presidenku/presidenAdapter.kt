package com.example.khotijatuzzahro_presidenku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class presidenAdapter(private val context: Context, private val presiden:List<Presiden>, val listener:(Presiden) -> Unit)
    : RecyclerView.Adapter<presidenAdapter.presidenViewHolder>(){


    class presidenViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val gmbrPresiden= view.findViewById<ImageView>(R.id.gambar)
        val teksNama= view.findViewById<TextView>(R.id.textJudul)
        val teksPriode= view.findViewById<TextView>(R.id.textDescripsi)

        fun bindView(presiden: Presiden,listener: (Presiden) -> Unit){
            gmbrPresiden.setImageResource(presiden.gmbrPresiden)
            teksNama.text= presiden.teksNama
            teksPriode.text=presiden.teksPriode
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): presidenViewHolder {
        return presidenViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_presiden, parent, false)
        )
    }

    override fun onBindViewHolder(holder: presidenViewHolder, position: Int) {
        holder.bindView(presiden[position],listener)
    }

    override fun getItemCount(): Int = presiden.size
}