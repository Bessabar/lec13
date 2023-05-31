package com.example.mya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var homeRVAdapter : HomeRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            homeRVAdapter = HomeRVAdapter(getData())
            homeRV.adapter = homeRVAdapter
            homeRV.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun getData(): MutableList<Email> {
        var dataList = ArrayList<Email>()
        dataList.add(Email("Author 1", "Subject 1", "Content 1 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 12", "Subject 12", "Content 12 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 13", "Subject 13", "Content 13 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 14", "Subject 14", "Content 14 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 15", "Subject 15", "Content 15 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 16", "Subject 16", "Content 16 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 17", "Subject 17", "Content 17 Content 1 Content 1 Content 1 Content 1"))
        dataList.add(Email("Author 18", "Subject 18", "Content 18 Content 1 Content 1 Content 1 Content 1"))
        return dataList
    }


}