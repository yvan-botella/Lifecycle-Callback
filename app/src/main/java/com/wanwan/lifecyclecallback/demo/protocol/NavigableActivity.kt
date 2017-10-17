package com.wanwan.lifecyclecallback.demo.protocol

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import com.wanwan.lifecyclecallback.R
import com.wanwan.lifecyclecallback.demo.FragmentBase
import com.wanwan.lifecyclecallback.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface NavigableActivity {

    val fragmentContainerId: Int

    private val _fragmentContainerId: Int
        get() = if (fragmentContainerId == 0) android.R.id.content else fragmentContainerId

    companion object: ActivityLifecycleRegister {
        override fun register(activity: ActivityLifecycleImpl) {
            activity.registerActivityCallback(lifecycle)
        }

        val lifecycle = object : ActivityLifecycleCallbacks {
            override val CLASS: Class<*>
                get() = NavigableActivity::class.java

            override fun onNewIntent(activity: Activity, intent: Intent?): Nothing? {
                if (intent?.hasExtra("NAVIGATE_INTENT") == true) {
                    if (activity is NavigableActivity) {
                        activity.onNavigated()
                    }
                }

                return super.onNewIntent(activity, intent)
            }
        }
    }

    fun onNavigated() {

    }

    fun getCurrentFragment(): Any? {
        if (this is Activity) {
            return findViewById(_fragmentContainerId)
        }
        return null
    }

    fun navigate(clazz: Class<out Fragment>) {
        if (this is Activity) {
            navigate(clazz.newInstance())
        }
    }

    fun navigate(fragment: Fragment) {
        if (this is Activity) {
            fragmentManager.beginTransaction()
                    .replace(_fragmentContainerId, fragment)
                    .addToBackStack(null)
                    .commit()
            onNavigated()
        }
    }
}