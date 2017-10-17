package com.wanwan.lifecyclecallback.demo

import android.os.Bundle
import com.wanwan.lifecyclecallback.R
import com.wanwan.lifecyclecallback.demo.lifecycle.LogActivityLifecycle
import com.wanwan.lifecyclecallback.demo.protocol.NavigableActivity
import com.wanwan.lifecyclecallback.kotlin.LifecycleActivity

/**
 * Created by yvan.botella on 13/10/2017.
 */
class MainActivity : ActivityBase() {

    override val layoutId: Int
        get() = R.layout.activity_main

    override val fragmentContainerId: Int
        get() = R.id.fragment_container

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(layoutId)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
 //
        //       navigate(FragmentBase::class.java)
    }
}