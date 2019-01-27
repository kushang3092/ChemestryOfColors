package com.mindstorm.magistr.chemestryofcolors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();


        Intent intent;
        // Операции для выбранного пункта меню
        switch (id) {
            /*case R.id.action_cat1:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                return true;*/
            case R.id.lvl1:
                intent = new Intent(MainActivity.this, FirstLvlActivity.class);
                startActivity(intent);
                return true;
            case R.id.lvl2:
                intent = new Intent(MainActivity.this, SecondLvlActivity.class);
                startActivity(intent);
                return true;
            case R.id.lvl3:
                intent = new Intent(MainActivity.this, ThirdLvlActivity.class);
                startActivity(intent);
                return true;

            case R.id.lvl4:
                intent = new Intent(MainActivity.this, FourthLvlActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}