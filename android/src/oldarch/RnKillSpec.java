package com.rnkill;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Promise;

abstract class RnKillSpec extends ReactContextBaseJavaModule {
  RnKillSpec(ReactApplicationContext context) {
    super(context);
  }

  public abstract void kill();
}
