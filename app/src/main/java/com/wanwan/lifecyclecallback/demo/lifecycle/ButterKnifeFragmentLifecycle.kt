package com.wanwan.lifecyclecallback.demo.lifecycle

import android.app.Fragment
import android.os.Bundle
import com.wanwan.lifecyclecallback.demo.protocol.ActivityLifecycleRegister
import com.wanwan.lifecyclecallback.demo.protocol.FragmentLifecycleRegister
import com.wanwan.lifecyclecallback.kotlin.callback.FragmentLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.FragmentLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
class ButterKnifeFragmentLifecycle : FragmentLifecycleCallbacks {

    companion object: FragmentLifecycleRegister {
        override fun register(fragment: FragmentLifecycleImpl) {
            fragment.registerFragmentCallback(ButterKnifeFragmentLifecycle())
        }
    }

    override val CLASS: Class<*>
        get() = javaClass

    override fun onCreate(fragment: Fragment, savedInstanceState: Bundle?): Nothing? {
        //ButterKnife.bind(this)
        return super.onCreate(fragment, savedInstanceState)
    }
}