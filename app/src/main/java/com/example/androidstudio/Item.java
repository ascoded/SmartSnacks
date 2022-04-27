package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.androidstudio.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class Item extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);


        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_items, R.id.nav_pantry, R.id.nav_necessities, R.id.nav_recipes)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        TextView title = (TextView) findViewById(R.id.title);
        title.setText("Items");
        title.setTextColor(257545);

    }

        public void buttonPopupwindow(View v){
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View viewPopupwindow = layoutInflater.inflate(R.layout.popup_item,null);
            PopupWindow popupwindow = new PopupWindow(viewPopupwindow,700,800, true);

            popupwindow.showAtLocation(v, Gravity.CENTER, 0,0);

            //closing button
            Button close = (Button) viewPopupwindow.findViewById(R.id.button_cancel);
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupwindow.dismiss();
                }
            });
    }
}