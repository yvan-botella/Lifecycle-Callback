package com.wanwan.lifecycle_callback.demo

import com.wanwan.lifecycle_callback.LifecycleAppCompatActivity
import com.wanwan.lifecycle_callback.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecycle_callback.lifecycle.LogLifecycle

/**
 * Created by yvan.botella on 13/10/2017.
 */
abstract class ActivityBase : LifecycleAppCompatActivity() {

    init {
        LogLifecycle.register(this)
        registerActivityCallback(object : ActivityLifecycleCallbacks {

        })
    }
}