package com.example.assignmnent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmnent.model.Tip
import com.example.assignmnent.ui.theme.AssignmnentTheme


class MainActivity : ComponentActivity() {
    private lateinit var tipsRecyclerView: RecyclerView
    private lateinit var tipsAdapter:   WellnessAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tipsList = listOf(
            Tip("Practice good food", "Good Food = Good Mind.", R.drawable.balanced),
            Tip("Drink Frequently", "Drink at least 8 glasses of water throughout the day.", R.drawable.water),
            Tip("Exercise Regularly", "Take short breaks to exercise.", R.drawable.social),
            Tip("Balanced Eating", "Focus on your diet.", R.drawable.food),
            Tip(" Exercise", "Dedicate at least 30 minutes to physical activity.", R.drawable.exercise),
            Tip("Meeting People", "Aim for 1-2 hours of day spend with family and friends.", R.drawable.social),
            Tip("Gym", "Start your morning with gym to set the tone for the day.", R.drawable.a),
            Tip("Detoz", "Drink a lot of water to detox your body.", R.drawable.water),
            Tip("Exercice", "Connect with your body by exercising.", R.drawable.exercise),
            Tip("Dancing", "Practice dancing to reduce stress.", R.drawable.c),
            Tip("Healthy Eating", "Choose balanced food to fuel your body.", R.drawable.balanced),
            Tip("Practice good food", "Good Food = Good Mind.", R.drawable.balanced),
            Tip("Drink Frequently", "Drink at least 8 glasses of water throughout the day.", R.drawable.water),
            Tip("Exercise Regularly", "Take short breaks to exercise.", R.drawable.social),
            Tip("Balanced Eating", "Focus on your diet.", R.drawable.food),
            Tip(" Exercise", "Dedicate at least 30 minutes to physical activity.", R.drawable.exercise),
            Tip("Meeting People", "Aim for 1-2 hours of day spend with family and friends.", R.drawable.social),
            Tip("Gym", "Start your morning with gym to set the tone for the day.", R.drawable.a),
            Tip("Detoz", "Drink a lot of water to detox your body.", R.drawable.water),
            Tip("Exercice", "Connect with your body by exercising.", R.drawable.exercise),
            Tip("Dancing", "Practice dancing to reduce stress.", R.drawable.c),
            Tip("Healthy Eating", "Choose balanced food to fuel your body.", R.drawable.balanced),

            )

        tipsRecyclerView = findViewById(R.id.tips_recycler_view)
        tipsAdapter = WellnessAdapter(tipsList)
        tipsRecyclerView.adapter = tipsAdapter
    }
}