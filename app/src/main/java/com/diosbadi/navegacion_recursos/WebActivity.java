package com.diosbadi.navegacion_recursos;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        //Habilitar JavaScript (opcional)
        webView.loadUrl(getString(R.string.web_url));
        //Cargar la URL desde strings.xml
    }
}