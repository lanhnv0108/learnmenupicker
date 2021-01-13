package com.example.menu

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(txt_text)
        btn_click.setOnClickListener {
            //showMenu(it, R.menu.overflow)
            openDialog()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_1 -> Log.e("TEST", "Option 1")
            R.id.option_2 -> Log.e("TEST", "Option 2")
            R.id.option_3 -> Log.e("TEST", "Option 3")
        }
        return true
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.overflow, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_1 -> Log.e("TEST", "Option 1")
            R.id.option_2 -> Log.e("TEST", "Option 2")
            R.id.option_3 -> Log.e("TEST", "Option 3")
        }
        return super.onContextItemSelected(item)
    }

    private fun showMenu(v: View, menuRes: Int) {
        val popup = PopupMenu(this, v)
        popup.setOnMenuItemClickListener{ item: MenuItem? ->

            when (item!!.itemId) {
                R.id.option_1 -> Log.e("TEST", "Option 1")
                R.id.option_2 -> Log.e("TEST", "Option 1")
                R.id.option_3 -> Log.e("TEST", "Option 1")

            }
            true
        }

        popup.menuInflater.inflate(menuRes, popup.menu)
        popup.show()
    }

    private fun openDialog () {
/*        MaterialAlertDialogBuilder(this)
                .setTitle("Hello")
                .setMessage("Hi chao ban")
                .setNeutralButton("Hi") { _, _ ->
                    // Respond to neutral button press
                }
                .setNegativeButton("Done") { _, _ ->
                    // Respond to negative button press
                }
                .setPositiveButton("Cancel") { _, _ ->
                    // Respond to positive button press
                }
                .show()*/
        MaterialAlertDialogBuilder(this).run {
            setTitle("Hello")
            setMessage("HI anh em")
            setPositiveButton("Oke") {_ ,_
                ->
            }
            setNegativeButton("Cancel") {_,_ ->}
            show()
        }
    }
}

