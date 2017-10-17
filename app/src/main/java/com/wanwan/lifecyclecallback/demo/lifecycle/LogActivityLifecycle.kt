package com.wanwan.lifecyclecallback.demo.lifecycle

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
import com.wanwan.lifecyclecallback.demo.protocol.ActivityLifecycleRegister
import com.wanwan.lifecyclecallback.kotlin.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.ActivityLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
class LogActivityLifecycle : ActivityLifecycleCallbacks {

    companion object: ActivityLifecycleRegister {
        override fun register(activity: ActivityLifecycleImpl) {
            activity.registerActivityCallback(LogActivityLifecycle())
        }
    }

    override val CLASS: Class<*>
        get() = javaClass

    override fun onAttachedToWindow(activity: Activity): Nothing? {
        Log.d(TAG(activity), "onAttachedToWindow")
        return super.onAttachedToWindow(activity)
    }

    override fun onPause(activity: Activity): Nothing? {
        Log.d(TAG(activity), "onPause")
        return super.onPause(activity)
    }

    override fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?): Nothing? {
        Log.d(TAG(activity), "onActivityResult")
        return super.onActivityResult(activity, requestCode, resultCode, data)
    }

    override fun onPostResume(activity: Activity): Nothing? {
        Log.d(TAG(activity), "onPostResume")
        return super.onPostResume(activity)
    }

    override fun onTrimMemory(activity: Activity, level: Int) : Nothing? {
        Log.d(TAG(activity), "onTrimMemory")
        return super.onTrimMemory(activity, level)
    }

    override fun onAttachFragment(activity: Activity, fragment: Fragment?) : Nothing? {
        Log.d(TAG(activity), "onAttachFragment")
        return super.onAttachFragment(activity, fragment)
    }

    override fun onDestroy(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onDestroy")
        return super.onDestroy(activity)
    }

    override fun onBackPressed(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onBackPressed")
        return super.onBackPressed(activity)
    }

    override fun onCreate(activity: Activity, savedInstanceState: Bundle?) : Nothing? {
        Log.d(TAG(activity), "onCreate")
        return super.onCreate(activity, savedInstanceState)
    }

    override fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) : Nothing? {
        Log.d(TAG(activity), "onCreate")
        return super.onCreate(activity, savedInstanceState, persistentState)
    }

    override fun onStart(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onStart")
        return super.onStart(activity)
    }

    override fun onResume(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onResume")
        return super.onResume(activity)
    }

    override fun onSaveInstanceState(activity: Activity, outState: Bundle?) : Nothing? {
        Log.d(TAG(activity), "onSaveInstanceState")
        return super.onSaveInstanceState(activity, outState)
    }

    override fun onSaveInstanceState(activity: Activity, outState: Bundle?, outPersistentState: PersistableBundle?) : Nothing? {
        Log.d(TAG(activity), "onSaveInstanceState")
        return super.onSaveInstanceState(activity, outState, outPersistentState)
    }

    override fun onCreateView(activity: Activity, result: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        Log.d(TAG(activity), "onCreateView")
        return super.onCreateView(activity, result, name, context, attrs)
    }

    override fun onCreateView(activity: Activity, result: View?, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        Log.d(TAG(activity), "onCreateView")
        return super.onCreateView(activity, result, parent, name, context, attrs)
    }

    override fun onPostCreate(activity: Activity, savedInstanceState: Bundle?) : Nothing? {
        Log.d(TAG(activity), "onPostCreate")
        return super.onPostCreate(activity, savedInstanceState)
    }

    override fun onPostCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) : Nothing? {
        Log.d(TAG(activity), "onPostCreate")
        return super.onPostCreate(activity, savedInstanceState, persistentState)
    }

    override fun onDetachedFromWindow(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onDetachedFromWindow")
        return super.onDetachedFromWindow(activity)
    }

    override fun onStop(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onStop")
        return super.onStop(activity)
    }

    override fun onRestart(activity: Activity) : Nothing? {
        Log.d(TAG(activity), "onRestart")
        return super.onRestart(activity)
    }

    override fun onOptionsItemSelected(activity: Activity, result: Boolean?, item: MenuItem?): Boolean {
        Log.d(TAG(activity), "onOptionsItemSelected")
        return super.onOptionsItemSelected(activity, result, item)
    }

    override fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?) : Nothing? {
        Log.d(TAG(activity), "onRestoreInstanceState")
        return super.onStart(activity)
    }

    override fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) : Nothing? {
        Log.d(TAG(activity), "onRestoreInstanceState")
        return super.onRestoreInstanceState(activity, savedInstanceState, persistentState)
    }
}