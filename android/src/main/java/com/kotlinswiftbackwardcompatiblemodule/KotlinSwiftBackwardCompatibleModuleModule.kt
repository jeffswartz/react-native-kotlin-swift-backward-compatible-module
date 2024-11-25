package com.kotlinswiftbackwardcompatiblemodule

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

// import com.opentok.android.Session;

class KotlinSwiftBackwardCompatibleModuleModule internal constructor(context: ReactApplicationContext) :
  KotlinSwiftBackwardCompatibleModuleSpec(context) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  override fun multiply(a: Double, b: Double, promise: Promise) {
    promise.resolve(a * b)
  }

  @ReactMethod
  override fun initSession(apiKey: String, sessionId: String, token: String, promise: Promise) {
    // session = Session.Builder(reactApplicationContext, apiKey, sessionId)
    // session.connect(token)
    promise.resolve("foo")
  }

  companion object {
    const val NAME = "KotlinSwiftBackwardCompatibleModule"
  }
}
