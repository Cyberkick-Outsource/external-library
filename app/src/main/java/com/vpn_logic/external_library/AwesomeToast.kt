package com.vpn_logic.external_library

import android.content.Context
import android.widget.Toast

object AwesomeToast {
    fun show(context: Context){
        Toast.makeText(context,"Hey from Library",Toast.LENGTH_SHORT).show()
    }
}