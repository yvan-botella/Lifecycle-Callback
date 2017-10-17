package com.wanwan.lifecyclecallback.kotlin.protocol

import android.app.Fragment

/**
 * Created by botella_y on 13/10/2017.
 */
interface TAG {
    val TAG: String
        get() = this::class.java.simpleName

    fun TAG(`object`: Any): String {
        return `object`.javaClass.simpleName
    }

    companion object {
        fun get(`object`: Any): String {
            return `object`.javaClass.simpleName
        }
    }
}