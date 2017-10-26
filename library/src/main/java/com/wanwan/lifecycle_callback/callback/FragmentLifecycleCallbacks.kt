package com.wanwan.lifecycle_callback.callback

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
   fun onBackPressed(fragment: Any, handled: Boolean?): Boolean = handled ?: false
   //endregion added

   fun onActivityCreated(fragment: Any, savedInstanceState: Bundle?) = null
   fun onActivityResult(fragment: Any, requestCode: Int, resultCode: Int, data: Intent?) = null
   fun onAttach(fragment: Any, context: Context?) = null
   fun onAttachFragment(fragment: Any, attachfragment: Any?) = null
   fun onDestroy(fragment: Any) = null
   fun onConfigurationChanged(fragment: Any, newConfig: Configuration?) = null
   fun onCreate(fragment: Any, savedInstanceState: Bundle?) = null
   fun onCreateView(fragment: Any, backResult: View?, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = null
   fun onDetach(fragment: Any) = null
   fun onDestroyView(fragment: Any) = null
   fun onLowMemory(fragment: Any) = null
   fun onOptionsItemSelected(fragment: Any, handled: Boolean?, item: MenuItem?): Boolean? = handled ?: false
   fun onPause(fragment: Any) = null
   fun onRequestPermissionsResult(fragment: Any, requestCode: Int, permissions: Array<out String>?, grantResults: IntArray?) = null
   fun onResume(fragment: Any) = null
   fun onSaveInstanceState(fragment: Any, outState: Bundle?) = null
   fun onStart(fragment: Any) = null
   fun onStop(fragment: Any) = null
   fun onViewCreated(fragment: Any, view: View?, savedInstanceState: Bundle?) = null
}