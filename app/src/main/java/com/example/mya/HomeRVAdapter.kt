package com.example.mya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mya.databinding.ItemViewBinding

class HomeRVAdapter(val dataList : MutableList<Email>) : RecyclerView.Adapter<HomeRVAdapter.HomeRVViewHolder>() {
    inner class HomeRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemViewBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRVViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return HomeRVViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeRVViewHolder, position: Int) {
        val item = dataList[position]
        holder.binding.apply {
            emailAuthorTV.text = item.author
            emailSubjectTV.text = item.subject
            emailContentsTV.text = item.content
            //emailIV.setImageResource(item.image!!)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}