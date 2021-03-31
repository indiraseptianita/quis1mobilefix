package com.example.quismobileifx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static final String geo = "";
    static final String phone = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static void tryExit(Activity activity) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity); alert
                .setTitle("Keluar")
                .setMessage("Serius mauki' keluar?")
                .setPositiveButton("Iye'", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.finishAffinity();
                    }
                })
                .setNegativeButton("Nda'ji", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public void biodataInfo(View view) {
        startActivity(new Intent(this, Info.class));
    }

    public void messageIntent(View view) {
        if (!phone.isEmpty()) {
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("smsto:" + phone));
            i.putExtra("sms_body", "Semoga berhasil H071191023");
            startActivity(i);
        }
    }

    public void mapsIntent(View view) {
        if (!geo.isEmpty()) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(geo));
            startActivity(i);
        }
    }

    public void exitButton(View view) {
        tryExit(this);
    }
}