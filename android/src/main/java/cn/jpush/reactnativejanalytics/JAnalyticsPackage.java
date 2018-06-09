package cn.jpush.reactnativejanalytics;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JAnalyticsPackage implements ReactPackage {

    public JAnalyticsPackage(boolean toastFlag, boolean logFlag) {
        Logger.SHUTDOWNTOAST = toastFlag;
        Logger.SHUTDOWNLOG = logFlag;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.asList(new NativeModule[]{
                new JAnalyticsModule(reactContext),
        });
    }


    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
