package com.falconeta.capacitor_facebook_pixel

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT
import com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT_TYPE
import com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CURRENCY
import com.facebook.appevents.AppEventsConstants.EVENT_NAME_PURCHASED
import com.facebook.appevents.AppEventsLogger
import com.getcapacitor.Bridge


class CapacitorFacebookPixel {

  private var webView: WebView
  private var context: Context

  private var logger: AppEventsLogger

  constructor(bridge: Bridge) {
    webView = bridge.webView
    context = bridge.context
    logger = AppEventsLogger.newLogger(context)

//    AppEventsLogger.augmentWebView(webView,context)

    // for enable or disable first time
    FacebookSdk.setAutoInitEnabled(true)
    FacebookSdk.fullyInitialize()

    FacebookSdk.setAutoLogAppEventsEnabled(true)


//    val params = Bundle()
//    params.putString(EVENT_PARAM_CURRENCY, "USD")
//    params.putString(EVENT_PARAM_CONTENT_TYPE, "product")
//    params.putString(
//      EVENT_PARAM_CONTENT,
//      "[{\"id\": \"1234\", \"quantity\": 2}, {\"id\": \"5678\", \"quantity\": 1}]"
//    )

//    logger.logEvent(
//      EVENT_NAME_PURCHASED,
//      54.23,
//      params
//    )
    logger.logEvent("BattleTheMonster");
  }

    fun echo(value: String): String {
        Log.i("Echo", value)
        return value
    }
}
