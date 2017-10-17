package com.wanwan.lifecycle_callback.lifecycle

import android.app.Activity
import android.os.Bundle
import com.wanwan.lifecycle_callback.ActivityLifecycleRegister
import com.wanwan.lifecycle_callback.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecycle_callback.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
class ButterKnifeActivityLifecycle : ActivityLifecycleCallbacks {

    companion object: ActivityLifecycleRegister {
        override fun register(activity: ActivityLifecycleImpl) {
            activity.registerActivityCallback(ButterKnifeActivityLifecycle())
        }
    }

    override fun onCreate(activity: Activity, savedInstanceState: Bundle?){
        //ButterKnife.bind(this)
    }
}