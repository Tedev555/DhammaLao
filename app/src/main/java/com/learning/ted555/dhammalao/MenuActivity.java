package com.learning.ted555.dhammalao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //Create demo resource
    String[] days = {"ອາຊຽນ","ພູມສາດ","ພາສາລາວ","ສຳນວນພາສາ","ວັດທະນະທຳ","ວິທະຍາສາດ","ສຳນວນພາສາ","ຄຳ​ທວາຍ"};
    int[] images = {
            R.drawable.menu_image,
            R.drawable.menu_image,
            R.drawable.menu_image,
            R.drawable.menu_image,
            R.drawable.menu_image,
            R.drawable.menu_image,
            R.drawable.menu_image,
            R.drawable.menu_image,
    };

    GridCustomAdapter mGridCustomAdapter;
    GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mGridCustomAdapter = new GridCustomAdapter(getApplicationContext(), days, images);
        mGridView = (GridView)findViewById(R.id.my_grid_view);
        mGridView.setAdapter(mGridCustomAdapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MenuActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MenuActivity.this, ListActivity.class));

            }
        });
    }
}
