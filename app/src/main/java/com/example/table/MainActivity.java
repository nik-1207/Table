package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar sb= findViewById(R.id.seekBar);

        final ListView lv=findViewById(R.id.listview);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                ArrayList<Integer> al =new ArrayList<Integer>();

                int i;

                i = Math.max(progress, 1);

                for(int j=1;j<21;j++)
                {
                   al.add(j*i);
                }

                Log.i("al",al.toString());
                ArrayAdapter<Integer> ad =new ArrayAdapter<Integer>(MainActivity.this,android.R.layout.simple_list_item_1,al);
                lv.setAdapter(ad);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





    }
}