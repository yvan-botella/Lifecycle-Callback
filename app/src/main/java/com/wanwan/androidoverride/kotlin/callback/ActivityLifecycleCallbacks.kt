package com.wanwan.androidoverride.kotlin.callback

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import com.wanwan.androidoverride.kotlin.protocol.TAG

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface ActivityLifecycleCallbacks: TAG {

   val CLASS: Class<*>

   fun onActivityResult(activity: Activity, requestCode: Int, resultCode: Int, data: Intent?) = null
   fun onAttachFragment(activity: Activity, fragment: Fragment?) = null
   fun onAttachedToWindow(activity: Activity) = null
   fun onBackPressed(activity: Activity) = null
   fun onCreate(activity: Activity, savedInstanceState: Bundle?) = null
   fun onCreate(activity: Activity, savedInstanceState: Bundle?, persistentState: PersistableBundle?) = null
   fun onCreateView(activity: Activity, result: View?, name: String?, context: Context?, attrs: AttributeSet?): View? = null
   fun onCreateView(activity: Activity, result: View?, parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View? = null
   fun onDestroy(activity: Activity) = null
   fun onDetachedFromWindow(activity: Activity) = null
   fun onNewIntent(activity: Activity, intent: Intent?) = null
   fun onOptionsItemSelected(activity: Activity, result: Boolean?, item: MenuItem?): Boolean = false
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