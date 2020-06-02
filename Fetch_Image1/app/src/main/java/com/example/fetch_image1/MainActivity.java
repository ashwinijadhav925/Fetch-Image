package com.example.fetch_image1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.URL;

public class MainActivity extends AppCompatActivity  {

    private static final String IMAGES_URL = "http://192.168.43.249/Images/getImg.php";

    ImageView imageView;
    String placeinfo;
    TextView infotext,loc_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infotext = findViewById(R.id.info_tv);
        loc_name = findViewById(R.id.loc_name);
        placeinfo = getIntent().getStringExtra("place");
        System.out.println("....place name......"+placeinfo);

        imageView=(ImageView)findViewById(R.id.imageView);
        getImage();
    }

    void getImage(){
        System.out.print("......inside getImage..........");
        JSONObject obj = new JSONObject();
        try {
            obj.put("placename",placeinfo);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, IMAGES_URL, obj, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.print("..........I got response..........");
                //Toast.makeText(MainActivity.this, "result:" + response, Toast.LENGTH_LONG).show();

                Bitmap bitmap = null;
                try {
                    loc_name.setText(response.getString("location_name"));
                    infotext.setText(response.getString("info"));
                    new DownLoadImageTask(imageView).execute(response.getString("url"));
                    if (bitmap != null) {
                        System.out.print("..............u r in bitmap..........");

                    } else {
                        System.out.print("....................sorry..............");
                    }
                    // imageView.setImageBitmap(bitmap);
                    URL url = new URL(response.getString("url"));

                } catch (Exception e) {

                    e.printStackTrace();
                    System.out.println("......errorrrrrrrrrrr.......");
                }

                //imageView.setImageBitmap();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                    System.out.println(".......voleyyyyyyyyyyy....."+error);
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);


    private class DownLoadImageTask extends AsyncTask<String,Void,Bitmap>{
        ImageView imageView;
        public DownLoadImageTask(ImageView imageview){
            this.imageView = imageview;
        }
        protected Bitmap doInBackground(String...urls){
            String urlOfImage = urls[0];
            Bitmap logo=null;
            try {
                InputStream is = new  java.net.URL(urlOfImage).openStream();
                logo =BitmapFactory.decodeStream(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return logo;
        }
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //loading = ProgressDialog.show(MainActivity.this,"Downloading Image...","Please wait...",true,true);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            //loading.dismiss();
            imageView.setImageBitmap(bitmap);
        }
    }
    }
