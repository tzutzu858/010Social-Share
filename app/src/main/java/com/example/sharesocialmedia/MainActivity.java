package com.example.sharesocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String sharesubject = "tzutzu的github";
                //subject：內容的標題。有些 App 會忽略
                myIntent.putExtra(Intent.EXTRA_SUBJECT, sharesubject);
                String shareBody = "https://github.com/tzutzu858";
                //body：內容。想要分享的內容，可以放網址，有些 App 會自動轉成連結或直接下載縮圖。
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "你想要分享到哪裡呢?"));
                //chooserTitle：選擇器的標題。當使用者的裝置中只有一個 App 能接收這個意圖時，就不會出現選擇器，而是直接打開該 App。


            }
        });}}