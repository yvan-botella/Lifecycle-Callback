package com.wanwan.lifecycle_callback.callback

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.wanwan.lifecycle_callback.protocol.TAG

/**
 * Created by yvan.botella on 12/10/2017.
 */
interface FragmentLifecycleCallbacks: TAG {

   //region added
   fun onBackPressed(fragment: Fragment, result: Boolean?): Boolean = false
   //endregion added

   fun onActivityCreated(fragment: Fragment, savedInstanceState: Bundle?): Unit? = null
   fun onActivityResult(fragment: Fragment, requestCode: Int, resultCode: Int, data: Intent?): Unit? = null
   fun onAttach(fragment: Fragment, context: Context?): Unit? = null
   fun onAttachFragment(fragment: Fragment, attachfragment: Fragment?): Unit? = null
   fun onDestroy(fragment: Fragment): Unit? = null
   fun onConfigurationChanged(fragment: Fragment, newConfig: Configuration?): Unit? = null
   fun onCreate(fragment: Fragment, savedInstanceState: Bundle?): Unit? = null
   fun onCreateView(fragment: Fragment, result: View?, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = null
   fun onDetach(fragment: Fragment): Unit? = null
   fun onDestroyView(fragment: Fragment): Unit? = null
   fun onLowMemory(fragment: Fragment): Unit? = null
   fun onOptionsItemSelected(fragment: Fragment, result: Boolean?, item: MenuItem?): Boolean? = null
   fun onPause(fragment: Fragment): Unit? = null
   fun onRequestPermissionsResult(fragment: Fragment, requestCode: Int, permissions: Array<out String>?, grantResults: IntArray?): Unit? = null
   fun onResume(fragment: Fragment): Unit? = null
   fun onSaveInstanceState(fragment: Fragment, outState: Bundle?): Unit? = null
   fun onStart(fragment: Fragment): Unit? = null
   fun onStop(fragment: Fragment): Unit? = null
   fun onViewCreated(fragment: Fragment, view: View?, savedInstanceState: Bundle?): Unit? = null
}