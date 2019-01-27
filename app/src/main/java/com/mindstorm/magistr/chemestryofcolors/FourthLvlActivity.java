package com.mindstorm.magistr.chemestryofcolors;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class FourthLvlActivity extends Activity{

    ImageView imageview;
    Button button;
    Button button2;
    Bitmap bitmap;
    Canvas canvas;
    Paint paint;
    int CanvasRadius;
    int CanvasPadding = 7;
    int height, width;

    Random rnd = new Random();


    private Spinner spinnerr;
    String selectedtr;
    int selectednr;

    private Spinner spinnerg;
    String selectedtg;
    int selectedng;

    private Spinner spinnerb;
    String selectedtb;
    int selectednb;



    int values[] = new int[]{
            0,
            17,
            34,
            51,
            68,
            85,
            102,
            119,
            136,
            153,
            170,
            187,
            204,
            221,
            238,
            255
    };

    int rndr,rndg,rndb;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_fourthlvl);

        imageview = (ImageView)findViewById(R.id.imageView1);
        button = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        // Spinner element
        spinnerr = (Spinner) findViewById(R.id.spinner1);
        // Spinner element
        spinnerg = (Spinner) findViewById(R.id.spinner2);
        // Spinner element
        spinnerb = (Spinner) findViewById(R.id.spinner3);








        CreateBitmap();

        CreateCanvas();

        CanvasRadius = Math.min(canvas.getWidth(),canvas.getHeight()/2);

        CreatePaint();

        canvas.drawCircle(
                canvas.getWidth() / 2,
                canvas.getHeight() / 2,
                CanvasRadius - CanvasPadding,
                paint);


        imageview.setImageBitmap(bitmap);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //RESULT
                selectedtr = spinnerr.getSelectedItem().toString();
                selectednr = spinnerr.getSelectedItemPosition();
                selectedtg = spinnerg.getSelectedItem().toString();
                selectedng = spinnerg.getSelectedItemPosition();
                selectedtb = spinnerb.getSelectedItem().toString();
                selectednb = spinnerb.getSelectedItemPosition();

                if (selectednr==rndr && selectedng==rndg && selectednb==rndb) {

                    //Toast.makeText(getApplicationContext(), selectedtr, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "ALL GOOD", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng==rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH BLUE", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng>rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH GREEN", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng>rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH G/B", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng==rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH RED", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng==rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH R/B", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng>rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH R/G", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng>rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH ALL", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng==rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "LOW BLUE", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng<rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "LOW GREEN", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng<rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "LOW G/B", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng==rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "LOW RED", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng==rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "LOW R/B", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng<rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "LOW R/G", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng<rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "LOW ALL", Toast.LENGTH_SHORT).show();

                }  else if (selectednr==rndr && selectedng>rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH G/LOW B", Toast.LENGTH_SHORT).show();

                }  else if (selectednr>rndr && selectedng==rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH R/LOW B", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng<rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "MUCH R/LOW G", Toast.LENGTH_SHORT).show();

                } else if (selectednr==rndr && selectedng<rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "LOW G/MUCH B", Toast.LENGTH_SHORT).show();

                }  else if (selectednr<rndr && selectedng==rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "LOW R/MUCH B", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng>rndg && selectednb==rndb) {

                    Toast.makeText(getApplicationContext(), "LOW R/MUCH G", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng>rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "MR/MG/LB", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng<rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "MR/LG/MB", Toast.LENGTH_SHORT).show();

                } else if (selectednr>rndr && selectedng<rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "MR/LG/LB", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng>rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "LR/MG/MB", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng>rndg && selectednb<rndb) {

                    Toast.makeText(getApplicationContext(), "LR/MG/LB", Toast.LENGTH_SHORT).show();

                } else if (selectednr<rndr && selectedng<rndg && selectednb>rndb) {

                    Toast.makeText(getApplicationContext(), "LR/LG/MB", Toast.LENGTH_SHORT).show();

                }

























                Toast.makeText(getApplicationContext(), ""+Integer.toString(rndr)+"/"+Integer.toString(rndg)+"/"+Integer.toString(rndb)+"", Toast.LENGTH_SHORT).show();

















            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CreateBitmap();

                CreateCanvas();

                CanvasRadius = Math.min(canvas.getWidth(),canvas.getHeight()/2);

                CreatePaint();

                canvas.drawCircle(
                        canvas.getWidth() / 2,
                        canvas.getHeight() / 2,
                        CanvasRadius - CanvasPadding,
                        paint
                );


                imageview.setImageBitmap(bitmap);
            }
        });

    }

    public void CreateBitmap(){

        bitmap = Bitmap.createBitmap(
                400,
                250,
                Bitmap.Config.RGB_565
        );

    }

    public void CreateCanvas(){

        canvas = new Canvas(bitmap);

        canvas.drawColor(Color.WHITE);

    }

    public void CreatePaint(){

        paint = new Paint();

        paint.setStyle(Paint.Style.FILL);

        // rnd.nextInt(values.length)     values[1]
        rndr=rnd.nextInt(values.length);
        rndg=rnd.nextInt(values.length);
        rndb=rnd.nextInt(values.length);

        //paint.setColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        paint.setColor(Color.argb(255, values[rndr], values[rndg], values[rndb]));

        paint.setAntiAlias(true);

    }







}