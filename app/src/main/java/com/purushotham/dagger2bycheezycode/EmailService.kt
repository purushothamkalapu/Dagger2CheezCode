package com.purushotham.dagger2bycheezycode

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(to: String, from: String, body: String){
        Log.v(TAG, "Email sent.....!")
    }
}