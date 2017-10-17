package com.wanwan.androidoverride.kotlin.callback

import android.support.v4.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.androidoverride.kotlin.protocol.TAG

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentSupportLifecycleCallbacks: TAG {

   //region added
   fun onBackPressed(result: Boolean?): Boolean = false
   //endregion added

   fun onActivityCreated(fragment: Fragment, savedInstanceState: Bundle?) = null
   fun onActivityResult(fragment: Fragment, requestCode: Int, resultCode: Int, data: Intent?) = null
   fun onAttach(fragment: Fragment, context: Context?) = null
   fun onAttachFragment(fragment: Fragment, attachfragment: Fragment?) = null
   fun onDestroy(fragment: Fragment) = null
   fun onConfigurationChanged(fragment: Fragment, newConfig: Configuration?) = null
   fun onCreate(fragment: Fragment, savedInstanceState: Bundle?) = null
   fun onCreateView(fragment: Fragment, result: View?, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = null
   fun onDetach(fragment: Fragment) = null
   fun onDestroyView(fragment: Fragment) = null
   fun onLowMemory(fragment: Fragment) = null
   fun onOptionsItemSelected(fragment: Fragment, result: Boolean?, item: MenuItem?): Boolean? = null
   fun onPause(fragment: Fragment) = null
   fun onRequestPermissionsResult(fragment: Fragment, requestCode: Int, permissions: Array<out String>?, grantResults: IntArray?) = null
   fun onResume(fragment: Fragment) = null
   fun onSaveInstanceState(fragment: Fragment, outState: Bundle?) = null
   fun onStart(fragment: Fragment) = null
   fun onStop(fragment: Fragment) = null
   fun onViewCreated(fragment: Fragment, view: View?, savedInstanceState: Bundle?) = null
}