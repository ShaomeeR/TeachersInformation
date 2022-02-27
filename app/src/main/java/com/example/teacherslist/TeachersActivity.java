package com.example.teacherslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.teacherslist.databinding.ActivityTeachersBinding;

public class TeachersActivity extends AppCompatActivity {

    ActivityTeachersBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTeachersBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_teachers);

        Intent intent = this.getIntent();

        if (intent != null){

            String name = intent.getStringExtra("name");
           String phone = intent.getStringExtra("phone");
          String country = intent.getStringExtra("country");
        //    int imageid = intent.getIntExtra("imageid",R.drawable.a);
            binding.nameProfile.setText(name);

          //binding.phoneProfile.setText(phone);
         //   binding.countryProfile.setText(country);
         //   binding.profileImage.setImageResource(imageid);


        }
    }
}