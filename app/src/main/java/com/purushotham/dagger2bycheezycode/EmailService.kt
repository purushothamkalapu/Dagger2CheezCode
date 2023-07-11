package com.purushotham.dagger2bycheezycode

import android.util.Log

class EmailService {
    fun send(to: String, from: String, body: String){
        Log.v(TAG, "Email sent.....!")
    }
}