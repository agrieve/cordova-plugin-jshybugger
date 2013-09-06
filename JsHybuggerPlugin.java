package org.jshybugger;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

public class JsHybuggerPlugin extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova,  webView);
        DebugServiceClient.attachWebView(webView, cordova.getActivity());
    }
}
