package com.raywenderlich.gamelist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainListRecyclerViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView) {

    val gameImg = itemView.findViewById(R.id.cardImage) as ImageView
    //val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
    val gameTitle = itemView.findViewById(R.id.gameTitle) as TextView
    val gameDescription = itemView.findViewById(R.id.gameDescription) as TextView
    val gameAvatar = itemView.findViewById(R.id.gameAvatar) as ImageView
    val gameIcon1 = itemView.findViewById(R.id.icon1) as TextView
}