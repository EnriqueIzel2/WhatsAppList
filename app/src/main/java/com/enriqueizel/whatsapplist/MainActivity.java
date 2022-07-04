package com.enriqueizel.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  private RecyclerView recyclerUsers;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerUsers = findViewById(R.id.recycler_users);

    recyclerUsers.setLayoutManager(new LinearLayoutManager(
            MainActivity.this,
            LinearLayoutManager.VERTICAL,
            false));
    recyclerUsers.setHasFixedSize(true);
  }
}