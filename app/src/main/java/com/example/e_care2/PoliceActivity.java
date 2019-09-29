package com.example.e_care2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PoliceActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<User> users;
    private UserAdapter adapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        init();

        initRcyclerView();

        getDataFromRecyclerView();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void initRcyclerView() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void getDataFromRecyclerView() {


        User user1 = new User("Ramna police station",R.drawable.user,"01713373125","Dhaka");
        User user2 = new User("Dhanmondi police station",R.drawable.user,"01713373126","Dhaka");
        User user3 = new User("Shampur police station",R.drawable.user,"01713373145","Dhaka");
        User user4 = new User("Motijheel police station",R.drawable.user,"01713373152","Dhaka");
        User user5 = new User("Paltan police station",R.drawable.user,"01713373155","Dhaka");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    private void init() {
        back = findViewById(R.id.backIM);
        users = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerVp);
        adapter = new UserAdapter(users);
    }


}

