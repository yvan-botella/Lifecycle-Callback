package com.wanwan.lifecyclecallback.kotlin.protocol

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
import com.wanwan.lifecyclecallback.kotlin.callback.ActivityLifecycleCallbacks

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface ActivityLifecycleImpl {

    var callbacks: HashMap<Class<*>, ActivityLifecycleCallbacks>
    
    //region registering
    fun <T: ActivityLifecycleCallbacks> registerActivityCallback(callback: T): Boolean {
        if (!callbacks.containsKey(callback.CLASS)) {
            callbacks.put(callback.CLASS, callback)
            return true
        }
        return false
    }
    //endregion register

    //region tools
    fun foreachCallback(lifecycle:(ActivityLifecycleCallbacks) -> Any) {
//        val iterator = callbacks.iterator()

        for(callback in callbacks) {
            lifecycle.invoke(callback.value)
        }

//        while (iterator.hasNext()) {
//            Log.d(TAG.get(this), "foreachCallback => hasNext")
//            lifecycle.invoke(iterator.next().value)
//            Log.d(TAG.get(this), "invoke")
//        }
    }

    fun <U> foreachResultCallback(lifecycle:(ActivityLifecycleCallbacks, U?) -> U?): U? {
//        val iterator = callbacks.iterator()
        var result: U? = null

        for(callback in callbacks) {
            result = lifecycle.invoke(callback.value, result)
        }
//        while (iterator?.hasNext() == true) {
//            result = lifecycle.invoke(iterator.next().value, result)
//        }
        return result
    }
    //endregion tools

    //region override
    fun onAttachedToWindow(activity: Activity) {
        foreachCallback { callback -> { callback.onAttachedToWindow(activity) } }
    }

    fun onPause(activity: Activity) {
        foreachCallback { callback -> { callback.onPause(activity) } }
    }

    fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?) {
        foreachCallback { callback -> { callback.onActivityResult(activity, requestCode, resultCode, data) } }
    }

    fun onPostResume(activity: Activity) {
        foreachCallback { callback -> { callback.onPostResume(activity) } }
    }

    fun onTrimMemory(activity: Activity, level: Int) {
        foreachCallback { callback -> { callback.onTrimMemory(activity, level) } }
    }

    fun onAttachFragment(activity: Activity, fragment: Fragment?) {
        foreachCallback { callback -> { callback.onAttachFragment(activity, fragment) } }
    }

    fun onDestroy(activity: Activity) {
        foreachCallback { callback -> { callback.onDestroy(activity) } }
    }

    fun onBackPressed(activity: Activity) {
        Log.d(TAG.get(this), "onBackPressed")
        foreachCallback { callback ->
            {
                Log.d(TAG.get(this), "onBackPressed CALLBACK")
                callback.onBackPressed(activity)
            }
        }
    }

    fun onCreate(activity: Activity, savedInstanceState: Bundle?) {
        Log.d(TAG.get(this), "onCreate")
        foreachCallback { callback ->
            {
                Log.d(TAG.get(this), "onCreate => foreachCallback")
                callback.onCreate(activity, savedInstanceState)
                Log.d(TAG.get(this), "onCreate => callback")
            }
        }
    }

    fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        foreachCallback { callback -> { callback.onCreate(activity, savedInstanceState, persistentState) } }
    }

    fun onStart(activity: Activity) {
        foreachCallback { callback -> { callback.onStart(activity) } }
    }

    fun onNewIntent(activity: Activity, intent: Intent?) {
        foreachCallback { callback -> { callback.onNewIntent(activity, intent) } }
    }

    fun onResume(activity: Activity) {
        foreachCallback { callback -> { callback.onResume(activity) } }
    }

    fun onSaveInstanceState(activity: Activity, outState: Bundle?) {
        foreachCallback { callback -> { callback.onSaveInstanceState(activity, outState) } }
    }

    fun onSaveInstanceState(activity: Activity, outState: Bundle?, outPersistentState: PersistableBundle?) {
        foreachCallback { callback -> { callback.onSaveInstanceState(activity, outState, outPersistentState) } }
    }

    fun onCreateView(activity: Activity, name: String?, context: Context?, attrs: AttributeSet?): View? {
        return foreachResultCallback { callback, result ->  callback.onCreateView(activity, result, name, context, attrs)}
    }

    fun onCreateView(activity: Activity, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        return foreachResultCallback { callback, result ->  callback.onCreateView(activity, result, parent, name, context, attrs)}
    }

    fun onPostCreate(activity: Activity, savedInstanceState: Bundle?) {
        foreachCallback { callback -> { callback.onPostCreate(activity, savedInstanceState) } }
    }

    fun onPostCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        foreachCallback { callback -> { callback.onPostCreate(activity, savedInstanceState, persistentState) } }
    }

    fun onDetachedFromWindow(activity: Activity) {
        foreachCallback { callback -> { callback.onDetachedFromWindow(activity) } }
    }

    fun onStop(activity: Activity) {
        foreachCallback { callback -> { callback.onStop(activity) } }
    }

    fun onRestart(activity: Activity) {
        foreachCallback { callback -> { callback.onRestart(activity) } }
    }

    fun onOptionsItemSelected(activity: Activity, item: MenuItem?): Boolean {
        val result = foreachResultCallback<Boolean> { callback, result -> callback.onOptionsItemSelected(activity, result, item)}
        return result ?: false
    }

    fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?) {
        foreachCallback { callback -> { callback.onRestoreInstanceState(activity, savedInstanceState) } }
    }

    fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        foreachCallback { callback -> { callback.onRestoreInstanceState(activity, savedInstanceState, persistentState) } }
    }

    //endregion override
}