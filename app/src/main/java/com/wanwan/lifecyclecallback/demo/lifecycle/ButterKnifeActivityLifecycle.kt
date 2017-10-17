package com.wanwan.lifecyclecallback.demo.lifecycle

import android.app.Activity
import android.os.Bundle
import com.wanwan.lifecyclecallback.demo.protocol.ActivityLifecycleRegister
import com.wanwan.lifecyclecallback.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
class ButterKnifeActivityLifecycle : ActivityLifecycleCallbacks {

    companion object: ActivityLifecycleRegister {
        override fun register(activity: ActivityLifecycleImpl) {
            activity.registerActivityCallback(ButterKnifeActivityLifecycle())
        }
    }

    override val CLASS: Class<*>
        get() = javaClass

    override fun onCreate(activity: Activity, savedInstanceState: Bundle?): Nothing? {
        //ButterKnife.bind(this)
        return super.onCreate(activity, savedInstanceState)
    }
}