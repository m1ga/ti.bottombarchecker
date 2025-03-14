/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Titanium SDK
 * Copyright TiDev, Inc. 04/07/2022-Present
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.bottombarchecker;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.util.TiConvert;


@Kroll.module(name="TiBottombarchecker", id="ti.bottombarchecker")
public class TiBottombarcheckerModule extends KrollModule
{

	// Standard Debugging variables
    @Kroll.method
    public int isEdgeToEdgeEnabled() {
        Context context = TiApplication.getInstance().getApplicationContext();
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");

        if (resourceId > 0) {
            return resources.getInteger(resourceId);
        }
        return 0; // Default to 0 if the resource is not found
    }
    @Kroll.method
    public void updateNavigationBarColor(String colorHex) {
        Activity activity = TiApplication.getInstance().getCurrentActivity();
        if (activity != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            window.setNavigationBarColor(TiConvert.toColor(colorHex));
        }
        else
        {
            Log.e("TiBottombarchecker", "Unsupported OS or activity is null.");
        }
    }

}

