package com.example.share;
import android.app.AlertDialog;
import android.content.Intent;
import android.media.Image;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<claimshare> list = new ArrayList<claimshare>();
        listView = (ListView) findViewById(R.id.list_view);
        list.add(new claimshare("09:30", "HELP ME", "#바이오", "#또이오", "#1-2"));
        list.add(new claimshare("20:30", "봉지봉지", "#PET", "#페트", "#1-2"));
        list.add(new claimshare("10:30", "실험복", "#대곽", "#1학년", "#1-2"));
        list.add(new claimshare("16:30", "공학계산기", "#대곽", "#2학년", "#빨리"));
        shareadapter adapter = new shareadapter(this, R.layout.item_claimshare, list);
        listView.setAdapter(adapter);
        FloatingActionButton floatbut=(FloatingActionButton)findViewById(R.id.newshare);
        floatbut.setOnClickListener(
                new FloatingActionButton.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Main.this,writeshare.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
