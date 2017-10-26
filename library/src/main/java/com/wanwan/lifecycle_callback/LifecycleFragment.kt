package com.wanwan.lifecycle_callback

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecycle_callback.callback.FragmentLifecycleCallbacks
import com.wanwan.lifecycle_callback.protocol.FragmentLifecycleImpl
import java.util.*

/**
 * Created by yvan.botella on 12/10/2017.
 */
abstract class LifecycleFragment : Fragment(), FragmentLifecycleImpl {

    override var callbacks = Stack<FragmentLifecycleCallbacks>()

    init {
        registerLifecycleCallback()
    }

    //region added
    fun onBackPressed() = super.onBackPressed(this, false)
    //endregion added

    //region override
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super<Fragment>.onActivityCreated(savedInstanceState)
        super<FragmentLifecycleImpl>.onActivityCreated(this, savedInstanceState)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super<Fragment>.onActivityResult(requestCode, resultCode, data)
        super<FragmentLifecycleImpl>.onActivityResult(this, requestCode, resultCode, data)
    }

    override fun onAttach(context: Context?) {
        super<Fragment>.onAttach(context)
        super<FragmentLifecycleImpl>.onAttach(this, context)
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super<Fragment>.onAttachFragment(fragment)
        super<FragmentLifecycleImpl>.onAttachFragment(this, fragment)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super<Fragment>.onConfigurationChanged(newConfig)
        super<FragmentLifecycleImpl>.onConfigurationChanged(this, newConfig)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
        super<FragmentLifecycleImpl>.onCreate(this, savedInstanceState = null)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super<Fragment>.onCreateView(inflater, container, savedInstanceState)
        return super<FragmentLifecycleImpl>.onCreateView(this, inflater, container, savedInstanceState)
    }

    override fun onDestroy() {
        super<Fragment>.onDestroy()
        super<FragmentLifecycleImpl>.onDestroy(this)
    }

    override fun onDetach() {
        super<Fragment>.onDetach()
        super<FragmentLifecycleImpl>.onDetach(this)
    }

    override fun onDestroyView() {
        super<Fragment>.onDestroyView()
        super<FragmentLifecycleImpl>.onDestroyView(this)
    }

    override fun onLowMemory() {
        super<Fragment>.onLowMemory()
        super<FragmentLifecycleImpl>.onLowMemory(this)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val handled = super<FragmentLifecycleImpl>.onOptionsItemSelected(this, false, item)
        if (!handled) {
            return super<Fragment>.onOptionsItemSelected(item)
        }
        return handled
    }

    override fun onPause() {
        super<Fragment>.onPause()
        super<FragmentLifecycleImpl>.onPause(this)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super<Fragment>.onRequestPermissionsResult(requestCode, permissions, grantResults)
        super<FragmentLifecycleImpl>.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }

    override fun onResume() {
        super<Fragment>.onResume()
        super<FragmentLifecycleImpl>.onResume(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super<Fragment>.onSaveInstanceState(outState)
        super<FragmentLifecycleImpl>.onSaveInstanceState(this, outState)
    }

    override fun onStart() {
        super<Fragment>.onStart()
        super<FragmentLifecycleImpl>.onStart(this)
    }

    override fun onStop() {
        super<Fragment>.onStop()
        super<FragmentLifecycleImpl>.onStop(this)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super<Fragment>.onViewCreated(view, savedInstanceState)
        super<FragmentLifecycleImpl>.onViewCreated(this, view, savedInstanceState)
    }

    //endregion override
}