package com.wanwan.androidoverride.demo.protocol

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.MenuItem
import android.view.View
import com.wanwan.androidoverride.R
import com.wanwan.androidoverride.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.androidoverride.kotlin.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface AutoLayoutActivity {

    val layoutId: Int

    companion object: ActivityLifecycleRegister {
        override fun register(activity: ActivityLifecycleImpl) {
            activity.registerActivityCallback(lifecycle)
        }

        val lifecycle = object : ActivityLifecycleCallbacks {
            override val CLASS: Class<*>
                get() = AutoLayoutActivity::class.java

            override fun onCreate(activity: Activity, savedInstanceState: Bundle?): Nothing? {
                Log.d(TAG, activity.toString())
                if (activity is AutoLayoutActivity) {
                    activity.setContentView(activity.layoutId)
                    Log.d(TAG, "SET_CONTENT_VIEW")
                }
                return null
            }

            override fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?): Nothing? {
                return super.onActivityResult(activity, requestCode, resultCode, data)
            }

            override fun onAttachFragment(activity: Activity, fragment: Fragment?): Nothing? {
                return super.onAttachFragment(activity, fragment)
            }

            override fun onAttachedToWindow(activity: Activity): Nothing? {
                return super.onAttachedToWindow(activity)
            }

            override fun onBackPressed(activity: Activity): Nothing? {
                return super.onBackPressed(activity)
            }

            override fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?): Nothing? {
                return super.onCreate(activity, savedInstanceState, persistentState)
            }

            override fun onCreateView(activity: Activity, result: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
                return super.onCreateView(activity, result, name, context, attrs)
            }

            override fun onCreateView(activity: Activity, result: View?, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
                return super.onCreateView(activity, result, parent, name, context, attrs)
            }

            override fun onDestroy(activity: Activity): Nothing? {
                return super.onDestroy(activity)
            }

            override fun onDetachedFromWindow(activity: Activity): Nothing? {
                return super.onDetachedFromWindow(activity)
            }

            override fun onNewIntent(activity: Activity, intent: Intent?): Nothing? {
                return super.onNewIntent(activity, intent)
            }

            override fun onOptionsItemSelected(activity: Activity, result: Boolean?, item: MenuItem?): Boolean {
                return super.onOptionsItemSelected(activity, result, item)
            }

            override fun onPause(activity: Activity): Nothing? {
                return super.onPause(activity)
            }

            override fun onPostCreate(activity: Activity, savedInstanceState: Bundle?): Nothing? {
                return super.onPostCreate(activity, savedInstanceState)
            }

            override fun onPostCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?): Nothing? {
                return super.onPostCreate(activity, savedInstanceState, persistentState)
            }

            override fun onPostResume(activity: Activity): Nothing? {
                return super.onPostResume(activity)
            }

            override fun onRestart(activity: Activity): Nothing? {
                return super.onRestart(activity)
            }

            override fun onResume(activity: Activity): Nothing? {
                return super.onResume(activity)
            }

            override fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?): Nothing? {
                return super.onRestoreInstanceState(activity, savedInstanceState)
            }

            override fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?): Nothing? {
                return super.onRestoreInstanceState(activity, savedInstanceState, persistentState)
            }

            override fun onStart(activity: Activity): Nothing? {
                return super.onStart(activity)
            }

            override fun onSaveInstanceState(activity: Activity, outState: Bundle?): Nothing? {
                return super.onSaveInstanceState(activity, outState)
            }

            override fun onSaveInstanceState(activity: Activity, outState: Bundle?, outPersistentState: PersistableBundle?): Nothing? {
                return super.onSaveInstanceState(activity, outState, outPersistentState)
            }

            override fun onStop(activity: Activity): Nothing? {
                return super.onStop(activity)
            }

            override fun onTrimMemory(activity: Activity, level: Int): Nothing? {
                return super.onTrimMemory(activity, level)
            }
        }
    }
}