package com.wanwan.lifecycle_callback

import com.wanwan.lifecycle_callback.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface ActivityLifecycleRegister {

    fun register(activity: ActivityLifecycleImpl)
}