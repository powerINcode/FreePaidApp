package com.example.powerincode.jokeandroidlibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static Intent getIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, joke);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if (getIntent() != null) {
            TextView jokeTextView = findViewById(R.id.tv_joke);
            jokeTextView.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }

    }
}
