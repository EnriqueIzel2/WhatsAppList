package com.enriqueizel.whatsapplist.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserViewHolder> {

  @NonNull
  @Override
  public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public class UserViewHolder extends RecyclerView.ViewHolder{

    public UserViewHolder(@NonNull View itemView) {
      super(itemView);
    }
  }
}
