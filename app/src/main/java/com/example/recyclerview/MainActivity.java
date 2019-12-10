package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<service> service1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//ArrayList That contains the list of services avaiable to be sold....this has to be filled by database
        service1 = new ArrayList<>();
//adding services statically...this has to be done from database
        service1.add(new service("Bike for Rent","Categories","Apne Baap ka Samazh ke mat chalana aur dekh liyo petrol jayada nahi hai","Tushar Amrit","₹1000","6205213366", R.drawable.thevigitarian));
        service1.add(new service("Book for Sale","Categories","Description","Tushar Amrit","₹1000","620521", R.drawable.privacy));
        service1.add(new service("Kettle for Rent","Categories","Description","Tushar Amrit","₹1000","620521", R.drawable.hediedwith));
        service1.add(new service("Cycle for Sale","Categories","Description","Tushar Amrit","₹1000","620521", R.drawable.mariasemples));
        service1.add(new service("Cycle for Rent","Categories","Description","Tushar Amrit","₹1000","623366", R.drawable.themartian));
        service1.add(new service("Laptop for Sale","Categories","Description","Tushar Amrit","₹1000","6013366", R.drawable.thewildrobot));
        service1.add(new service("Printer for Rent","Categories","Description","Tushar Amrit","₹1000","613366", R.drawable.mariasemples));
        service1.add(new service("Books for sale","Categories","Description","Tushar Amrit","₹1000","62013366", R.drawable.mariasemples));
        service1.add(new service("Free Ganja","Categories","Description","Tushar Amrit","₹1000","6205366", R.drawable.thewildrobot));
        service1.add(new service("Abbe Saale","Categories","Description","Tushar Amrit","₹1000","62053366", R.drawable.privacy));
        service1.add(new service("Maaf Karna Gusse mai","Categories","Description","Tushar Amrit","₹1000","62213366", R.drawable.thevigitarian));
        service1.add(new service("Thoda Idar Udar","Categories","Description","Tushar Amrit","₹1000","62053366", R.drawable.hediedwith));
        service1.add(new service("Nikal Jata Hu","Categories","Description","Tushar Amrit","₹1000","6203366", R.drawable.thevigitarian));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,service1);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);




    }
}
