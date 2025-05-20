package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.theBestRecyclerViewOnThePlanet)
        recyclerView.adapter = MyAdapter(createData())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    /**
     * Uses the repository to collect the raw data and bundles up those values
     * into our President data class, something our adapter knows how to work with
     */
    private fun createData(): List<President> {
        //Get data from the repository
        val names = FakeRepository.presidentName
        val orders = FakeRepository.presidentOrder
        val portraits = FakeRepository.portrait

        val presidentData = ArrayList<President>()
        PresidentId.values().forEach { presidentID ->
            //If the Id is in all lists, add president to the ArrayList
            if (containsId(presidentID, names, orders, portraits)) {
                presidentData.add(
                    President(
                        name = names[presidentID]!!,
                        order = orders[presidentID]!!,
                        portrait = portraits[presidentID]!!
                    )
                )
            }
        }

        return presidentData
    }

    /**
     * Takes in a president id and checks if it is contained within all mappings passed
     */
    private fun containsId(presidentID: PresidentId, vararg maps: Map<PresidentId, Any>): Boolean {
        maps.forEach {
            if (presidentID !in it.keys) { return false }
        }
        return true
    }
}