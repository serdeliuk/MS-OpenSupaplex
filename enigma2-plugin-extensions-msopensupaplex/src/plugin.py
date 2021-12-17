# -*- coding: utf-8 -*-
from Plugins.Plugin import PluginDescriptor
from Components.config import config, ConfigSubsection, ConfigDirectory

config.plugins.fuse = ConfigSubsection()
config.plugins.fuse.romlocation = ConfigDirectory(default='/media/')
config.plugins.fuse.romlocation.save()

import main



def openPlugin(session, **kwargs):
	reload(main)
	session.open(main.fuse)

def Plugins(**kwargs):
        return [PluginDescriptor(
                        name="MS-OpenSupaplex",
                        description="Supaplex, Open version",
                        where = PluginDescriptor.WHERE_PLUGINMENU,
                        needsRestart=False,
                        icon="opensupaplex.png",
                        fnc=openPlugin),
		PluginDescriptor(
                        name="MS-OpenSupaplex",
                        description="Supaplex, Open version",
                        where = PluginDescriptor.WHERE_EXTENSIONSMENU,
                        needsRestart=False,
                        icon="opensupaplex.png",
                        fnc=openPlugin)]
