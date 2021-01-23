package com.developndesign.firebaseautomlvisionedge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);

Button btn_Exit =findViewById(R.id.btn_Exit);
        Button btn_Enter =findViewById(R.id.btn_Enter);

        btn_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
btn_Enter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
openMainActivity();
    }
    public void openMainActivity() {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),R.string.DesforMain,Toast.LENGTH_LONG).show();
    }
});



    }
}
