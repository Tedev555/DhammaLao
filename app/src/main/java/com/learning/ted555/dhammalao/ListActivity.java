package com.learning.ted555.dhammalao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] myData = { "ອາຊຽນມີຈັກປະເທດ ?", "ອາຊຽນມີຈັກປະເທດ ?", "ອາຊຽນມີຈັກປະເທດ ?", "ອາຊຽນມີຈັກປະເທດ ?", "ອາຊຽນມີຈັກປະເທດ ?",
            "ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?",
            "ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?","ອາຊຽນມີຈັກປະເທດ ?",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        //Set listView Adapter
        final ListView mListView = (ListView)findViewById(R.id.category_listView1) ;
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.custom_textview_lisview,
                myData);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ListActivity.this, DetailActivity.class));
            }
        });


    }
}
