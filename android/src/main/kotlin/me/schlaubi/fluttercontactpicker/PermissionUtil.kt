package me.schlaubi.fluttercontactpicker

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import io.flutter.plugin.common.PluginRegistry

object PermissionUtil : PluginRegistry.RequestPermissionsResultListener {
    private val listeners = mutableListOf<PluginRegistry.RequestPermissionsResultListener>()

    fun hasPermission(context: Context) = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED

    fun requestPermission(activity: Activity, listener: PluginRegistry.RequestPermissionsResultListener) = ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.READ_CONTACTS), ContactPicker.PERMISSION_REQUEST).also {
        listeners.add(listener)
    }

    fun remove(listener: PluginRegistry.RequestPermissionsResultListener) = listeners.remove(listener)

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray): Boolean =
            listeners.any { it.onRequestPermissionsResult(requestCode, permissions, grantResults) }
}
