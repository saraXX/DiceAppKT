package android.guide.diceappkt

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.btnView)


        button.setOnClickListener {
            rollDice()
        }

        // Do a dice roll when the app starts
        rollDice()

    }

    fun rollDice(){
        val rollResult = Dice(6).roll()
        val imgHolder: ImageView = findViewById(R.id.imgView)

        val drawableResource  = when (rollResult){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgHolder.setImageResource(drawableResource)
        imgHolder.contentDescription = rollResult.toString()
    }
}