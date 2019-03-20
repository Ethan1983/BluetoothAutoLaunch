package com.sample.bluetoothautolaunch

import android.bluetooth.BluetoothManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = requireNotNull( getSystemService<BluetoothManager>() )

        with( manager.adapter ) {
            bondedDevices.forEach {
                Log.d( "MainActivity", "Registered Device ${it.name}" )
            }
        }
    }
}
