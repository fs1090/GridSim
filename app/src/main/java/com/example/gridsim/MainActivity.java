package com.example.gridsim;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.ImageAdapter;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // connect to XML layout

        // find gridview from xml
        GridView gridView = findViewById(R.id.gridView);

        // create an adapter with our image, we will connect this to gridView
        ImageAdapter adapter = new ImageAdapter(this, R.drawable.blue);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("GRID_CLICK", Integer.toString(position));

            }
        });
    }
}