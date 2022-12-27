package com.bumptech.glide;

import android.util.Log;

public class Logger {

  public static final String TAG = "GlideLogger";

  public static final String CLASS_NAME_ENGINE = "Engine";
  public static final String CLASS_NAME_SINGLE_REQUEST = "SingleRequest";
  public static final String CLASS_NAME_DECODE_JOB = "DecodeJob";


  public static void i(String className, String functionName, String message){
    Log.i(TAG, "[" + className + "] [" + functionName + "] " + message);
  }
}