package com.kotlinswiftbackwardcompatiblemodule

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.Promise

abstract class KotlinSwiftBackwardCompatibleModuleSpec internal constructor(context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {

  abstract fun multiply(a: Double, b: Double, promise: Promise)
  abstract fun initSession(apiKey: String, sessionId: String, token: String, promise: Promise)
}
