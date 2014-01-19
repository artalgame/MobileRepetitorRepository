package com.artal.mobile_repetitor;

import com.google.example.games.basegameutils.BaseGameActivity;

import android.app.Application;
import android.content.res.AssetManager;

	public class MRApplication extends Application
	{
		private static MRApplication singleton;
		
		public static MRApplication getInstance(){
			return singleton;
		}

		public AssetManager getAssetManager()
		{
			return singleton.getAssets();
		}

		public void onCreate(){
			super.onCreate ();
			singleton = this;
		}
		private MRApplication(){
			super();
		}
}