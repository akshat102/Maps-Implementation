package com.mapmyindia.sdk.demo

import android.app.Application
import com.mapbox.mapboxsdk.MapmyIndia
import com.mmi.services.account.MapmyIndiaAccountManager

class MainActivity : Application() {
    override fun onCreate() {
        super.onCreate()
        MapmyIndiaAccountManager.getInstance().restAPIKey = restAPIKey
        MapmyIndiaAccountManager.getInstance().mapSDKKey = mapSDKKey
        MapmyIndiaAccountManager.getInstance().atlasClientId = atlasClientId
        MapmyIndiaAccountManager.getInstance().atlasClientSecret = atlasClientSecret
        MapmyIndiaAccountManager.getInstance().atlasGrantType = atlasGrantType
        MapmyIndia.getInstance(this)
    }

    val atlasClientId: String
        get() = "33OkryzDZsINOMPA2InSyuhuzCxDBzvrTvAMnEj8NImKq-zIgeigLPqiGLjt3tqNXTLM9pHVdTxtGcKUD3n8xdaNFYjJRuc65ZVHo8tRTk1acq_tP9b6sQ=="
    val atlasClientSecret: String
        get() = "lrFxI-iSEg9vw6h9RzPNeXJnHpyI95vMYT-ynvpAbESp9OO2vr3ZhkffEyPyZHsxe2njvCgyIT1bIat4C1YaokfFVtZVcD64CB0PTf30h3R2D-CPLXycF_Pml25--t3N"
    val atlasGrantType: String
        get() = "client_credentials"
    val mapSDKKey: String
        get() = "nbgaat8xq75c7quesxlnbh68l9cgffz2"
    val restAPIKey: String
        get() = "zi8xmm1mcxz89nmjvqr7iek7lr4rvt47"
}