package com.wanwan.lifecyclecallback.demo.protocol

import android.app.Activity
import android.os.Bundle
import com.wanwan.lifecyclecallback.R
import com.wanwan.lifecyclecallback.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.ActivityLifecycleImpl
import com.wanwan.lifecyclecallback.kotlin.protocol.FragmentLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentLifecycleRegister {

    fun register(fragment: FragmentLifecycleImpl)
}