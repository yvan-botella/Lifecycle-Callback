package com.wanwan.lifecycle_callback.lifecycle

import android.app.Fragment
import android.os.Bundle
import com.wanwan.lifecycle_callback.FragmentLifecycleRegister
import com.wanwan.lifecycle_callback.callback.FragmentLifecycleCallbacks
import com.wanwan.lifecycle_callback.protocol.FragmentLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
class ButterKnifeFragmentLifecycle : FragmentLifecycleCallbacks {

    companion object: FragmentLifecycleRegister {
        override fun register(fragment: FragmentLifecycleImpl) {
            fragment.registerFragmentCallback(ButterKnifeFragmentLifecycle())
        }
    }

    override fun onCreate(fragment: Fragment, savedInstanceState: Bundle?){
        //ButterKnife.bind(this)
    }
}