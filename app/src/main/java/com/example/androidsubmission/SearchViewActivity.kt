package com.example.androidsubmission

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.SearchView
import com.example.androidsubmission.databinding.ActivitySearchViewBinding


class SearchViewActivity : AppCompatActivity() {
    lateinit var binding: ActivitySearchViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivitySearchViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = arrayOf(
            "Dito",
            "Wawan",
            "Ramadhan",
            "Izul",
            "Birul",
            "Messi",
            "Hari",
            "Kaira",
            "Dwayne",
            "Cece",
            "Jim",
            "Vino",
            "Donald",
            "Akmal",
            "Veve"
        )

        val userAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1,
            user
        )

        binding.userList.adapter = userAdapter;

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.searchView.clearFocus()
                if (user.contains(query)) {

                    userAdapter.filter.filter(query)

                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                userAdapter.filter.filter(newText)
                return false
            }


        })
        binding.imgBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()

        }
    }
}