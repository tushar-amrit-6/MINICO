package com.example.recyclerview;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.net.Uri;
        import android.os.Bundle;
        import android.provider.MediaStore;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;

        import com.google.android.material.bottomnavigation.BottomNavigationView;

        import java.io.IOException;

public class Selling extends AppCompatActivity {

    private ImageView sellImage;
    private static final int pick_image_1 = 1;
    Uri imageuri;
    RadioGroup rg;
    RadioButton rb;

    private BottomNavigationView mMainNav;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == pick_image_1 && resultCode == RESULT_OK) {
            imageuri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageuri);
                sellImage.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        rg = (RadioGroup) findViewById(R.id.rgroup);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainNav = (BottomNavigationView) findViewById(R.id.navigation3);
        Menu menu = mMainNav.getMenu();
        MenuItem menuItem1 = menu.getItem(1);
        menuItem1.setChecked(true);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.ic_buy:

                        Intent a = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(a);
                        break;

                    case R.id.ic_sell:

                        break;

                    case R.id.ic_myads:

                        Intent b = new Intent(getApplicationContext(), MyAds.class);
                        startActivity(b);
                        break;

                    case R.id.ic_profile:

                        Intent c = new Intent(getApplicationContext(), Profile.class);
                        startActivity(c);
                        break;


                }
                return false;
            }

        });
    }
}


