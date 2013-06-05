package net.gpii;

import org.meshpoint.anode.bridge.Env;
import org.meshpoint.anode.java.Base;

public abstract class GpiiJavaModule extends Base {
	private static short classId = Env.getInterfaceId(GpiiJavaModule.class);
	public GpiiJavaModule() { super(classId); }
	
	public abstract void gpiiTest();
}
