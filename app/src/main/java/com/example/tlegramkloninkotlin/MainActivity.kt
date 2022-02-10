package com.example.tlegramkloninkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tlegramkloninkotlin.adapter.ChatAdapter
import com.example.tlegramkloninkotlin.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getAllChats())
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats : ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.img1,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img2,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img3,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img1,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img2,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img3,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img1,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img2,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img3,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img1,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img2,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img3,"Murodjon Avazov","Yes you are good at"))
        chats.add(Chat(R.drawable.img1,"Murodjon Avazov","Yes you are good at"))

        return  chats;
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this,chats)
        recyclerView.adapter = adapter
    }
}