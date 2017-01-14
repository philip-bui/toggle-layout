package com.nextgeneration.expandingtextlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.nextgeneration.ToggleLayout;

public class SampleActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample_activity);
		final ToggleLayout expandingTextLayout = (ToggleLayout) findViewById(R.id.expanding);
		findViewById(R.id.expand).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				expandingTextLayout.toggle();
			}
		});
	}
}
