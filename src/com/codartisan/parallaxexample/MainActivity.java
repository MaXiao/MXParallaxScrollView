package com.codartisan.parallaxexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;

import com.codartisan.parallaxscrollexample.R;

import couk.jenxsol.parallaxscrollview.views.ParallaxScrollView;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		ParallaxScrollView para = (ParallaxScrollView)findViewById(R.id.para_holder);
		ItemListFragment frag = (ItemListFragment) getSupportFragmentManager().findFragmentById(R.id.item_list_fragment);
		para.setListViewContainerHeight(frag.getListView(), (ViewGroup) findViewById(R.id.list_container));
		para.setAppActionbar(findViewById(R.id.scrollview_actionbar));
		para.setAppActionbarFinalColor(Color.argb(255, 11, 187, 212));
		para.setScrollDiffSpeed((float) 0.3);
	}
	
	
}
