package com.epicgames.ue4;

import com.feliXartstudios.VRTourism.OBBDownloaderService;
import com.feliXartstudios.VRTourism.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

