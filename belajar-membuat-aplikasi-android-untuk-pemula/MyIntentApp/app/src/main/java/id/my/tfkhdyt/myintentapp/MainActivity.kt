package id.my.tfkhdyt.myintentapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button =
            findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnMoveWithObject: Button =
            findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent =
                    Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveWithDataIntent =
                    Intent(this@MainActivity, MoveWithDataActivity::class.java)

                moveWithDataIntent.putExtra(
                    MoveWithDataActivity.EXTRA_NAME,
                    "Taufik Hidayat"
                )
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 21)

                startActivity(moveWithDataIntent)
            }

            R.id.btn_move_activity_object -> {
                val person = Person(
                    "Taufik Hidayat",
                    21,
                    "me@tfkhdyt.my.id",
                    "Bandung"
                )

                val moveWithObjectIntent = Intent(
                    this@MainActivity,
                    MoveWithObjectActivity::class.java
                )
                moveWithObjectIntent.putExtra(
                    MoveWithObjectActivity.EXTRA_PERSON,
                    person
                )
                startActivity(moveWithObjectIntent)
            }
        }
    }
}