package com.example.dimasdwicahya.dimas_1202152166_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView menu,porsi,hargasatuan,restoran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        menu = (TextView) findViewById(R.id.nmmenu);
        porsi = (TextView) findViewById(R.id.jmlporsi);
        hargasatuan = (TextView) findViewById(R.id.harga);
        restoran = (TextView) findViewById(R.id.nmrestoran);

        if (getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            menu.setText(bundle.getString("Menu"));
            porsi.setText(bundle.getString("Jumlah"));
            hargasatuan.setText(bundle.getString("Total"));
            restoran.setText(bundle.getString("Restoran"));
        }

        else
        {
            menu.setText(getIntent().getStringExtra("Menu"));
            hargasatuan.setText(getIntent().getStringExtra("Jumlah"));
            hargasatuan.setText(getIntent().getStringExtra("Total"));
            restoran.setText(getIntent().getStringExtra("Restoran"));
        }

    }
}
