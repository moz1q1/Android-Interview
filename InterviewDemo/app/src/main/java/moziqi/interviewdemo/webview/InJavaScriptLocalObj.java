package moziqi.interviewdemo.webview;

import android.webkit.JavascriptInterface;

import moziqi.interviewdemo.util.LogUtils;

/**
 * 作者 : moziqi
 * 邮箱 : 709847739@qq.com
 * 时间   : 2019/6/5-12:39
 * desc   :
 * version: 1.0
 */

class InJavaScriptLocalObj {

    @JavascriptInterface
    public void showSource(String html) {
        LogUtils.i("====>showSource=" + html);
    }

    @JavascriptInterface
    public void showDescription(String str) {
        LogUtils.i("====>showDescription=" + str);
    }
}