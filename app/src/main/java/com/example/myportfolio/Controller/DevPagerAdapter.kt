package com.example.myportfolio.Controller

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.myportfolio.View.About
import com.example.myportfolio.View.Contact
import com.example.myportfolio.View.Skills
import com.example.myportfolio.View.Work
import java.text.FieldPosition

class DevPagerAdapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    override fun getItem(position: Int): Fragment? {
        when(position){
            0->return About()
            1->return Work()
            2->return Contact()
            3->return Skills()
        }
        return null
    }
    override fun getCount():Int{
        return 4
    }
    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "ABOUT"
            1->return "WORK"
            2->return "CONTACT"
            3->return "AWARDS"
        }
        return null
    }
}