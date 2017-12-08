package com.example.user.bus200;

import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static com.example.user.bus200.MainActivity.bus_number1;
import static com.example.user.bus200.MainActivity.bus_number2;
import static com.example.user.bus200.MainActivity.bus_number3;
import static com.example.user.bus200.MainActivity.bus_stopname1;
import static com.example.user.bus200.MainActivity.bus_stopname2;
import static com.example.user.bus200.MainActivity.bus_stopname3;

public class NowLocation extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;

    Document doc = null;
    LinearLayout layout = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        getSupportActionBar().setTitle("Bus200");
        getSupportActionBar().setSubtitle("현재 버스 위치 보기");

        getSupportActionBar().setIcon(R.mipmap.bus_icon);

        textView1 = (TextView) findViewById(R.id.textview);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3 = (TextView) findViewById(R.id.text3);

        textView1.setText(bus_stopname1 + "(" + bus_number1 + ")");
        textView2.setText(bus_stopname2 + "(" + bus_number2 + ")");
        textView3.setText(bus_stopname3 + "(" + bus_number3 + ")");


    }
}


