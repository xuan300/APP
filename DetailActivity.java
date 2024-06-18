package com.example.app02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textViewDetail = findViewById(R.id.text_view_detail);

        // 接收從 MainActivity 傳遞過來的資料
        if (getIntent().hasExtra("category") && getIntent().hasExtra("link") && getIntent().hasExtra("description")) {
            String category = getIntent().getStringExtra("category");
            String link = getIntent().getStringExtra("link");
            String description = getIntent().getStringExtra("description");

            String detailText = "類別: " + category + "\n\n網頁連結: " + link + "\n\n說明: " + description;
            textViewDetail.setText(detailText); // 在詳細資料頁面顯示詳細資料
        }
    }
}
