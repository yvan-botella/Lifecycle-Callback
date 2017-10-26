package com.wanwan.lifecycle_callback

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import com.wanwan.lifecycle_callback.callback.ActivityLifecycleCallbacks
import com.wanwan.lifecycle_callback.protocol.ActivityLifecycleImpl
import java.util.*

/**
 * Created by yvan.botella on 12/10/2017.
 */
abstract class LifecycleAppCompatActivity : AppCompatActivity(), ActivityLifecycleImpl {

    override var callbacks = Stack<ActivityLifecycleCallbacks>()

    init {
        registerLifecycleCallback()
    }

    //region override

    override fun onActivityReenter(resultCode: Int, data: Intent?) {
        super<AppCompatActivity>.onActivityReenter(resultCode, data)
        super<ActivityLifecycleImpl>.onActivityReenter(this, resultCode, data)
    }

    override fun onAttachedToWindow() {
        super<AppCompatActivity>.onAttachedToWindow()
        super<ActivityLifecycleImpl>.onAttachedToWindow(this)
    }

    override fun onPause() {
        super<AppCompatActivity>.onPause()
        super<ActivityLifecycleImpl>.onPause(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super<AppCompatActivity>.onActivityResult(requestCode, resultCode, data)
        super<ActivityLifecycleImpl>.onActivityResult(this, requestCode, resultCode, data)
    }

    override fun onPostResume() {
        super<AppCompatActivity>.onPostResume()
        super<ActivityLifecycleImpl>.onPostResume(this)
    }

    override fun onTrimMemory(level: Int) {
        super<AppCompatActivity>.onTrimMemory(level)
        super<ActivityLifecycleImpl>.onTrimMemory(this, level)
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super<AppCompatActivity>.onAttachFragment(fragment)
        super<ActivityLifecycleImpl>.onAttachFragment(this, fragment)
    }

    override fun onDestroy() {
        super<AppCompatActivity>.onDestroy()
        super<ActivityLifecycleImpl>.onDestroy(this)
    }

    override fun onBackPressed() {
        val handled = super<ActivityLifecycleImpl>.onBackPressed(this)
        if (!handled) {
            super<AppCompatActivity>.onBackPressed()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        super<ActivityLifecycleImpl>.onCreate(this, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState, persistentState)
        super<ActivityLifecycleImpl>.onCreate(this, savedInstanceState, persistentState)
    }

    override fun onStart() {
        super<AppCompatActivity>.onStart()
        super<ActivityLifecycleImpl>.onStart(this)
    }

    override fun onResume() {
        super<AppCompatActivity>.onResume()
        super<ActivityLifecycleImpl>.onResume(this)
    }

    override fun onNewIntent(intent: Intent?) {
        super<AppCompatActivity>.onNewIntent(intent)
        super<ActivityLifecycleImpl>.onNewIntent(this, intent)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super<AppCompatActivity>.onSaveInstanceState(outState)
        super<ActivityLifecycleImpl>.onSaveInstanceState(this, outState)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super<AppCompatActivity>.onSaveInstanceState(outState, outPersistentState)
        super<ActivityLifecycleImpl>.onSaveInstanceState(this, outState, outPersistentState)
    }

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        super<AppCompatActivity>.onCreateView(name, context, attrs)
        return super<ActivityLifecycleImpl>.onCreateView(this, name, context, attrs)
    }

    override fun onCreateView(parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? {
        super<AppCompatActivity>.onCreateView(parent, name, context, attrs)
        return super<ActivityLifecycleImpl>.onCreateView(this, parent, name, context, attrs)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onPostCreate(savedInstanceState)
        super<ActivityLifecycleImpl>.onPostCreate(this, savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super<AppCompatActivity>.onPostCreate(savedInstanceState, persistentState)
        super<ActivityLifecycleImpl>.onPostCreate(this, savedInstanceState, persistentState)
    }

    override fun onDetachedFromWindow() {
        super<AppCompatActivity>.onDetachedFromWindow()
        super<ActivityLifecycleImpl>.onDetachedFromWindow(this)
    }

    override fun onStop() {
        super<AppCompatActivity>.onStop()
        super<ActivityLifecycleImpl>.onStop(this)
    }

    override fun onRestart() {
        super<AppCompatActivity>.onRestart()
        super<ActivityLifecycleImpl>.onRestart(this)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val handled = super<ActivityLifecycleImpl>.onOptionsItemSelected(this, item)
        if (!handled) {
            return super<AppCompatActivity>.onOptionsItemSelected(item)
        }
        return handled
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onRestoreInstanceState(savedInstanceState)
        return super<ActivityLifecycleImpl>.onRestoreInstanceState(this, savedInstanceState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super<AppCompatActivity>.onRestoreInstanceState(savedInstanceState, persistentState)
        return super<ActivityLifecycleImpl>.onRestoreInstanceState(this, savedInstanceState, persistentState)
    }

    //endregion override
}