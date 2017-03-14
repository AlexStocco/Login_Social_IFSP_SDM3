package br.edu.ifspsaocarlos.sdm.autorizacaosdm3;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by caioc on 17/02/2017.
 */

public class AutorizacaoSDM3App extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
