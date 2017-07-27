package com.example.a10102.chivalry.patrol;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.a10102.chivalry.R;
import com.example.a10102.chivalry.main.ListViewAdapter;

/**
 * Created by 10102김동규 on 2017-07-27.
 */

public class PatrolActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.patrol_list_view);

            // ListView
            final ListView listview;
            final PatrolListViewAdapter adapter;

            // Adapter 생성
            adapter = new PatrolListViewAdapter();

            // ListView 참조 및 Adapter 달기
            listview = (ListView) findViewById(R.id.patrol_listView);

            // 첫 번째 아이템 추가
            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.check),ContextCompat.getDrawable(this, R.drawable.attantion_green), "301호", "김가나, 나다라, 도마바");

            // 두 번째 아이템 추가
            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.check),ContextCompat.getDrawable(this, R.drawable.attantion_red), "302호", "류사아, 마자차, 박카타");

            // 세 번째 아이템 추가
            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.check),ContextCompat.getDrawable(this, R.drawable.attantion_green), "303호", "송파하, 임거너, 정더러");

            listview.setAdapter(adapter);
    }
}
