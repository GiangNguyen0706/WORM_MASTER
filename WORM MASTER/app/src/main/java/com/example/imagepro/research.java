package com.example.imagepro;

import static android.provider.MediaStore.ACTION_IMAGE_CAPTURE;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import java.io.IOException;


public class research extends AppCompatActivity {
    ImageView myimg;
    ImageButton btncapture;

    TextView result;
    TextView score;

    Bitmap photo;
    Button classfibtn;
    String debug_value[] = new String[2];
    private objectDetectorClass objectDetectorClass;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        myimg = findViewById(R.id.myimg);
        btncapture = findViewById(R.id.btncapture);
        classfibtn = findViewById(R.id.infor_btn);
        result = findViewById(R.id.result1);
        score = findViewById(R.id.score1);
        try{
            // input size is 300 for this model
            objectDetectorClass = new objectDetectorClass(getAssets(), "detect.tflite", "labelmap.txt", 320);
            Log.d("MainActivity","Model is successfully loaded");
        }
        catch (IOException e){
            Log.d("MainActivity","Getting some error");
            e.printStackTrace();
        }

        Intent intent_1st = new Intent(ACTION_IMAGE_CAPTURE);
        if (ActivityCompat.checkSelfPermission(research.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(research.this, new String[]{Manifest.permission.CAMERA}, 1);
            return;
        }
        startActivityForResult(intent_1st, 99);

        btncapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACTION_IMAGE_CAPTURE);
                if (ActivityCompat.checkSelfPermission(research.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(research.this, new String[]{Manifest.permission.CAMERA}, 1);
                    return;
                }
                startActivityForResult(intent, 99);
            }
        });
        classfibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(research.this, infor.class);
                Bundle bundle = new Bundle();
                switch (debug_value[0]) {
                    case "Aphids":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_APHIDS);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "Thrips":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_THRIPS);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "Whiteflies":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_WHITEFLIES);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "army worm":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_ARMYWORM);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "grub":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_GRUB);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "peach borer":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_PEACHBORER);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "black cutworm":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_BLACKCUTWORM);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "locust":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_LOCUST);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    case "ladybug":
                        bundle.putString(infor.KEY_SHOW_WHAT, infor.VALUE_LADYBUG);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;

                }
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 99 && resultCode == Activity.RESULT_OK)
        {
            photo = (Bitmap) data.getExtras().get("data");
            myimg.setImageBitmap(photo);
            Mat selected_image = new Mat(photo.getHeight(), photo.getWidth(), CvType.CV_8UC4);

            Utils.bitmapToMat(photo, selected_image);
            debug_value = objectDetectorClass.recognizeImage_research(selected_image);
            //debug_value = "Aphids";
            result.setText(debug_value[0]);
            score.setText(debug_value[1]);
        }
    }
}