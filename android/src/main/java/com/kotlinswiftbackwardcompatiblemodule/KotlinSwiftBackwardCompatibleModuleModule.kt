package com.kotlinswiftbackwardcompatiblemodule

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

import com.opentok.android.Session;

// Add Session.setSessionListener interface here?:
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
    val session = Session.Builder(reactApplicationContext, apiKey, sessionId).build()
    session.connect(token)
    // session.setSessionListener(this);
    promise.resolve("foo")
  }

  /*
  @ReactMethod
  override fun onConnected(session: Session) {
    // session.sendSignal("test", "test", null)
  }
  */

  companion object {
    const val NAME = "KotlinSwiftBackwardCompatibleModule"
  }
}
