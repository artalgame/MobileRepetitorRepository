package com.artal.mobile_repetitor.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.artal.mobile_repetitor.R;
import com.google.android.gms.appstate.AppStateClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;


public class SplashActivity extends BaseMRActivity {
	private Handler mHandler = new Handler();	
	protected void onCreate(Bundle bundle)
	{
		super.onCreate (bundle);
		setContentView (R.layout.start_layout);
		beginUserInitiatedSignIn();      
	}
	
	@Override
	public void onSignInFailed() {
		super.onSignInFailed();
		StartActivity();
	}

	@Override
	public void onSignInSucceeded() {
		super.onSignInSucceeded();
		StartActivity();
	}
	
	private void StartActivity()
	{
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent (getBaseContext(), MainActivity.class);
			    startActivity(intent);
			}
		},5000);
	}
}
