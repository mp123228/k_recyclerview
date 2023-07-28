package com.example.k_recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class Myadapter(private val newsList:ArrayList<News>,val context :Context):
    RecyclerView.Adapter<Myadapter.MyViewholder>() {

    class MyViewholder(itemView : View):RecyclerView.ViewHolder(itemView)
    {
        val titleImg:ShapeableImageView=itemView.findViewById(R.id.img)
        val tvheader:TextView=itemView.findViewById(R.id.txname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.itemlayout,parent,false);
        return MyViewholder(view);

    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {

        val curerntItem=newsList[position]
        holder.titleImg.setImageResource(curerntItem.titleImage)
        holder.tvheader.text=curerntItem.heading
        holder.titleImg.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                context,
                " Button clicked ${curerntItem.heading}",
                Toast.LENGTH_SHORT
            ).show()

            

            var ind=Intent(context,MainActivity2::class.java);
            ind.putExtra("name",curerntItem.heading)
            context.startActivity(ind);
        })

    }

    override fun getItemCount(): Int {
        return newsList.size
    }

}