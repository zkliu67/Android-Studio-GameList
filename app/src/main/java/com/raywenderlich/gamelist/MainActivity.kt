package com.raywenderlich.gamelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    /*
    // Initiate the fragment
    private var mainListFragment: MainListFragment = MainListFragment.newInstance()
    private var fragmentContainer: FrameLayout? = null

     */
    // Initiate recyclerView for gameList
    lateinit var listRecyclerView: RecyclerView
    lateinit var listDataManager: ListDataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. Attach the Layout
        setContentView(R.layout.activity_main)
        /*
        // 2. Attach the Fragment
        mainListFragment = supportFragmentManager.findFragmentById(R.id.main_list_fragment)
            as MainListFragment
        fragmentContainer = findViewById(R.id.fragment_container)

         */
        // Display the RecyclerView and Adapter
        listRecyclerView = findViewById(R.id.gameList_recyclerView)
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.adapter = MainListRecyclerViewAdapter()

    }
}