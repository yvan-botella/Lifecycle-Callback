package com.wanwan.lifecycle_callback.protocol

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecycle_callback.callback.FragmentLifecycleCallbacks
import java.util.*

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentLifecycleImpl {

    var callbacks: Stack<FragmentLifecycleCallbacks>

    fun registerLifecycleCallback()

    //region registering
    fun <T: FragmentLifecycleCallbacks> registerFragmentCallback(callback: T): Boolean  {
        if (!callbacks.contains(callback)) {
            callbacks.push(callback)
            return true
        }
        return false
    }
    //endregion register

    //region tools
    fun foreachCallback(lifecycle:(FragmentLifecycleCallbacks) -> Any?) {
        val iterator = callbacks.iterator()

        while (iterator.hasNext()) {
            lifecycle.invoke(iterator.next())
        }
    }

    fun <U> foreachResultCallback(lifecycle:(FragmentLifecycleCallbacks, U?) -> U?): U? {
        val iterator = callbacks.iterator()
        var result: U? = null

        while (iterator.hasNext()) {
            result = lifecycle.invoke(iterator.next(), result)
        }
        return result
    }
    //endregion tools


    //region added
    fun onBackPressed(fragment: Any, handled: Boolean): Boolean = handled
    //endregion added

    //region override
    fun onActivityCreated(fragment: Any, savedInstanceState: Bundle?) {
        foreachCallback { callback -> callback.onActivityCreated(fragment, savedInstanceState) }
    }

    fun onActivityResult(fragment: Any, requestCode: Int, resultCode: Int, data: Intent?) {
        foreachCallback { callback -> callback.onActivityResult(fragment, requestCode, resultCode, data) }
    }

    fun onAttach(fragment: Any, context: Context?) {
        foreachCallback { callback -> callback.onAttach(fragment, context) }
    }

    fun onAttachFragment(fragment: Any, attachFragment: Any?) {
        foreachCallback { callback -> callback.onAttachFragment(fragment, attachFragment) }
    }

    fun onDestroy(fragment: Any) {
        foreachCallback { callback -> callback.onDestroy(fragment) }
    }

    fun onConfigurationChanged(fragment: Any, newConfig: Configuration?) {
        foreachCallback { callback -> callback.onConfigurationChanged(fragment, newConfig) }
    }

    fun onCreate(fragment: Any, savedInstanceState: Bundle?) {
        foreachCallback { callback -> callback.onCreate(fragment, savedInstanceState = null) }
    }

    fun onCreateView(fragment: Any, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return foreachResultCallback<View> { callback, backResult -> callback.onCreateView(fragment, backResult, inflater, container, savedInstanceState) }
    }

    fun onDetach(fragment: Any) {
        foreachCallback { callback -> callback.onDetach(fragment) }
    }

    fun onDestroyView(fragment: Any) {
        foreachCallback { callback -> callback.onDestroyView(fragment) }
    }

    fun onLowMemory(fragment: Any) {
        foreachCallback { callback -> callback.onLowMemory(fragment) }
    }

    fun onOptionsItemSelected(fragment: Any, handled: Boolean, item: MenuItem?): Boolean {
        val result = foreachResultCallback<Boolean> { callback, backResult -> callback.onOptionsItemSelected(fragment, backResult, item)}
        return result ?: handled
    }

    fun onPause(fragment: Any) {
        foreachCallback { callback -> callback.onPause(fragment) }
    }

    fun onRequestPermissionsResult(fragment: Any, requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        foreachCallback { callback -> callback.onRequestPermissionsResult(fragment, requestCode, permissions, grantResults) }
    }

    fun onResume(fragment: Any) {
        foreachCallback { callback -> callback.onResume(fragment) }
    }

    fun onSaveInstanceState(fragment: Any, outState: Bundle?) {
        foreachCallback { callback -> callback.onSaveInstanceState(fragment, outState) }
    }

    fun onStart(fragment: Any) {
        foreachCallback { callback -> callback.onStart(fragment) }
    }

    fun onStop(fragment: Any) {
        foreachCallback { callback -> callback.onStop(fragment) }
    }

    fun onViewCreated(fragment: Any, view: View?, savedInstanceState: Bundle?) {
        foreachCallback { callback -> callback.onViewCreated(fragment, view, savedInstanceState) }
    }

    //endregion override
}