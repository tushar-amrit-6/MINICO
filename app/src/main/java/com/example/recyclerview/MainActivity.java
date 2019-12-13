package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<service> service1;
    private BottomNavigationView mMainNav;
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
        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation3);
        mMainNav = (BottomNavigationView) findViewById(R.id.navigation3);
        Menu menu = mMainNav.getMenu();
        MenuItem menuItem1 = menu.getItem(0);
        menuItem1.setChecked(true);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.ic_buy:


                        break;

                    case R.id.ic_sell:

                        Intent a = new Intent(getApplicationContext(),Selling.class);
                        startActivity(a);
                        break;

                    case R.id.ic_myads:

                        Intent b = new Intent(getApplicationContext(),MyAds.class);
                        startActivity(b);
                        break;

                    case R.id.ic_profile:

                        Intent c = new Intent(getApplicationContext(),Profile.class);
                        startActivity(c);
                      break;



                }

                return false;
            }
        });



    }
}
