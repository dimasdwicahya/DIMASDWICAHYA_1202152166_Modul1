package com.example.dimasdwicahya.dimas_1202152166_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText namamenu, jml;
    private Button restaurant, restaurant2;
    private TextView tmptmakan;

    private int uang = 65500;

    private int x, totalbayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namamenu = (EditText) findViewById(R.id.menu);
        jml = (EditText) findViewById(R.id.jumlah);
        tmptmakan = (TextView) findViewById(R.id.restaurant);

    }

    public void eatbus(View view) {
        String menu = namamenu.getText().toString();
        String jumlah = jml.getText().toString();
        x = Integer.parseInt(jumlah.trim());

        totalbayar = x * 50000; //hitung total bayar

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);

        bundle.putString("Jumlah", jumlah);

        bundle.putString("Total", String.valueOf(totalbayar));

        bundle.putString("Restoran", "Eatbus");

        Intent a = new Intent(this, SecondActivity.class);

        a.putExtras(bundle);

        startActivity(a);


        if (totalbayar > uang) {
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        }

    }

    public void abnormal(View view) {
        String menu = namamenu.getText().toString();
        String jumlah = jml.getText().toString();
        x = Integer.parseInt(jumlah.trim()); //konversi ke integer

        totalbayar = x * 30000; //hitung total bayar

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah", jumlah);
        bundle.putString("Total", String.valueOf(totalbayar));
        bundle.putString("Restoran", "Abnormal");

        Intent a = new Intent(this, SecondActivity.class);

        a.putExtras(bundle);

        startActivity(a);

        if (totalbayar < uang) {
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }

    }
}