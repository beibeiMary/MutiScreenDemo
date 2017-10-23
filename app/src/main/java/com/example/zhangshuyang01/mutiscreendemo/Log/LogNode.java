package com.example.zhangshuyang01.mutiscreendemo.Log;

/**
 * Created by zhangshuyang01 on 2017/10/20 0020.
 */

public interface LogNode {
    /**
     * Instructs first LogNode in the list to print the log data provided.
     *
     * @param priority Log level of the data being logged.  Verbose, Error, etc.
     * @param tag      Tag for for the log data.  Can be used to organize log statements.
     * @param msg      The actual message to be logged. The actual message to be logged.
     * @param tr       If an exception was thrown, this can be sent along for the logging
     *                 facilities
     *                 to extract and print useful information.
     */
    public void println(int priority, String tag, String msg, Throwable tr);
}
