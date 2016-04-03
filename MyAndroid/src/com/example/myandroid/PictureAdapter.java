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
	    View view=LayoutInflater.from(getContext()).inflate(id, null);//�������Ǵ���������
	    ImageView pictureImageView=(ImageView) view.findViewById(R.id.picture);//��������ֵ�imageview�ؼ�
	    pictureImageView.setImageResource(picturePost.getPictureId());//��ʾ�ؼ�������
		return view;
	}

}
