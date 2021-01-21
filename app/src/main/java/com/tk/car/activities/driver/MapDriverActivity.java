package com.tk.car.activities.driver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tk.car.R;
import com.tk.car.activities.LoginActivity;
import com.tk.car.providers.AuthProvider;

public class MapDriverActivity extends AppCompatActivity {

    Button logOut;
    AuthProvider mAuthProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_driver);

        logOut = findViewById(R.id.logOut);
        mAuthProvider = new AuthProvider();

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuthProvider.logout();

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}