package com.example.myandroid;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class PictureAdapter extends ArrayAdapter<Post> {
    private int id;
	public PictureAdapter(Context context, int resource,
			List<Post> objects) {
		super(context, resource, objects);
	    id=resource;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    Post picturePost=getItem(position);
	    View view=LayoutInflater.from(getContext()).inflate(id, null);//加载我们传入的子项布局
	    ImageView pictureImageView=(ImageView) view.findViewById(R.id.picture);//加载子项布局的imageview控件
	    pictureImageView.setImageResource(picturePost.getPictureId());//显示控件的内容
		return view;
	}

}
