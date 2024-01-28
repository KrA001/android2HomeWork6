package com.example.android2homework6

import android.content.Context

class Preferences (context: Context){
    private val preferencesHelper = context.getSharedPreferences("My pref", Context.MODE_PRIVATE)

    var isHasPermission: Boolean
        get() = preferencesHelper.getBoolean(IS_HAS_PERMISSION_KEY, false)
        set(value){
            preferencesHelper.edit().putBoolean(IS_HAS_PERMISSION_KEY, value).apply()
        }


    companion object{
        private val IS_HAS_PERMISSION_KEY = "permision"
    }
}