package littledroidtech.quon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Book2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);

        WebView web = (WebView)findViewById(R.id.html2);
        web.loadUrl("file:///android_asset/socialbuzz.html");

    }
}
