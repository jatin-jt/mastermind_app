package com.example.mastermind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNumTurns, etCodeLength;
    private Button btnGenerateGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumTurns = findViewById(R.id.et_num_turns);
        etCodeLength = findViewById(R.id.et_code_length);
        btnGenerateGame = findViewById(R.id.btn_generate_game);

        btnGenerateGame.setOnClickListener((View v)->{});
    }
}
