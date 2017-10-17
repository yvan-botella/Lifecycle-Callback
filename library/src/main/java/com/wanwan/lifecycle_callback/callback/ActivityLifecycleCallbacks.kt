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
   fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?): Unit? = null
   fun onAttachFragment(activity: Activity, fragment: Fragment?): Unit? = null
   fun onAttachedToWindow(activity: Activity): Unit? = null
   fun onBackPressed(activity: Activity): Unit? = null
   fun onCreate(activity: Activity, savedInstanceState: Bundle?): Unit? = null
   fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?): Unit? = null
   fun onCreateView(activity: Activity, result: View?, name: String?, context: Context?, attrs: AttributeSet?): View? = null
   fun onCreateView(activity: Activity, result: View?, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? = null
   fun onDestroy(activity: Activity): Unit? = null
   fun onDetachedFromWindow(activity: Activity): Unit? = null
   fun onNewIntent(activity: Activity, intent: Intent?): Unit? = null
   fun onOptionsItemSelected(activity: Activity, result: Boolean?, item: MenuItem?): Boolean = false
   fun onPause(activity: Activity): Unit? = null
   fun onPostCreate(activity: Activity, savedInstanceState: Bundle?): Unit? = null
   fun onPostCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?): Unit? = null
   fun onPostResume(activity: Activity): Unit? = null
   fun onRestart(activity: Activity): Unit? = null
   fun onResume(activity: Activity): Unit? = null
   fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?): Unit? = null
   fun onRestoreInstanceState(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?): Unit? = null
   fun onStart(activity: Activity): Unit? = null
   fun onSaveInstanceState(activity: Activity, outState: Bundle?): Unit? = null
   fun onSaveInstanceState(activity: Activity, outState: Bundle?, outPersistentState: PersistableBundle?): Unit? = null
   fun onStop(activity: Activity): Unit? = null
   fun onTrimMemory(activity: Activity, level: Int): Unit? = null
}