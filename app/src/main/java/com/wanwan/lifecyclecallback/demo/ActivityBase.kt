package com.wanwan.lifecyclecallback.demo

import com.wanwan.lifecyclecallback.demo.lifecycle.LogActivityLifecycle
import com.wanwan.lifecyclecallback.demo.protocol.AutoLayoutActivity
import com.wanwan.lifecyclecallback.demo.protocol.NavigableActivity
import com.wanwan.lifecyclecallback.kotlin.LifecycleAppCompatActivity

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