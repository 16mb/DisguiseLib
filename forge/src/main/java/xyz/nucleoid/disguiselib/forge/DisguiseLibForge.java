package xyz.nucleoid.disguiselib.forge;

import net.minecraftforge.fml.common.Mod;
import xyz.nucleoid.disguiselib.impl.DisguiseLib;

@Mod("disguiselib")
public class DisguiseLibForge {

	public DisguiseLibForge() {
		DisguiseLib.init();
	}
}
