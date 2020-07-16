package com.pce.android.mhwhelper

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class MHWHelperApplication: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}