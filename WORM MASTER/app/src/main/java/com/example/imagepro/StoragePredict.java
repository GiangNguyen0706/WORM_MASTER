package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.TreeMap;

public class StoragePredict extends AppCompatActivity {
    int SELECT_PICTURE = 200;
    private Button select_img;
    private ImageView image_v;
    private objectDetectorClass objectDetectorClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_predict);
        select_img = findViewById(R.id.select_img);
        image_v = findViewById(R.id.image_v);
        try{
            // input size is 300 for this model
            objectDetectorClass = new objectDetectorClass(getAssets(), "detect.tflite", "labelmap.txt", 320);
            Log.d("MainActivity","Model is successfully loaded");
        }
        catch (IOException e){
            Log.d("MainActivity","Getting some error");
            e.printStackTrace();
        }
        Intent int_1st = new Intent();
        int_1st.setType("image/*");
        int_1st.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(int_1st,"Select Picture"),SELECT_PICTURE);

        select_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagechooser();
            }
        });
    }

    private void imagechooser() {
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(i,"Select Picture"),SELECT_PICTURE);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode == Activity.RESULT_OK){
            if (requestCode == SELECT_PICTURE){
                Uri selectedImgUri = data.getData();
                if(selectedImgUri != null){
                    Bitmap bitmap = null;
                    try{
                        bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImgUri);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Mat selected_image = new Mat(bitmap.getHeight(), bitmap.getWidth(), CvType.CV_8UC4);
                    Utils.bitmapToMat(bitmap, selected_image);
                    selected_image = objectDetectorClass.recognizeImage_Storage(selected_image);
                    Bitmap bitmap1 = null;
                    bitmap1 = Bitmap.createBitmap(selected_image.cols(), selected_image.rows(), Bitmap.Config.ARGB_8888);
                    Utils.matToBitmap(selected_image, bitmap1);
                    image_v.setImageBitmap(bitmap1);
                }
            }
        }
    }
}