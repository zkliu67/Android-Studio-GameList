package com.raywenderlich.gamelist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainListRecyclerViewAdapter():
    RecyclerView.Adapter<MainListRecyclerViewHolder>() {

    private val image1 = GameList("Image1", R.drawable.image_1,
        "This is my first Game", R.drawable.image_1)
    private val image2 = GameList("Image2", R.drawable.image_2,
        "This is my second Game and I do like it blablablablablabla", R.drawable.image_2)
    private val image3 = GameList("Image3", R.drawable.image_3, bgAvatar = R.drawable.image_3)
    private val image4 = GameList("Image4", R.drawable.image_4, bgAvatar = R.drawable.image_4)

    private val gameLists = arrayOf(image1, image2, image3, image4)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_view_holder, parent, false)
        return MainListRecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gameLists.size
    }

    override fun onBindViewHolder(holder: MainListRecyclerViewHolder, position: Int) {
        //holder.listPosition.text = (position + 1).toString()
        val game = gameLists[position]
        holder.gameTitle.text = game.title
        holder.gameImg.setImageResource(game.bgImg)
        holder.gameDescription.text = game.description
        holder.gameAvatar.setImageResource((game.bgAvatar))
        holder.gameIcon1.text = game.icon1.toString()
    }
}