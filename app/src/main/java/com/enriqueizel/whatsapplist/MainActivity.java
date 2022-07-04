package com.enriqueizel.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.enriqueizel.whatsapplist.Adapter.AdapterUser;
import com.enriqueizel.whatsapplist.Model.User;
import com.enriqueizel.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private RecyclerView recyclerUsers;
  private List<User> userList = new ArrayList<>();

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
    AdapterUser adapterUser = new AdapterUser(userList);
    recyclerUsers.setAdapter(adapterUser);

    generateUsers();

//    evento de click
    recyclerUsers.addOnItemTouchListener(new RecyclerItemClickListener(
            getApplicationContext(),
            recyclerUsers,
            new RecyclerItemClickListener.OnItemClickListener() {
              @Override
              public void onItemClick(View view, int position) {
                User user = userList.get(position);
                String message = "usuário " + user.getName() + " foi clicado";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
              }

              @Override
              public void onLongItemClick(View view, int position) {
                User user = userList.get(position);
                String message = "usuário " + user.getName() + " foi apertado";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
              }

              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              }
            }
    ));
  }

  public void generateUsers() {
    User user1 = new User(R.drawable.usuario1, "John", "Suave??");
    userList.add(user1);

    User user2 = new User(R.drawable.usuario2, "Natan", "Hoje tem futebol");
    userList.add(user2);

    User user3 = new User(R.drawable.usuario1, "John", "Bom dia");
    userList.add(user3);

    User user4 = new User(R.drawable.usuario2, "Jo", "Como assim");
    userList.add(user4);

    User user5 = new User(R.drawable.usuario1, "Willian", "olar");
    userList.add(user5);

    User user6 = new User(R.drawable.usuario2, "Taxa", "Suave??");
    userList.add(user6);

    User user7 = new User(R.drawable.usuario1, "Ferdiand", "Suave??");
    userList.add(user7);

    User user8 = new User(R.drawable.usuario2, "Rwan", "Suave??");
    userList.add(user8);

    User user9 = new User(R.drawable.usuario1, "Antonio", "Suave??");
    userList.add(user9);

    User user10 = new User(R.drawable.usuario2, "Amora", "Suave??");
    userList.add(user10);
  }
}