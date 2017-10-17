package com.wanwan.lifecyclecallback.demo.lifecycle

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecyclecallback.demo.protocol.ActivityLifecycleRegister
import com.wanwan.lifecyclecallback.demo.protocol.FragmentLifecycleRegister
import com.wanwan.lifecyclecallback.demo.protocol.NavigableActivity
import com.wanwan.lifecyclecallback.kotlin.callback.FragmentLifecycleCallbacks
import com.wanwan.lifecyclecallback.kotlin.protocol.ActivityLifecycleImpl
import com.wanwan.lifecyclecallback.kotlin.protocol.FragmentLifecycleImpl
import com.wanwan.lifecyclecallback.kotlin.protocol.TAG

/**
 * Created by yvan.botella on 12/10/2017.
 */
class LogFragmentLifecycle : FragmentLifecycleCallbacks {

    companion object: FragmentLifecycleRegister {
        override fun register(fragment: FragmentLifecycleImpl) {
            fragment.registerFragmentCallback(LogFragmentLifecycle())
        }
    }

    override val CLASS: Class<*>
        get() = javaClass

    override fun onBackPressed(result: Boolean?): Boolean {
        Log.d(TAG, "onBackPressed")
        return super.onBackPressed(result)
    }

    override fun onActivityCreated(fragment: Fragment, savedInstanceState: Bundle?): Nothing? {
        Log.d(TAG(fragment), "onActivityCreated")
        return super.onActivityCreated(fragment, savedInstanceState)
    }

    override fun onActivityResult(fragment: Fragment, requestCode: Int, resultCode: Int, data: Intent?): Nothing? {
        Log.d(TAG(fragment), "onActivityResult")
        return super.onActivityResult(fragment, requestCode, resultCode, data)
    }

    override fun onAttach(fragment: Fragment, context: Context?): Nothing? {
        Log.d(TAG(fragment), "onAttach§")
        return super.onAttach(fragment, context)
    }

    override fun onAttachFragment(fragment: Fragment, attachFragment: Fragment?): Nothing? {
        Log.d(TAG(fragment), "onAttachFragment")
        return super.onAttachFragment(fragment, attachFragment)
    }

    override fun onDestroy(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onDestroy")
        return super.onDestroy(fragment)
    }

    override fun onConfigurationChanged(fragment: Fragment, newConfig: Configuration?): Nothing? {
        Log.d(TAG(fragment), "onConfigurationChanged")
        return super.onConfigurationChanged(fragment, newConfig)
    }

    override fun onCreate(fragment: Fragment, savedInstanceState: Bundle?): Nothing? {
        Log.d(TAG(fragment), "onCreate")
        return super.onCreate(fragment, savedInstanceState)
    }

    override fun onCreateView(fragment: Fragment, result: View?, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG(fragment), "onCreateView")
        return super.onCreateView(fragment, result, inflater, container, savedInstanceState)
    }

    override fun onDetach(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onDetach")
        return super.onDetach(fragment)
    }

    override fun onDestroyView(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onDestroyView")
        return super.onDestroyView(fragment)
    }

    override fun onLowMemory(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onLowMemory")
        return super.onLowMemory(fragment)
    }

    override fun onOptionsItemSelected(fragment: Fragment, result: Boolean?, item: MenuItem?): Boolean? {
        Log.d(TAG(fragment), "onOptionsItemSelected")
        return super.onOptionsItemSelected(fragment, result, item)
    }

    override fun onPause(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onPause")
        return super.onPause(fragment)
    }

    override fun onRequestPermissionsResult(fragment: Fragment, requestCode: Int, permissions: Array<out String>?, grantResults: IntArray?): Nothing? {
        Log.d(TAG(fragment), "onRequestPermissionsResult")
        return super.onRequestPermissionsResult(fragment, requestCode, permissions, grantResults)
    }

    override fun onResume(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onResume")
        return super.onResume(fragment)
    }

    override fun onSaveInstanceState(fragment: Fragment, outState: Bundle?): Nothing? {
        Log.d(TAG(fragment), "onSaveInstanceState")
        return super.onSaveInstanceState(fragment, outState)
    }

    override fun onStart(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onStart")
        return super.onStart(fragment)
    }

    override fun onStop(fragment: Fragment): Nothing? {
        Log.d(TAG(fragment), "onStop")
        return super.onStop(fragment)
    }

    override fun onViewCreated(fragment: Fragment, view: View?, savedInstanceState: Bundle?): Nothing? {
        Log.d(TAG(fragment), "onViewCreated")
        return super.onViewCreated(fragment, view, savedInstanceState)
    }
}