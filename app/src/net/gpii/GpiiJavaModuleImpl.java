package net.gpii;

import android.util.Log;
import org.meshpoint.anode.module.IModule;
import org.meshpoint.anode.module.IModuleContext;

public class GpiiJavaModuleImpl extends GpiiJavaModule implements IModule {
	private static final String TAG = "net.gpii.GpiiJavaModuleImpl";
	
	@Override
	public Object startModule(IModuleContext ctx) {
		Log.v(TAG, "startModule!!");
		return this;
	}

	@Override
	public void stopModule() {
		Log.v(TAG, "stopModule!!");
	}

	@Override
	public void gpiiTest() {
		Log.v(TAG, "GPII TEST TEST TEST!");
	}

}
