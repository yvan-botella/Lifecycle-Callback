package com.wanwan.lifecycle_callback.callback

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import com.wanwan.lifecycle_callback.protocol.TAG

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface ActivityLifecycleCallbacks: TAG {
   fun onActivityReenter(activity: Activity, resultCode: Int, data: Intent?) = null
   fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?) = null
   fun onAttachFragment(activity: Activity, fragment: Fragment?) = null
   fun onAttachedToWindow(activity: Activity) = null
   fun onBackPressed(activity: Activity, handled: Boolean?): Boolean = handled ?: false
   fun onCreate(activity: Activity, savedInstanceState: Bundle?) = null
   fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) = null
   fun onCreateView(activity: Activity, backResult: View?, name: String?, context: Context?, attrs: AttributeSet?): View? = null
   fun onCreateView(activity: Activity, backResult: View?, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? = null
   fun onDestroy(activity: Activity) = null
   fun onDetachedFromWindow(activity: Activity) = null
   fun onNewIntent(activity: Activity, intent: Intent?) = null
   fun onOptionsItemSelected(activity: Activity, handled: Boolean?, item: MenuItem?): Boolean = handled ?: false
   fun onPause(activity: Activity) = null
   fun onPostCreate(activity: Activity, savedInstanceState: Bundle?) = null
   fun onPostCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) = null
   fun onPostResume(activity: Activity) = null
   fun onRestart(activity: Activity) = null
   fun onResume(activity: Activity) = null
   fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?) = null
   fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) = null
   fun onStart(activity: Activity) = null
   fun onSaveInstanceState(activity: Activity, outState: Bundle?) = null
   fun onSaveInstanceState(activity: Activity, outState: Bundle?, outPersistentState: PersistableBundle?) = null
   fun onStop(activity: Activity) = null
   fun onTrimMemory(activity: Activity, level: Int) = null
}