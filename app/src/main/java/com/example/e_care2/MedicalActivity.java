package com.example.e_care2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MedicalActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<User> users;
    private UserAdapter adapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

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


        User user1 = new User("Kawsar Ahmed(Pharmacist)",R.drawable.user,"01648042545","sanarpar,Narayanganj");
        User user2 = new User("Ripon hossain\n(Pharmacist)",R.drawable.user,"01993831078","sanarpar,Narayanganj");
        User user3 = new User("Shahriar \nAhmed\n(Pharmacist)",R.drawable.user,"01915653099","Mizmizi,Narayanganj");
        User user4 = new User("Nazmul \nhossain\n(Pharmacist)",R.drawable.user,"01924922214","kandapara,Narayanganj");
        User user5 = new User("Mahmood\n(Pharmacist)",R.drawable.user,"01688454145","Sanir Akhra,Dhaka");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    private void init() {
        back = findViewById(R.id.backIM);
        users = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerVm);
        adapter = new UserAdapter(users);
    }


}
