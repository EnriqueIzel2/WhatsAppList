package com.enriqueizel.whatsapplist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.enriqueizel.whatsapplist.Model.User;
import com.enriqueizel.whatsapplist.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserViewHolder> {

  private List<User> userList = new ArrayList<>();

  public AdapterUser(List<User> userList) {
    this.userList = userList;
  }

  @NonNull
  @Override
  public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View listItem;
    LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
    listItem = layoutInflater.inflate(R.layout.user_item, parent, false);
    return new UserViewHolder(listItem);
  }

  @Override
  public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    holder.photo.setImageResource(userList.get(position).getPhoto());
    holder.name.setText(userList.get(position).getName());
    holder.message.setText(userList.get(position).getMessage());
  }

  @Override
  public int getItemCount() {
    return userList.size();
  }

  public class UserViewHolder extends RecyclerView.ViewHolder {

    private ImageView photo;
    private TextView name;
    private TextView message;

    public UserViewHolder(@NonNull View itemView) {
      super(itemView);
      photo = itemView.findViewById(R.id.user_photo);
      name = itemView.findViewById(R.id.user_name);
      message = itemView.findViewById(R.id.user_message);
    }
  }
}
