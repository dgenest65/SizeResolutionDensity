package com.dgi.mobile.tools.sizeresolutiondensity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        ((TextView)findViewById(R.id.txtFormFactor)).setText(
                "Metrics:\ndensity: " + metrics.density +
                        "\ndensityDpi: " + metrics.densityDpi +
                        "\nscaledDensity: " + metrics.scaledDensity +
                        "\nwidthPixels: " + metrics.widthPixels +
                        "\nheightPixels: " + metrics.heightPixels +
                        "\nxdpi: " + metrics.xdpi +
                        "\nydpi: " + metrics.ydpi +
                        "\nwidth dp: " + metrics.widthPixels / metrics.density +
                        "\nheight dp: " + metrics.heightPixels / metrics.density

        );
    }

}
