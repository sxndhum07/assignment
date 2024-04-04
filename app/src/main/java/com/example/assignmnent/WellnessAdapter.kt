package com.example.assignmnent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmnent.model.Tip

class WellnessAdapter (private val tipsList: List<Tip>) : RecyclerView.Adapter<WellnessAdapter.TipsViewHolder>() {
    class TipsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tipImage: ImageView = itemView.findViewById(R.id.tip_image)
        val tipTitle: TextView = itemView.findViewById(R.id.tip_title)
        val tipDescription: TextView = itemView.findViewById(R.id.tip_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.tip_item, parent, false)
        return TipsViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: TipsViewHolder, position: Int) {
        val currentTip = tipsList[position]
        holder.tipTitle.text = currentTip.title
        holder.tipDescription.text = currentTip.description
        holder.tipImage.setImageResource(currentTip.imageResId)
    }

    override fun getItemCount() = tipsList.size
}
