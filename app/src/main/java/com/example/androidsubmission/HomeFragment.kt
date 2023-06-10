package com.example.androidsubmission

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class HomeFragment : Fragment() {

    lateinit var btnSearch : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* get id */
        btnSearch = view.findViewById(R.id.btnSearch)
        /* click the button */
        btnSearch.setOnClickListener {
            val pindahSearch = Intent(activity, SearchViewActivity::class.java)
            startActivity(pindahSearch)
        }
    }}