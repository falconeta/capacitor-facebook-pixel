package com.falconeta.capacitor_facebook_pixel

import com.getcapacitor.*
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "CapacitorFacebookPixel")
class CapacitorFacebookPixelPlugin : Plugin() {
  private lateinit var  implementation: CapacitorFacebookPixel
  override fun load() {
    super.load()
     implementation = CapacitorFacebookPixel(bridge)
  }

    @PluginMethod
    fun echo(call: PluginCall) {
        val value: String? = call.getString("value")
        val ret = JSObject()
        ret.put("value", value?.let { implementation.echo(it) })
        call.resolve(ret)
    }
}
