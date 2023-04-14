package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.jett,
                nameSuperhero = "jett" ,
                descSuperhero = "HP : 110"
            ),
            Superhero(
                R.drawable.yoru,
                nameSuperhero = "yoru" ,
                descSuperhero = "HP : 104"
            ),
            Superhero(
                R.drawable.heal,
                nameSuperhero = "heal" ,
                descSuperhero = "HP : 110+15"
            ),
            Superhero(
                R.drawable.sage,
                nameSuperhero = "sage" ,
                descSuperhero = "HP : 100"
            ),
            Superhero(
                R.drawable.cype,
                nameSuperhero = "cypher" ,
                descSuperhero = "HP : 120"
            ),
            Superhero(
                R.drawable.kayo,
                nameSuperhero = "kay/o" ,
                descSuperhero = "HP : 110+90"
            ),
            Superhero(
                R.drawable.kiljoy,
                nameSuperhero = "killjoy" ,
                descSuperhero = "HP : 120"
            ),
            Superhero(
                R.drawable.jok,
                nameSuperhero = "jok" ,
                descSuperhero = "HP : 160"
            ),
            Superhero(
                R.drawable.nora,
                nameSuperhero = "nora" ,
                descSuperhero = "HP : 150"
            ),
        )

            val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = SuperheroAdapter(this, superheroList){

                val inten = Intent (this, DetailSuperheroActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }
    }
}