package com.sample.bluetoothautolaunch

import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BluetoothBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Log.d( "BluetoothReceiver", " ${intent.action}" )

        when( intent.action ) {
            BluetoothDevice.ACTION_ACL_CONNECTED -> {
                val device : BluetoothDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
                Log.d( "BluetoothReceiver", "BluetoothDevice ${device.name} connected" )
            }
            BluetoothDevice.ACTION_ACL_DISCONNECTED -> {
                val device : BluetoothDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
                Log.d( "BluetoothReceiver", "BluetoothDevice ${device.name} disconnected" )
            }
        }
    }
}
