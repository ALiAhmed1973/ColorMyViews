package com.projects.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListiners()
    }

    private fun setListiners()
    {
        val listofViews : List<View> = listOf(box_one_textView,box_two_textView,box_three_textView,
        box_four_textView,box_five_textView,constraint_layout,red_button,purple_button,black_button)

        for (item in listofViews)
        {
            item.setOnClickListener { makeColor(it) }
        }

    }

    private fun makeColor(view: View?) {
        when(view?.id)
        {
            R.id.box_one_textView-> view.setBackgroundColor(Color.CYAN)
            R.id.box_two_textView-> view.setBackgroundColor(Color.YELLOW)
            R.id.box_three_textView-> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_textView-> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_five_textView-> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.red_button->box_three_textView.setBackgroundResource(android.R.color.holo_red_light)
            R.id.purple_button->box_four_textView.setBackgroundResource(android.R.color.holo_purple)
            R.id.black_button->box_five_textView.setBackgroundResource(android.R.color.black)
            else->view?.setBackgroundColor(Color.GRAY)
        }
    }
}