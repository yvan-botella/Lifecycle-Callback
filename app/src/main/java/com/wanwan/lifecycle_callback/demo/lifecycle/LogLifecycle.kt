package com.wanwan.lifecycle_callback.lifecycle

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecycle_callback.ActivityLifecycleRegister
import com.wanwan.lifecycle_callback.FragmentLifecycleRegister
import com.wanwan.lifecycle_callback.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecycle_callback.callback.FragmentLifecycleCallbacks
import com.wanwan.lifecycle_callback.protocol.ActivityLifecycleImpl
import com.wanwan.lifecycle_callback.protocol.FragmentLifecycleImpl

/**
 * Created by yvan.botella on 12/10/2017.
 */
class LogLifecycle : ActivityLifecycleCallbacks, FragmentLifecycleCallbacks {

    companion object: ActivityLifecycleRegister, FragmentLifecycleRegister {
        override fun register(activity: ActivityLifecycleImpl) {
            activity.registerActivityCallback(LogLifecycle())
        }

        override fun register(fragment: FragmentLifecycleImpl) {
            fragment.registerFragmentCallback(LogLifecycle())
        }
    }

    //region Activity
    override fun onAttachedToWindow(activity: Activity){
        Log.i(TAG(activity), "onAttachedToWindow()")
    }

    override fun onPause(activity: Activity){
        Log.i(TAG(activity), "onPause()")
    }

    override fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?){
        Log.i(TAG(activity), "onActivityResult(requestCode, resultCode, data)")
    }

    override fun onPostResume(activity: Activity){
        Log.i(TAG(activity), "onPostResume()")
    }

    override fun onTrimMemory(activity: Activity, level: Int) {
        Log.i(TAG(activity), "onTrimMemory(level)")
    }

    override fun onAttachFragment(activity: Activity, fragment: Fragment?) {
        Log.i(TAG(activity), "onAttachFragment(fragment)")
    }

    override fun onDestroy(activity: Activity) {
        Log.i(TAG(activity), "onDestroy()")
    }

    override fun onBackPressed(activity: Activity) {
        Log.i(TAG(activity), "onBackPressed()")
    }

    override fun onCreate(activity: Activity, savedInstanceState: Bundle?) {
        Log.i(TAG(activity), "onCreate(savedInstanceState)")
    }

    override fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.i(TAG(activity), "onCreate(savedInstanceState, persistentState)")
    }

    override fun onStart(activity: Activity) {
        Log.i(TAG(activity), "onStart()")
    }

    override fun onResume(activity: Activity) {
        Log.i(TAG(activity), "onResume()")
    }

    override fun onSaveInstanceState(activity: Activity, outState: Bundle?) {
        Log.i(TAG(activity), "onSaveInstanceState(outState)")
    }

    override fun onSaveInstanceState(activity: Activity, outState: Bundle?, outPersistentState: PersistableBundle?) {
        Log.i(TAG(activity), "onSaveInstanceState(outState, outPersistentState)")
    }

    override fun onCreateView(activity: Activity, result: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        Log.i(TAG(activity), "onCreateView(name, context, attrs)")
        return result
    }

    override fun onCreateView(activity: Activity, result: View?, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        Log.i(TAG(activity), "onCreateView(parent, name, context, attrs)")
        return result
    }

    override fun onPostCreate(activity: Activity, savedInstanceState: Bundle?) {
        Log.i(TAG(activity), "onPostCreate(savedInstanceState)")
    }

    override fun onPostCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.i(TAG(activity), "onPostCreate(savedInstanceState, PersistableBundle)")
    }

    override fun onDetachedFromWindow(activity: Activity) {
        Log.i(TAG(activity), "onDetachedFromWindow()")
    }

    override fun onStop(activity: Activity) {
        Log.i(TAG(activity), "onStop()")
    }

    override fun onRestart(activity: Activity) {
        Log.i(TAG(activity), "onRestart()")
    }

    override fun onOptionsItemSelected(activity: Activity, result: Boolean?, item: MenuItem?): Boolean {
        Log.i(TAG(activity), "onOptionsItemSelected(item)")
        return result ?: false
    }

    override fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?) {
        Log.i(TAG(activity), "onRestoreInstanceState(savedInstanceState)")
    }

    override fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.i(TAG(activity), "onRestoreInstanceState(savedInstanceState, persistentState)")
    }
    //endregion Activity


    //region Fragment
    override fun onBackPressed(fragment: Fragment, result: Boolean?): Boolean {
        Log.i(TAG(fragment), "onBackPressed()")
        return result ?: false
    }

    override fun onActivityCreated(fragment: Fragment, savedInstanceState: Bundle?) {
        Log.i(TAG(fragment), "onActivityCreated()")
    }

    override fun onActivityResult(fragment: Fragment, requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i(TAG(fragment), "onActivityResult(requestCode, resultCode, data)")
    }

    override fun onAttach(fragment: Fragment, context: Context?) {
        Log.i(TAG(fragment), "fragment(context)")
    }

    override fun onAttachFragment(fragment: Fragment, attachfragment: Fragment?) {
        Log.i(TAG(fragment), "onAttachFragment(fragment)")
    }

    override fun onDestroy(fragment: Fragment) {
        Log.i(TAG(fragment), "onDestroy()")
    }

    override fun onConfigurationChanged(fragment: Fragment, newConfig: Configuration?) {
        Log.i(TAG(fragment), "onConfigurationChanged(newConfig)")
    }

    override fun onCreate(fragment: Fragment, savedInstanceState: Bundle?) {
        Log.i(TAG(fragment), "onCreate(savedInstanceState)")
    }

    override fun onCreateView(fragment: Fragment, result: View?, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG(fragment), "onCreateView(result, inflater, container, savedInstanceState)")
        return result
    }

    override fun onDetach(fragment: Fragment) {
        Log.i(TAG(fragment), "onDetach()")
    }

    override fun onDestroyView(fragment: Fragment) {
        Log.i(TAG(fragment), "onDestroyView()")
    }

    override fun onLowMemory(fragment: Fragment) {
        Log.i(TAG(fragment), "onLowMemory()")
    }

    override fun onOptionsItemSelected(fragment: Fragment, result: Boolean?, item: MenuItem?): Boolean? {
        Log.i(TAG(fragment), "onOptionsItemSelected(result, item)")
        return result
    }

    override fun onPause(fragment: Fragment) {
        Log.i(TAG(fragment), "onPause()")
    }

    override fun onRequestPermissionsResult(fragment: Fragment, requestCode: Int, permissions: Array<out String>?, grantResults: IntArray?) {
        Log.i(TAG(fragment), "onRequestPermissionsResult(requestCode, permissions, grantResults)")
    }

    override fun onResume(fragment: Fragment) {
        Log.i(TAG(fragment), "onResume()")
    }

    override fun onSaveInstanceState(fragment: Fragment, outState: Bundle?) {
        Log.i(TAG(fragment), "onSaveInstanceState(outState)")
    }

    override fun onStart(fragment: Fragment) {
        Log.i(TAG(fragment), "onStart()")
    }

    override fun onStop(fragment: Fragment) {
        Log.i(TAG(fragment), "onStop()")
    }

    override fun onViewCreated(fragment: Fragment, view: View?, savedInstanceState: Bundle?) {
        Log.i(TAG(fragment), "onViewCreated(fragment, view, savedInstanceState)")
    }
    //endregion Fragment
}