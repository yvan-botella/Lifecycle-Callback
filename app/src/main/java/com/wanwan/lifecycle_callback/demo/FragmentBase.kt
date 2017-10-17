package com.wanwan.lifecycle_callback.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecycle_callback.LifecycleFragment

/**
 * Created by yvan.botella on 13/10/2017.
 */
class FragmentBase : LifecycleFragment() {
    init {
//        registerFragmentCallback(ButterKnifeFragmentLifecycle())
//        registerFragmentCallback(object : FragmentLifecycleCallbacks {
//            override fun onCreate(fragment: Fragment, savedInstanceState: Bundle?){
//                return super.onCreate(fragment, savedInstanceState)
//            }
//        })
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_base, container, false)
    }
}