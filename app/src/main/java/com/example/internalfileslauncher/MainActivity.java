package com.example.internalfileslauncher;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public final class MainActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent intent = new Intent();
            intent.setClassName("com.android.documentsui",
                    "com.android.documentsui.files.FilesActivity");
            this.startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}