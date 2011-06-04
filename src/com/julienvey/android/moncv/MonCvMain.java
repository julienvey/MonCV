package com.julienvey.android.moncv;

import android.os.Bundle;
import android.widget.TabHost;

public class MonCvMain extends GenericActivity {

	private TabHost monTabHost;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		monTabHost = (TabHost) findViewById(R.id.TabHost);
		monTabHost.setup();

		monTabHost.addTab(monTabHost
				.newTabSpec("onglet_1")
				.setIndicator("Compétences",
						getResources().getDrawable(R.drawable.tools30))
				.setContent(R.id.Onglet1));

		monTabHost.addTab(monTabHost
				.newTabSpec("onglet_2")
				.setIndicator("Formation",
						getResources().getDrawable(R.drawable.graduation30))
				.setContent(R.id.Onglet2));

		monTabHost.addTab(monTabHost
				.newTabSpec("onglet_3")
				.setIndicator("Expériences",
						getResources().getDrawable(R.drawable.skills30))
				.setContent(R.id.Onglet3));
	}

}