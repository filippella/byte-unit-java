package org.dalol.bytesunit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.dalol.byteunit.ByteUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Double kiloBytes = ByteUnit.MEGABYTES.toKiloBytes(560);

        System.out.println("560MB = " + kiloBytes + "KB");
    }
}
