package cse.mobile.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("Hi World!");
        TextView tv2=(TextView)findViewById(R.id.tv2);
        tv2.setText("Project Diva");
        TextView tv3=(TextView)findViewById(R.id.tv3);
        tv3.setText("Project Rock");
    }
}
