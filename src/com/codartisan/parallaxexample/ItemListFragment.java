package com.codartisan.parallaxexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.SimpleAdapter;

public class ItemListFragment extends ListFragment {
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		ArrayList<Map<String, String>> list = buildData();
		String[] from = {"name", "rating"};
		int[] to = {android.R.id.text1, android.R.id.text2};
		setListAdapter(new SimpleAdapter(this.getActivity(), list, android.R.layout.simple_list_item_2, from, to));
	}

	
	private ArrayList<Map<String, String>> buildData() {
		ArrayList<Map<String, String>> list = new ArrayList<Map<String,String>>();
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("Star Trek", "PG"));
		list.add(putData("RoboCop", "R"));
		list.add(putData("Hobbit", "PG"));
		list.add(putData("The World's End", "PG-18"));
		
		return list;
	}
	
	private HashMap<String, String> putData(String name, String rate) {
		HashMap<String, String> item = new HashMap<String, String>();
		item.put("name", name);
		item.put("rating", rate);
		return item;
	}
}
