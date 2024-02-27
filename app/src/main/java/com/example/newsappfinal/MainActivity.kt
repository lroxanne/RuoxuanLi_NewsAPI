package com.example.newsappfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.newsappfinal.adapter.ViewPagerAdapter
import com.example.newsappfinal.databinding.ActivityMainBinding
import com.example.newsappfinal.fragments.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentArrayList = ArrayList<Fragment>()

        fragmentArrayList.add(HomeFragment())
        fragmentArrayList.add(BusinessFragment())
        fragmentArrayList.add(SportsFragment())
        fragmentArrayList.add(HealthFragment())
        fragmentArrayList.add(ScienceFragment())
        fragmentArrayList.add(TechnologyFragment())
        fragmentArrayList.add(EntertainmentFragment())


        val adapter = ViewPagerAdapter(this, supportFragmentManager, fragmentArrayList)
//        binding.fabSearch.setOnClickListener {
//            binding.fragmentcontainer.currentItem = 7
//        }

        binding.fragmentcontainer.adapter = adapter
        binding.include.setupWithViewPager(binding.fragmentcontainer)
    }
}