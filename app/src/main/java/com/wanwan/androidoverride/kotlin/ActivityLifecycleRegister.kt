package com.wanwan.androidoverride.demo.protocol

import android.app.Activity
import android.os.Bundle
import com.wanwan.androidoverride.R
import com.wanwan.androidoverride.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.androidoverride.kotlin.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface ActivityLifecycleRegister {

    fun register(activity: ActivityLifecycleImpl)
}