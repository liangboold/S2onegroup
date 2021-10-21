package com.example.log;

import android.app.Application;


public interface ILog  {

    /**
     * 日志打印接口
     * @param level
     * @param tag
     * @param msg
     */
    void print(int level,String tag, String msg);

    /**
     * 设置是否写入文件
     * @param isWrite
     */
    void setWriteFile(boolean isWrite);

}