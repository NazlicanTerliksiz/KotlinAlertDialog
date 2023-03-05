package com.nazlicanterliksiz.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context

        //Activity Context -> this
        //(Bazı durumlarda aktiviteyi ilgilendiren işlemler olabilir)
        //App Context -> applicationContext
        //(Bazı durumlarda da genel olarak app i igilendiren işlemler olabilir)

        Toast.makeText(applicationContext,"welcome", Toast.LENGTH_LONG).show()
        Toast.makeText(this,"welcome", Toast.LENGTH_LONG).show()
        //(Bu şekilde de activity i başlattığımızda da ekranda welcome yazısını görürüz)
        Toast.makeText(this@MainActivity,"welcome", Toast.LENGTH_LONG).show()
        //(Bu şekilde de kullanılabilir)
        //Toast.makeText(MainActivity.this,"welcome", Toast.LENGTH_LONG).show()
        //(Java da bu şekilde kullanılmaktadır)
    }

    fun save(view : View){
        val alert = AlertDialog.Builder(this)
        //val alert = AlertDialog.Builder(applicationContext)
        //Bu şekilde uygulama çökecektir çünkü AlertDialog mainActivity nin inheritance aldığı
        //appCompatActivity den bazı özellikleri aldığı için context olarak app in kendisi yerine activity vermemiz gerekiyor.)

        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes") {dialog, which ->
            Toast.makeText(applicationContext, "saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("no") {dialog, which ->
            Toast.makeText(applicationContext, "not saved",Toast.LENGTH_LONG).show()

        }
        alert.show()
    }

}