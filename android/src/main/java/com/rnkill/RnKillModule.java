package com.rnkill;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class RnKillModule extends RnKillSpec {
  public static final String NAME = "RnKill";

  RnKillModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void kill() {
    android.os.Process.killProcess(android.os.Process.myPid());
  }
}
