package com.wanwan.androidoverride.kotlin.protocol

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.androidoverride.kotlin.callback.FragmentLifecycleCallbacks

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentLifecycleImpl {
    var callbacks: HashMap<Class<*>, FragmentLifecycleCallbacks>

    //region registering
    fun <T: FragmentLifecycleCallbacks> registerFragmentCallback(callback: T): Boolean  {
        if (callbacks.containsKey(callback.CLASS) == false) {
            callbacks.put(callback.CLASS, callback)
            return true
        }
        return false
    }
    //endregion register

    //region tools
    fun foreachCallback(lifecycle:(FragmentLifecycleCallbacks) -> Any) {
        val iterator = callbacks.iterator()

        while (iterator?.hasNext() == true) {
            lifecycle.invoke(iterator.next().value)
        }
    }

    fun <U> foreachResultCallback(lifecycle:(FragmentLifecycleCallbacks, U?) -> U?): U? {
        val iterator = callbacks.iterator()
        var result: U? = null

        while (iterator?.hasNext() == true) {
            result = lifecycle.invoke(iterator.next().value, result)
        }
        return result
    }
    //endregion tools


    //region added
    fun onBackPressed(fragment: Fragment): Boolean = false
    //endregion added

    //region override
    fun onActivityCreated(fragment: Fragment, savedInstanceState: Bundle?) {
        foreachCallback { callback -> { callback.onActivityCreated(fragment, savedInstanceState) } }
    }

    fun onActivityResult(fragment: Fragment, requestCode: Int, resultCode: Int, data: Intent?) {
        foreachCallback { callback -> { callback.onActivityResult(fragment, requestCode, resultCode, data) } }
    }

    fun onAttach(fragment: Fragment, context: Context?) {
        foreachCallback { callback -> { callback.onAttach(fragment, context) } }
    }

    fun onAttachFragment(fragment: Fragment, attachFragment: Fragment?) {
        foreachCallback { callback -> { callback.onAttachFragment(fragment, attachFragment) } }
    }

    fun onDestroy(fragment: Fragment) {
        foreachCallback { callback -> { callback.onDestroy(fragment) } }
    }

    fun onConfigurationChanged(fragment: Fragment, newConfig: Configuration?) {
        foreachCallback { callback -> { callback.onConfigurationChanged(fragment, newConfig) } }
    }

    fun onCreate(fragment: Fragment, savedInstanceState: Bundle?) {
        foreachCallback { callback -> { callback.onCreate(fragment, savedInstanceState = null) } }
    }

    fun onCreateView(fragment: Fragment, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return foreachResultCallback<View> { callback, result -> callback.onCreateView(fragment, result, inflater, container, savedInstanceState) }
    }

    fun onDetach(fragment: Fragment) {
        foreachCallback { callback -> { callback.onDetach(fragment) } }
    }

    fun onDestroyView(fragment: Fragment) {
        foreachCallback { callback -> { callback.onDestroyView(fragment) } }
    }

    fun onLowMemory(fragment: Fragment) {
        foreachCallback { callback -> { callback.onLowMemory(fragment) } }
    }

    fun onOptionsItemSelected(fragment: Fragment, item: MenuItem?): Boolean {
        val result = foreachResultCallback<Boolean> { callback, result -> callback.onOptionsItemSelected(fragment, result, item) }
        return result ?: false
    }

    fun onPause(fragment: Fragment) {
        foreachCallback { callback -> { callback.onPause(fragment) } }
    }

    fun onRequestPermissionsResult(fragment: Fragment, requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        foreachCallback { callback -> { callback.onRequestPermissionsResult(fragment, requestCode, permissions, grantResults) } }
    }

    fun onResume(fragment: Fragment) {
        foreachCallback { callback -> { callback.onResume(fragment) } }
    }

    fun onSaveInstanceState(fragment: Fragment, outState: Bundle?) {
        foreachCallback { callback -> { callback.onSaveInstanceState(fragment, outState) } }
    }

    fun onStart(fragment: Fragment) {
        foreachCallback { callback -> { callback.onStart(fragment) } }
    }

    fun onStop(fragment: Fragment) {
        foreachCallback { callback -> { callback.onStop(fragment) } }
    }

    fun onViewCreated(fragment: Fragment, view: View?, savedInstanceState: Bundle?) {
        foreachCallback { callback -> { callback.onViewCreated(fragment, view, savedInstanceState) } }
    }

    //endregion override
}