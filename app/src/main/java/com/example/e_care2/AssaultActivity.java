package com.example.e_care2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class AssaultActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<User> users;
    private UserAdapter adapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assault);

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


        User user1 = new User("Prevent torture of women",R.drawable.user,"9342647","Segun bagicha,Dhaka");
        User user2 = new User("Law and arbitration center",R.drawable.user,"8315851","Old paltan,Dhaka");
        User user3 = new User("Bangladesh Women Council",R.drawable.user,"9667985","segun Bagicha,Dhaka");


        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    private void init() {
        back = findViewById(R.id.backIM);
        users = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerVa);
        adapter = new UserAdapter(users);
    }


}
