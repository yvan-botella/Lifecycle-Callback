package com.wanwan.androidoverride.demo

import android.os.Bundle
import com.wanwan.androidoverride.R
import com.wanwan.androidoverride.demo.lifecycle.LogActivityLifecycle
import com.wanwan.androidoverride.demo.protocol.NavigableActivity
import com.wanwan.androidoverride.kotlin.LifecycleActivity

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