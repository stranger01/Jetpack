package co.tk.car;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SelectLoginActivity extends AppCompatActivity {

    private Button goToLogin, goToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);

        goToLogin = findViewById(R.id.btnGoToLogin);
        goToRegister = findViewById(R.id.btnGoToRegister);

        goToLogin.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        });

        goToRegister.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(intent);

        });


    }
}