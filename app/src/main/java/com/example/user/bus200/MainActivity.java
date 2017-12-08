package com.example.user.bus200;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {
    public static String a = "";
    private Button m_Button;
    private View.OnClickListener m_listener;

    private String counter;
    TextView textview;
    Document doc = null;
    LinearLayout layout = null;

    Handler handler = new Handler();

    public static String s=null;
    public static String StopID = null;
    String bus_number=null;
    public static String bus_number1=null;
    public static String bus_number2=null;
    public static String bus_number3=null;

    public static String bus_stopname1=null;
    public static String bus_stopname2=null;
    public static String bus_stopname3=null;

    public Sound sound = new Sound(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Bus200");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.bus_icon);

        textview = (TextView) findViewById(R.id.TextView);

        counter = "Button";

        final CheckBox cb1 = (CheckBox) findViewById(R.id.CheckBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.CheckBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.CheckBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.CheckBox4);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.CheckBox5);
        final CheckBox cb6 = (CheckBox) findViewById(R.id.CheckBox6);
        final CheckBox cb7 = (CheckBox) findViewById(R.id.CheckBox7);
        final CheckBox cb8 = (CheckBox) findViewById(R.id.CheckBox8);
        final CheckBox cb9 = (CheckBox) findViewById(R.id.CheckBox9);
        final CheckBox cb10 = (CheckBox) findViewById(R.id.CheckBox10);
        final CheckBox cb11 = (CheckBox) findViewById(R.id.CheckBox11);
        final CheckBox cb12 = (CheckBox) findViewById(R.id.CheckBox12);
        final CheckBox cb14 = (CheckBox) findViewById(R.id.CheckBox14);
        final CheckBox cb15 = (CheckBox) findViewById(R.id.CheckBox15);
        final CheckBox cb16 = (CheckBox) findViewById(R.id.CheckBox16);
        final CheckBox cb17 = (CheckBox) findViewById(R.id.CheckBox17);
        final CheckBox cb18 = (CheckBox) findViewById(R.id.CheckBox18);
        final CheckBox cb19 = (CheckBox) findViewById(R.id.CheckBox19);
        final CheckBox cb20 = (CheckBox) findViewById(R.id.CheckBox20);
        final CheckBox cb21 = (CheckBox) findViewById(R.id.CheckBox21);
        final CheckBox cb22 = (CheckBox) findViewById(R.id.CheckBox22);
        final CheckBox cb23 = (CheckBox) findViewById(R.id.CheckBox23);
        final CheckBox cb24 = (CheckBox) findViewById(R.id.CheckBox24);
        final CheckBox cb25 = (CheckBox) findViewById(R.id.CheckBox25);
        final CheckBox cb26 = (CheckBox) findViewById(R.id.CheckBox26);
        final CheckBox cb27 = (CheckBox) findViewById(R.id.CheckBox27);
        final CheckBox cb28 = (CheckBox) findViewById(R.id.CheckBox28);
        final CheckBox cb29 = (CheckBox) findViewById(R.id.CheckBox29);
        final CheckBox cb30 = (CheckBox) findViewById(R.id.CheckBox30);
        final CheckBox cb31 = (CheckBox) findViewById(R.id.CheckBox31);
        final CheckBox cb32 = (CheckBox) findViewById(R.id.CheckBox32);
        final CheckBox cb33 = (CheckBox) findViewById(R.id.CheckBox33);
        final CheckBox cb34 = (CheckBox) findViewById(R.id.CheckBox34);
        final CheckBox cb35 = (CheckBox) findViewById(R.id.CheckBox35);
        final CheckBox cb36 = (CheckBox) findViewById(R.id.CheckBox36);
        final CheckBox cb37 = (CheckBox) findViewById(R.id.CheckBox37);
        final CheckBox cb38 = (CheckBox) findViewById(R.id.CheckBox38);
        final CheckBox cb39 = (CheckBox) findViewById(R.id.CheckBox39);
        final CheckBox cb40 = (CheckBox) findViewById(R.id.CheckBox40);
        final CheckBox cb41 = (CheckBox) findViewById(R.id.CheckBox41);
        final CheckBox cb42 = (CheckBox) findViewById(R.id.CheckBox42);
        final CheckBox cb43 = (CheckBox) findViewById(R.id.CheckBox43);
        final CheckBox cb45 = (CheckBox) findViewById(R.id.CheckBox45);
        final CheckBox cb46 = (CheckBox) findViewById(R.id.CheckBox46);
        final CheckBox cb47 = (CheckBox) findViewById(R.id.CheckBox47);
        final CheckBox cb48 = (CheckBox) findViewById(R.id.CheckBox48);
        final CheckBox cb49 = (CheckBox) findViewById(R.id.CheckBox49);
        final CheckBox cb50 = (CheckBox) findViewById(R.id.CheckBox50);
        final CheckBox cb51 = (CheckBox) findViewById(R.id.CheckBox51);
        final CheckBox cb52 = (CheckBox) findViewById(R.id.CheckBox52);
        final CheckBox cb53 = (CheckBox) findViewById(R.id.CheckBox53);
        final CheckBox cb54 = (CheckBox) findViewById(R.id.CheckBox54);
        final CheckBox cb55 = (CheckBox) findViewById(R.id.CheckBox55);
        final CheckBox cb56 = (CheckBox) findViewById(R.id.CheckBox56);
        final CheckBox cb57 = (CheckBox) findViewById(R.id.CheckBox57);
        final CheckBox cb58 = (CheckBox) findViewById(R.id.CheckBox58);
        final CheckBox cb59 = (CheckBox) findViewById(R.id.CheckBox59);
        final CheckBox cb60 = (CheckBox) findViewById(R.id.CheckBox60);
        final CheckBox cb61 = (CheckBox) findViewById(R.id.CheckBox61);
        final CheckBox cb62 = (CheckBox) findViewById(R.id.CheckBox62);
        final CheckBox cb63 = (CheckBox) findViewById(R.id.CheckBox63);
        final CheckBox cb64 = (CheckBox) findViewById(R.id.CheckBox64);
        final CheckBox cb65 = (CheckBox) findViewById(R.id.CheckBox65);
        final CheckBox cb66 = (CheckBox) findViewById(R.id.CheckBox66);
        final CheckBox cb67 = (CheckBox) findViewById(R.id.CheckBox67);
        final CheckBox cb68 = (CheckBox) findViewById(R.id.CheckBox68);
        final CheckBox cb69 = (CheckBox) findViewById(R.id.CheckBox69);
        final CheckBox cb70 = (CheckBox) findViewById(R.id.CheckBox70);
        final CheckBox cb71 = (CheckBox) findViewById(R.id.CheckBox71);
        final CheckBox cb72 = (CheckBox) findViewById(R.id.CheckBox72);
        final CheckBox cb73 = (CheckBox) findViewById(R.id.CheckBox73);
        final CheckBox cb74 = (CheckBox) findViewById(R.id.CheckBox74);
        final CheckBox cb75 = (CheckBox) findViewById(R.id.CheckBox75);
        final CheckBox cb76 = (CheckBox) findViewById(R.id.CheckBox76);
        final CheckBox cb77 = (CheckBox) findViewById(R.id.CheckBox77);
        final CheckBox cb78 = (CheckBox) findViewById(R.id.CheckBox78);
        final CheckBox cb79 = (CheckBox) findViewById(R.id.CheckBox79);
        final CheckBox cb80 = (CheckBox) findViewById(R.id.CheckBox80);
        final CheckBox cb81 = (CheckBox) findViewById(R.id.CheckBox81);
        final CheckBox cb82 = (CheckBox) findViewById(R.id.CheckBox82);
        final CheckBox cb83 = (CheckBox) findViewById(R.id.CheckBox83);

        m_Button = (Button) findViewById(R.id.Button);

        m_listener = new View.OnClickListener() {

            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "체크박스를 선택하세요.", Toast.LENGTH_LONG).show();
                m_Button.setText(String.valueOf(counter));

                RequestThread thread = new RequestThread();
                thread.start();

                Timer timer = new Timer();
                if(m_Button.getText().equals("Button")){

                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            if (cb1.isChecked() == true) {
                                StopID = "46041";
                                sound.alarm();
                            }
                            if (cb2.isChecked() == true) {
                                StopID = "46004";
                                sound.alarm();
                            }
                            if (cb3.isChecked() == true) {
                                StopID = "46046";
                                sound.alarm();
                            }
                            if (cb4.isChecked() == true) {
                                StopID = "46008";
                                sound.alarm();
                            }
                            if (cb5.isChecked() == true) {
                                StopID = "41001";
                                sound.alarm();
                            }
                            if (cb6.isChecked() == true) {
                                StopID = "41004";
                                sound.alarm();
                            }
                            if (cb7.isChecked() == true) {
                                StopID = "41005";
                                sound.alarm();
                            }
                            if (cb8.isChecked() == true) {
                                StopID = "41007";
                                sound.alarm();
                            }
                            if (cb9.isChecked() == true) {
                                StopID = "41013";
                                sound.alarm();
                            }
                            if (cb10.isChecked() == true) {
                                StopID = "41015";
                                sound.alarm();
                            }
                            if (cb11.isChecked() == true) {
                                StopID = "02002";
                                sound.alarm();
                            }
                            if (cb12.isChecked() == true) {
                                StopID = "02003";
                                sound.alarm();
                            }
                            if (cb14.isChecked() == true) {
                                StopID = "02006";
                                sound.alarm();
                            }
                            if (cb15.isChecked() == true) {
                                StopID = "02083";
                                sound.alarm();
                            }
                            if (cb16.isChecked() == true) {
                                StopID = "02010";
                                sound.alarm();
                            }
                            if (cb17.isChecked() == true) {
                                StopID = "02088";
                                sound.alarm();
                            }
                            if (cb18.isChecked() == true) {
                                StopID = "02089";
                                sound.alarm();
                            }
                            if (cb19.isChecked() == true) {
                                StopID = "02091";
                                sound.alarm();
                            }
                            if (cb20.isChecked() == true) {
                                StopID = "02017";
                                sound.alarm();
                            }
                            if (cb21.isChecked() == true) {
                                StopID = "47002";
                                sound.alarm();
                            }
                            if (cb22.isChecked() == true) {
                                StopID = "47005";
                                sound.alarm();
                            }
                            if (cb23.isChecked() == true) {
                                StopID = "47008";
                                sound.alarm();
                            }
                            if (cb24.isChecked() == true) {
                                StopID = "47038";
                                sound.alarm();
                            }
                            if (cb25.isChecked() == true) {
                                StopID = "47032";
                                sound.alarm();
                            }
                            if (cb26.isChecked() == true) {
                                StopID = "47026";
                                sound.alarm();
                            }
                            if (cb27.isChecked() == true) {
                                StopID = "47033";
                                sound.alarm();
                            }
                            if (cb28.isChecked() == true) {
                                StopID = "48017";
                                sound.alarm();
                            }
                            if (cb29.isChecked() == true) {
                                StopID = "48005";
                                sound.alarm();
                            }
                            if (cb30.isChecked() == true) {
                                StopID = "48019";
                                sound.alarm();
                            }
                            if (cb31.isChecked() == true) {
                                StopID = "48602";
                                sound.alarm();
                            }
                            if (cb32.isChecked() == true) {
                                StopID = "49001";
                                sound.alarm();
                            }
                            if (cb33.isChecked() == true) {
                                StopID = "49003";
                                sound.alarm();
                            }
                            if (cb34.isChecked() == true) {
                                StopID = "49044";
                                sound.alarm();
                            }
                            if (cb35.isChecked() == true) {
                                StopID = "49036";
                                sound.alarm();
                            }
                            if (cb36.isChecked() == true) {
                                StopID = "49024";
                                sound.alarm();
                            }
                            if (cb37.isChecked() == true) {
                                StopID = "49028";
                                sound.alarm();
                            }
                            if (cb38.isChecked() == true) {
                                StopID = "49013";
                                sound.alarm();
                            }
                            if (cb39.isChecked() == true) {
                                StopID = "49022";
                                sound.alarm();
                            }
                            if (cb40.isChecked() == true) {
                                StopID = "11060";
                                sound.alarm();
                            }
                            if (cb41.isChecked() == true) {
                                StopID = "11020";
                                sound.alarm();
                            }
                            if (cb42.isChecked() == true) {
                                StopID = "11022";
                                sound.alarm();
                            }
                            if (cb43.isChecked() == true) {
                                StopID = "11023";
                                sound.alarm();
                            }
                            if (cb45.isChecked() == true) {
                                StopID = "11059";
                                sound.alarm();
                            }
                            if (cb46.isChecked() == true) {
                                StopID = "11021";
                                sound.alarm();
                            }
                            if (cb47.isChecked() == true) {
                                StopID = "11019";
                                sound.alarm();
                            }
                            if (cb48.isChecked() == true) {
                                StopID = "49021";
                                sound.alarm();
                            }
                            if (cb49.isChecked() == true) {
                                StopID = "49014";
                                sound.alarm();
                            }
                            if (cb50.isChecked() == true) {
                                StopID = "49027";
                                sound.alarm();
                            }
                            if (cb51.isChecked() == true) {
                                StopID = "49023";
                                sound.alarm();
                            }
                            if (cb52.isChecked() == true) {
                                StopID = "49035";
                                sound.alarm();

                            }
                            if (cb53.isChecked() == true) {
                                StopID = "49043";
                                sound.alarm();
                            }
                            if (cb54.isChecked() == true) {
                                StopID = "49004";
                                sound.alarm();
                            }
                            if (cb55.isChecked() == true) {
                                StopID = "49002";
                                sound.alarm();
                            }
                            if (cb56.isChecked() == true) {
                                StopID = "48601";
                                sound.alarm();
                            }
                            if (cb57.isChecked() == true) {
                                StopID = "48020";
                                sound.alarm();
                            }
                            if (cb58.isChecked() == true) {
                                StopID = "48018";
                                sound.alarm();
                            }
                            if (cb59.isChecked() == true) {
                                StopID = "47032";
                                sound.alarm();
                            }
                            if (cb60.isChecked() == true) {
                                StopID = "47026";
                                sound.alarm();
                            }
                            if (cb61.isChecked() == true) {
                                StopID = "47033";
                                sound.alarm();
                            }
                            if (cb62.isChecked() == true) {
                                StopID = "47010";
                                sound.alarm();
                            }
                            if (cb63.isChecked() == true) {
                                StopID = "47007";
                                sound.alarm();
                            }
                            if (cb64.isChecked() == true) {
                                StopID = "47004";
                                sound.alarm();
                            }
                            if (cb65.isChecked() == true) {
                                StopID = "47003";
                                sound.alarm();
                            }
                            if (cb66.isChecked() == true) {
                                StopID = "02016";
                                sound.alarm();
                            }
                            if (cb67.isChecked() == true) {
                                StopID = "02092";
                                sound.alarm();
                            }
                            if (cb68.isChecked() == true) {
                                StopID = "02090";
                                sound.alarm();
                            }
                            if (cb69.isChecked() == true) {
                                StopID = "02087";
                                sound.alarm();
                            }
                            if (cb70.isChecked() == true) {
                                StopID = "02011";
                                sound.alarm();
                            }
                            if (cb71.isChecked() == true) {
                                StopID = "02005";
                                sound.alarm();
                            }
                            if (cb72.isChecked() == true) {
                                StopID = "02004";
                                sound.alarm();
                            }
                            if (cb73.isChecked() == true) {
                                StopID = "02001";
                                sound.alarm();
                            }
                            if (cb74.isChecked() == true) {
                                StopID = "41014";
                                sound.alarm();
                            }
                            if (cb75.isChecked() == true) {
                                StopID = "41009";
                                sound.alarm();
                            }
                            if (cb76.isChecked() == true) {
                                StopID = "41008";
                                sound.alarm();
                            }
                            if (cb77.isChecked() == true) {
                                StopID = "41006";
                                sound.alarm();
                            }
                            if (cb78.isChecked() == true) {
                                StopID = "41003";
                                sound.alarm();
                            }
                            if (cb79.isChecked() == true) {
                                StopID = "41002";
                                sound.alarm();
                            }
                            if (cb80.isChecked() == true) {
                                StopID = "46007";
                                sound.alarm();
                            }
                            if (cb81.isChecked() == true) {
                                StopID = "46006";
                                sound.alarm();
                            }
                            if (cb82.isChecked() == true) {
                                StopID = "46003";
                                sound.alarm();
                            }
                            if (cb83.isChecked() == true) {
                                StopID = "46042";
                                sound.alarm();
                            }
                        }
                    },0,1000);
                    m_Button.setText(">_<");
                }
            }

        };
        m_Button.setOnClickListener(m_listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.location) {
            Intent intent = new Intent(getApplicationContext(),NowLocation.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.end) {
            moveTaskToBack(true);
            finish();
            android.os.Process.killProcess(android.os.Process.myPid());
            return true;
        }
        if (id == R.id.about) {
            Toast.makeText(MainActivity.this,"문의 010-0000-0000",Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class RequestThread extends Thread{
        public void run(){
            for(int i=0; i<3000; i++){
                try {
                    new GetXMLTask().execute("http://apis.jinju.go.kr/api/bimsServices/BusLocationInfo.xml?routeid=381020010");
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public class GetXMLTask extends AsyncTask<String, Void, Document> {

        @Override
        protected Document doInBackground(String... urls) {
            URL url;
            try {
                url = new URL(urls[0]);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder(); //XML문서 빌더 객체를 생성
                doc = db.parse(new InputSource(url.openStream())); //XML문서를 파싱한다.
                doc.getDocumentElement().normalize();
            } catch (Exception e) {
                //Toast.makeText(getBaseContext(), "Parsing Error", Toast.LENGTH_SHORT).show();
            }
            return doc;
        }

        protected void onPostExecute(Document doc) {

            bus_number="";
            s="";

            NodeList nodeList = doc.getElementsByTagName("result");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i); //data엘리먼트 노드
                Element fstElmnt = (Element) node;
                NodeList nameList = fstElmnt.getElementsByTagName("StopID");
                Element nameElement = (Element) nameList.item(0);
                nameList = nameElement.getChildNodes();
                bus_number += ((Node) nameList.item(0)).getNodeValue()+";";

                NodeList websiteList = fstElmnt.getElementsByTagName("StopNAME");
                s += websiteList.item(0).getChildNodes().item(0).getNodeValue() + ",";

            }

            bus_number1="";
            bus_number2="";
            bus_number3="";

            bus_stopname1="";
            bus_stopname2="";
            bus_stopname3="";

            switch(nodeList.getLength()) {
                case 1 :
                    bus_number1 = bus_number.split(";")[0];
                    bus_stopname1 = s.split(",")[0];
                    Log.d("min", bus_number1 +"+" + bus_stopname1);
                    break;
                case 2 :
                    bus_number1 = bus_number.split(";")[0];
                    bus_number2 = bus_number.split(";")[1];
                    bus_stopname1 = s.split(",")[0];
                    bus_stopname2 = s.split(",")[1];
                    Log.d("min",bus_number1 + " + " + bus_number2 + "+" + bus_stopname1  + "+" + bus_stopname2);
                    break;
                case 3 :
                    bus_number1 = bus_number.split(";")[0];
                    bus_number2 = bus_number.split(";")[1];
                    bus_number3 = bus_number.split(";")[2];
                    bus_stopname1 = s.split(",")[0];
                    bus_stopname2 = s.split(",")[1];
                    bus_stopname3 = s.split(",")[2];

                    Log.d("min",bus_number1 + " + " + bus_number2 + " + " + bus_number3 + "+" + bus_stopname1 + "+" + bus_stopname2 + "+" + bus_stopname3);
                    break;
            }
        }
    }
}