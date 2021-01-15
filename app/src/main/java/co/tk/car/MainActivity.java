package co.tk.car;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button mButtonClient, mButtonIamDriver;

    SharedPreferences mPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonClient = findViewById(R.id.btnIAmClient);
        mButtonIamDriver = findViewById(R.id.btnIAmDriver);

        mPref = getApplicationContext().getSharedPreferences("typeUser", MODE_PRIVATE);
        SharedPreferences.Editor editor = mPref.edit();

        mButtonClient.setOnClickListener(v -> {

            editor.putString("user", "Usuario");
            editor.apply();
            goToSelectAuth();
        });


        mButtonIamDriver.setOnClickListener(v -> {

            editor.putString("user", "Conductor");
            editor.apply();
            goToSelectAuth();
        });
    }

    private void goToSelectAuth() {

        Intent intent = new Intent(getApplicationContext(), SelectLoginActivity.class);
        startActivity(intent);
    }
}