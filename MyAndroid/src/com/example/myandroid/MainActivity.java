package com.example.myandroid;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends Activity implements OnClickListener{
    private Button bt1,bt2,bt3;
    private ListView listView;
    private PictureAdapter adapter;
    private List<Post> picturelist=new ArrayList<Post>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);
        bt3=(Button) findViewById(R.id.bt3);
        init();
        listView=(ListView) findViewById(R.id.list_view);
        adapter=new PictureAdapter(MainActivity.this,R.layout.activity_post,picturelist);
        listView.setAdapter(adapter);
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	public void init(){
		for(int i=0;i<20;i++){
			Post picture=new Post(R.drawable.ic_launcher);
			picturelist.add(picture);
		}
	}

}
