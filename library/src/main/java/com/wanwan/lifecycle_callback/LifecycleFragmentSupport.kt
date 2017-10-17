package com.wanwan.lifecycle_callback.kotlin

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecycle_callback.kotlin.callback.FragmentSupportLifecycleCallbacks
import com.wanwan.lifecycle_callback.kotlin.protocol.FragmentSupportLifecycleImpl
import java.util.*

/**
 * Created by yvan.botella on 12/10/2017.
 */
open class LifecycleFragmentSupport : Fragment(), FragmentSupportLifecycleImpl {

    override var callbacks = Stack<FragmentSupportLifecycleCallbacks>()

    //endregion added
    fun onBackPressed(): Boolean {
        return super.onBackPressed(this)
    }
    //endregion added

    //region override
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super<Fragment>.onActivityCreated(savedInstanceState)
        super<FragmentSupportLifecycleImpl>.onActivityCreated(this, savedInstanceState)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super<Fragment>.onActivityResult(requestCode, resultCode, data)
        super<FragmentSupportLifecycleImpl>.onActivityResult(this, requestCode, resultCode, data)
    }

    override fun onAttach(context: Context?) {
        super<Fragment>.onAttach(context)
        super<FragmentSupportLifecycleImpl>.onAttach(this, context)
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super<Fragment>.onAttachFragment(fragment)
        super<FragmentSupportLifecycleImpl>.onAttachFragment(this, fragment)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super<Fragment>.onConfigurationChanged(newConfig)
        super<FragmentSupportLifecycleImpl>.onConfigurationChanged(this, newConfig)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
        super<FragmentSupportLifecycleImpl>.onCreate(this, savedInstanceState = null)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super<Fragment>.onCreateView(inflater, container, savedInstanceState)
        return super<FragmentSupportLifecycleImpl>.onCreateView(this, inflater, container, savedInstanceState)
    }

    override fun onDestroy() {
        super<Fragment>.onDestroy()
        super<FragmentSupportLifecycleImpl>.onDestroy(this)
    }

    override fun onDetach() {
        super<Fragment>.onDetach()
        super<FragmentSupportLifecycleImpl>.onDetach(this)
    }

    override fun onDestroyView() {
        super<Fragment>.onDestroyView()
        super<FragmentSupportLifecycleImpl>.onDestroyView(this)
    }

    override fun onLowMemory() {
        super<Fragment>.onLowMemory()
        super<FragmentSupportLifecycleImpl>.onLowMemory(this)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        super<Fragment>.onOptionsItemSelected(item)
        return super<FragmentSupportLifecycleImpl>.onOptionsItemSelected(this, item)
    }

    override fun onPause() {
        super<Fragment>.onPause()
        super<FragmentSupportLifecycleImpl>.onPause(this)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super<Fragment>.onRequestPermissionsResult(requestCode, permissions, grantResults)
        super<FragmentSupportLifecycleImpl>.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }

    override fun onResume() {
        super<Fragment>.onResume()
        super<FragmentSupportLifecycleImpl>.onResume(this)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super<Fragment>.onSaveInstanceState(outState)
        super<FragmentSupportLifecycleImpl>.onSaveInstanceState(this, outState)
    }

    override fun onStart() {
        super<Fragment>.onStart()
        super<FragmentSupportLifecycleImpl>.onStart(this)
    }

    override fun onStop() {
        super<Fragment>.onStop()
        super<FragmentSupportLifecycleImpl>.onStop(this)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super<Fragment>.onViewCreated(view, savedInstanceState)
        super<FragmentSupportLifecycleImpl>.onViewCreated(this, view, savedInstanceState)
    }

    //endregion override
}