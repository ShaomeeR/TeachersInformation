package com.example.teacherslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.teacherslist.databinding.ActivityTeachersBinding;
import com.example.teacherslist.databinding.ActivityTeachersListBinding;

import java.util.ArrayList;


public class TeachersListActivity extends AppCompatActivity {

    ActivityTeachersListBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTeachersListBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_teachers_list);
         //setContentView(binding.getRoot());

        String[] name = {"Abhsihek ", "Shaomee", "Rakib", "Sabbir"};
        ArrayList<Teacher> userArrayList = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {

            Teacher teacher = new Teacher(name[i]);
            userArrayList.add(teacher);

        }
        ListAdapter listAdapter = new ListAdapter(TeachersListActivity.this,userArrayList);


        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(TeachersListActivity.this,TeachersActivity.class);
                i.putExtra("name",name[position]);
                //  i.putExtra("phone",phoneNo[position]);
                //  i.putExtra("country",country[position]);
                //  i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });

    }
}