package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import android.os.Bundle;
import android.widget.TextView;

public class InfoPeli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_peli);

        Bundle bundle = getIntent().getExtras();

        WebView webView1 = (WebView) findViewById(R.id.webview);
        WebSettings conf = webView1.getSettings();
        conf.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl(bundle.getString("url"));

        //TextView et3 = findViewById(R.id.infonombre2);
        //et3.setText(bundle.getString("usuario"));


    }
}
