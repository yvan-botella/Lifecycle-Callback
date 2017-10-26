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

   fun onActivityCreated(fragment: Any, savedInstanceState: Bundle?): Unit? = null
   fun onActivityResult(fragment: Any, requestCode: Int, resultCode: Int, data: Intent?): Unit? = null
   fun onAttach(fragment: Any, context: Context?): Unit? = null
   fun onAttachFragment(fragment: Any, attachfragment: Any?): Unit? = null
   fun onDestroy(fragment: Any): Unit? = null
   fun onConfigurationChanged(fragment: Any, newConfig: Configuration?): Unit? = null
   fun onCreate(fragment: Any, savedInstanceState: Bundle?): Unit? = null
   fun onCreateView(fragment: Any, backResult: View?, inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = null
   fun onDetach(fragment: Any): Unit? = null
   fun onDestroyView(fragment: Any): Unit? = null
   fun onLowMemory(fragment: Any): Unit? = null
   fun onOptionsItemSelected(fragment: Any, handled: Boolean?, item: MenuItem?): Boolean? = handled ?: false
   fun onPause(fragment: Any): Unit? = null
   fun onRequestPermissionsResult(fragment: Any, requestCode: Int, permissions: Array<out String>?, grantResults: IntArray?): Unit? = null
   fun onResume(fragment: Any): Unit? = null
   fun onSaveInstanceState(fragment: Any, outState: Bundle?): Unit? = null
   fun onStart(fragment: Any): Unit? = null
   fun onStop(fragment: Any): Unit? = null
   fun onViewCreated(fragment: Any, view: View?, savedInstanceState: Bundle?): Unit? = null
}