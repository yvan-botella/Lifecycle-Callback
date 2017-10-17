package com.wanwan.androidoverride.demo

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.wanwan.androidoverride.demo.lifecycle.LogActivityLifecycle
import com.wanwan.androidoverride.demo.protocol.AutoLayoutActivity
import com.wanwan.androidoverride.demo.protocol.NavigableActivity
import com.wanwan.androidoverride.kotlin.LifecycleActivity
import com.wanwan.androidoverride.kotlin.LifecycleAppCompatActivity
import com.wanwan.androidoverride.kotlin.callback.ActivityLifecycleCallbacks

/**
 * Created by yvan.botella on 13/10/2017.
 */
abstract class ActivityBase : LifecycleAppCompatActivity(), NavigableActivity, AutoLayoutActivity {

    init {
        NavigableActivity.register(this)
        AutoLayoutActivity.register(this)

        LogActivityLifecycle.register(this)
    }
}