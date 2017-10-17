package com.wanwan.androidoverride.demo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wanwan.androidoverride.R
import com.wanwan.androidoverride.demo.lifecycle.ButterKnifeFragmentLifecycle
import com.wanwan.androidoverride.kotlin.*
import com.wanwan.androidoverride.kotlin.callback.FragmentLifecycleCallbacks
/**
 * Created by yvan.botella on 13/10/2017.
 */
class FragmentBase : LifecycleFragment() {
    init {
//        registerFragmentCallback(ButterKnifeFragmentLifecycle())
//        registerFragmentCallback(object : FragmentLifecycleCallbacks {
//            override fun onCreate(fragment: Fragment, savedInstanceState: Bundle?): Nothing? {
//                return super.onCreate(fragment, savedInstanceState)
//            }
//        })
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_base, container, false)
    }
}