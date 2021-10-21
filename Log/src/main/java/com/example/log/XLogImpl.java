package com.example.log;

import android.util.Log;


public class XLogImpl implements ILog{
    static {
        System.loadLibrary("marsxlog");
        //System.loadLibrary("native-lib");
    }

    @Override
    public void print(int level, String tag, String msg) {
        switch (level){
            case LogConstant.VERBOSE:
                Log.v("",LogHelper.formatXLog(level,tag,msg));
                break;
            case LogConstant.DEBUG:
                Log.d("",LogHelper.formatXLog(level,tag,msg));
                break;
            case LogConstant.WARN:
                Log.w("",LogHelper.formatXLog(level,tag,msg));
                break;
            case LogConstant.ERROR:
                Log.e("",LogHelper.formatXLog(level,tag,msg));
                break;
            case LogConstant.ASSERT:
                break;
            default:
                break;
        }
    }

    @Override
    public void setWriteFile(boolean isWrite) {

    }
} 