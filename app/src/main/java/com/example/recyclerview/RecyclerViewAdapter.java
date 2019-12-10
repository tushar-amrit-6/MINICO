package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<service> mData;

    public RecyclerViewAdapter(Context mContext, List<service> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_service_title.setText(mData.get(position).getTitle());
        holder.img_service_image.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,Service_Description.class);
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Seller's Name",mData.get(position).getSellerName());
                intent.putExtra("Category",mData.get(position).getCategory());
                intent.putExtra("Price",mData.get(position).getPrice());
                intent.putExtra("Phone",mData.get(position).getPhone());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                mContext.startActivity(intent);


            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_service_title;
        ImageView img_service_image;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_service_title = (TextView) itemView.findViewById(R.id.service_title);
            img_service_image = (ImageView) itemView.findViewById(R.id.service_image);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }

}
