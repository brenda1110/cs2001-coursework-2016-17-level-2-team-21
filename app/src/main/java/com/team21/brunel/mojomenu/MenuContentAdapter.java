package com.team21.brunel.mojomenu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ashwin Khatwa on 01/02/2017.
 */

public class MenuContentAdapter extends RecyclerView.Adapter<MenuContentAdapter.contentViewHolder> {
    private final List<MenuContent> contentList;

    public MenuContentAdapter(List<MenuContent> contentList) {
        this.contentList = contentList;
    }

    @Override
    public contentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_1, viewGroup, false);
        return new contentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(contentViewHolder holder, int i) {
        MenuContent mc = contentList.get(i);
        holder.vScreenName.setText(mc.screenName);
        holder.vScreenDesc.setText(mc.screenDesc);
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    static class contentViewHolder extends RecyclerView.ViewHolder {
        final TextView vScreenName;
        final TextView vScreenDesc;

        contentViewHolder(View v) {
            super(v);
            vScreenName = (TextView) v.findViewById(R.id.card_name);
            vScreenDesc = (TextView) v.findViewById(R.id.card_desc);
        }
    }
}
