package com.example.e_care2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GeneralActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<User> users;
    private UserAdapter adapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

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


        User user1 = new User("Bangladesh health care call center",R.drawable.user,"16263","Bangladesh");
        User user2 = new User("Bangladesh Railway call center",R.drawable.user,"131","Bangladesh");
        User user3 = new User("BTCL call center",R.drawable.user,"16420","Bangladesh");
        User user4 = new User("National ID Information call center",R.drawable.user,"105","Bangladesh");
        User user5 = new User("Bangladesh Emergency call center",R.drawable.user,"999","Bangladesh");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    private void init() {
        back = findViewById(R.id.backIM);
        users = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerV);
        adapter = new UserAdapter(users);
    }


}
