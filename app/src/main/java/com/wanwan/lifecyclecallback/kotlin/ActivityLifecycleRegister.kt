package com.wanwan.lifecyclecallback.demo.protocol

import android.app.Activity
import android.os.Bundle
import com.wanwan.lifecyclecallback.R
import com.wanwan.lifecyclecallback.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface ActivityLifecycleRegister {

    fun register(activity: ActivityLifecycleImpl)
}