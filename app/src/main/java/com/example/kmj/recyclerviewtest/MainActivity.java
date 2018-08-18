package com.example.kmj.recyclerviewtest;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    RecyclerViewAdapter mAdapter;

//    Adapter : 아이템에 대한 View 생성
//    ViewHolder : 재활용 View에 대한 모든 서브 View를 관리
//    LayoutManager : 아이템 항목 배치
//    ItemDecoration : 아이템 항목에서 서브뷰에 대한 처리
//    ItemAnimation : 아이템 항목 애니메이션 처리
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Item> items = new ArrayList<>();
        mRecyclerView = findViewById(R.id.recyclerview);


        items.add(new Item("김민준", "17"));
        items.add(new Item("이창현", "17"));
        items.add(new Item("장시연", "17"));
        items.add(new Item("김진원", "18"));
        items.add(new Item("이장훈", "19"));

        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerViewAdapter(items);
        mRecyclerView.setAdapter(mAdapter);

    }
}
