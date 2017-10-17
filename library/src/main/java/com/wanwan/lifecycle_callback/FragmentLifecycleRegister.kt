package com.wanwan.lifecycle_callback

import com.wanwan.lifecycle_callback.protocol.FragmentLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentLifecycleRegister {

    fun register(fragment: FragmentLifecycleImpl)
}