package net.lurepheonix.bucefalicons;

import android.content.res.XModuleResources;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;

public class main implements IXposedHookZygoteInit, IXposedHookInitPackageResources {
    private static String MODULE_PATH = null;

    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
    }

    @Override
    public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
        if (!resparam.packageName.equals("com.android.settings"))
            return;

        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_launcher", modRes.fwd(R.drawable.ic_launcher));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_about", modRes.fwd(R.drawable.ic_settings_about));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_accessibility", modRes.fwd(R.drawable.ic_settings_accessibility));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_applications", modRes.fwd(R.drawable.ic_settings_applications));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_backup", modRes.fwd(R.drawable.ic_settings_backup));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_battery", modRes.fwd(R.drawable.ic_settings_battery));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_bluetooth2", modRes.fwd(R.drawable.ic_settings_bluetooth2));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_data_usage", modRes.fwd(R.drawable.ic_settings_data_usage));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_date_time", modRes.fwd(R.drawable.ic_settings_date_time)); 
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_development", modRes.fwd(R.drawable.ic_settings_development));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_display", modRes.fwd(R.drawable.ic_settings_display));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_home", modRes.fwd(R.drawable.ic_settings_home));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_language", modRes.fwd(R.drawable.ic_settings_language));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_location", modRes.fwd(R.drawable.ic_settings_location));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_multiuser", modRes.fwd(R.drawable.ic_settings_multiuser));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_security", modRes.fwd(R.drawable.ic_settings_security));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_sound", modRes.fwd(R.drawable.ic_settings_sound));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_storage", modRes.fwd(R.drawable.ic_settings_storage));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_wireless", modRes.fwd(R.drawable.ic_settings_wireless));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_hdmi", modRes.fwd(R.drawable.ic_settings_hdmi));
        resparam.res.setReplacement("com.android.settings", "drawable", "ic_settings_screen_scale", modRes.fwd(R.drawable.ic_settings_screen_scale)); 
    }
}