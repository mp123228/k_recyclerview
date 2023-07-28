package com.example.k_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    private lateinit var newRecyclerView: RecyclerView;
    private lateinit var newArrayList:ArrayList<News>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId= arrayOf(R.drawable.add,R.drawable.apple,R.drawable.bfire
        ,R.drawable.pear,R.drawable.bluefire,R.drawable.orange);
        heading= arrayOf(
            "hello news 1","hello news 2","hello news 3","hello news 4"
        ,"hello news 5","hello news 6"
        )

        newRecyclerView=findViewById(R.id.recy
        );
        newArrayList= arrayListOf<News>()

        for(i in imageId.indices)
        {
            val news=News(imageId[i],heading[i])
            newArrayList.add(news)
        }

        var adapter=Myadapter(newArrayList,this)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.adapter=adapter


    }
}