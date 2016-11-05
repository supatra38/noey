package com.example.petch.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class NewsListActivity extends AppCompatActivity {

    private ListView lvMenu;

    static String[] NewsName = {
            "Topic News",
            "Topic News",
            "Topic News",
            "Topic News",
            "Topic News",
            "Topic News"};
    static String[] DateName = {
            "31 ตุลาคม 2559",
            "31 ตุลาคม 2559",
            "31 ตุลาคม 2559",
            "31 ตุลาคม 2559",
            "31 ตุลาคม 2559",
            "31 ตุลาคม 2559"};
    int[] resId = {
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and,
            R.drawable.and};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);
        
        lvMenu = (ListView) findViewById(R.id.lvMenu);
        lvMenu.setAdapter(new CustomAdapter(getApplicationContext(), NewsName,DateName, resId));
    }
}


