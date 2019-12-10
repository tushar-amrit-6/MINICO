package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Service_Description extends AppCompatActivity {

    private TextView titleView,descriptionView,phoneView,priceView,SellerView;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service__description);
        Intent intent = getIntent();
        String Title=intent.getExtras().getString("Title");
        String Description=intent.getExtras().getString("Description");
        String Phone=intent.getExtras().getString("Phone");
        String Price=intent.getExtras().getString("Price");
        String Seller=intent.getExtras().getString("Seller's Name");
        int image=intent.getExtras().getInt("Thumbnail");

        titleView = (TextView)findViewById(R.id.title_View);
        descriptionView = (TextView)findViewById((R.id.description_View));
        priceView = (TextView) findViewById(R.id.price_View);
       phoneView = (TextView) findViewById(R.id.phone_View);
        img = (ImageView) findViewById(R.id.image_View2);
        SellerView = (TextView)findViewById((R.id.seller));
       titleView.setText(Title);
       descriptionView.setText(Description);
        phoneView.setText(Phone);
        priceView.setText(Price);
        img.setImageResource(image);
        SellerView.setText(Seller);



    }
}
