package com.example.okhttprequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    private TextView textView_Result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Result = (TextView) findViewById(R.id.textView_Result);

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts")
                .build();
        
    }
}