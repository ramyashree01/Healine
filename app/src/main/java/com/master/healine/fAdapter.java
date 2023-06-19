package com.master.healine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

public class fAdapter extends RecyclerView.Adapter<fAdapter.ViewHolder>{// 1- Data Source
        private FeatureModel[] listData;

        public fAdapter(FeatureModel[] listData) {
            this.listData = listData;
        }



// 2- View HOlder Class
public static class ViewHolder extends RecyclerView.ViewHolder{
    public LottieAnimationView anim;
    public TextView title;
    public TextView subtitle;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.anim = itemView.findViewById(R.id.anim);
        this.title = itemView.findViewById(R.id.title);
        this.subtitle = itemView.findViewById(R.id.subtitle);
    }




}


    // 3- Implementing the methods

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.feature_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final FeatureModel myFeatures = listData[position];
        holder.title.setText(listData[position].getTitle());
        holder.subtitle.setText(listData[position].getSubtitle());
        holder.anim.setAnimation(listData[position].getAnim());

        // Handling CLICK Events
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

}
