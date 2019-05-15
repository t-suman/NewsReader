package com.example.newsreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView=findViewById(R.id.web_view);
        webView.getSettings().getJavaScriptEnabled();
        webView.setWebViewClient(new WebViewClient());

        Intent intent=getIntent();
        String s=intent.getStringExtra("content");
        webView.loadData(s,"text/html","UTF-8");
    }
}
