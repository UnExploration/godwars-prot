package com.godwarsprot;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PluginLaucher
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GodWarsProtPlugin.class);
		RuneLite.main(args);
	}
}