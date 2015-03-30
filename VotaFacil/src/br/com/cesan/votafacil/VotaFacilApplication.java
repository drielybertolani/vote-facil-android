package br.com.cesan.votafacil;

import com.parse.Parse;
import com.parse.ParseACL;

import android.app.Application;

public class VotaFacilApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		
		Parse.initialize(this, "AMWPVkiXCTh491UdP5PU5qP4qbRkuFnr3wQYwkq2", "wpz9034zJoF6avWKTvRk6jSqTN2PHoZC3LIrF8Rt");
		
		ParseACL defaultACL = new ParseACL();
		defaultACL.setPublicReadAccess(true);
		ParseACL.setDefaultACL(defaultACL, true);
	}
}
