package com.wanwan.androidoverride.demo.protocol

import android.app.Activity
import android.os.Bundle
import com.wanwan.androidoverride.R
import com.wanwan.androidoverride.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.androidoverride.kotlin.protocol.ActivityLifecycleImpl
import com.wanwan.androidoverride.kotlin.protocol.FragmentLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentLifecycleRegister {

    fun register(fragment: FragmentLifecycleImpl)
}