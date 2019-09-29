package com.example.e_care2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class RoadActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<User> users;
    private UserAdapter adapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road);

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


        User user1 = new User("Saiful Islam Sajib",R.drawable.user,"01700000000","SignBoard");
        User user2 = new User("Saiful Islam Sajib",R.drawable.user,"01700000000","SignBoard");
        User user3 = new User("Saiful Islam Sajib",R.drawable.user,"01700000000","SignBoard");
        User user4 = new User("Saiful Islam Sajib",R.drawable.user,"01700000000","SignBoard");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    private void init() {
        back = findViewById(R.id.backIM);
        users = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerVr);
        adapter = new UserAdapter(users);
    }


}
