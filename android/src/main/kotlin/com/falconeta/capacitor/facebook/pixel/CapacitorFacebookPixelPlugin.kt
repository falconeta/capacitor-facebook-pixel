package com.falconeta.capacitor.facebook.pixel

import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "CapacitorFacebookPixel")
class CapacitorFacebookPixelPlugin : Plugin() {
    private val implementation: CapacitorFacebookPixel = CapacitorFacebookPixel()
    @PluginMethod
    fun echo(call: PluginCall) {
        val value: String = call.getString("value")
        val ret = JSObject()
        ret.put("value", implementation.echo(value))
        call.resolve(ret)
    }
}