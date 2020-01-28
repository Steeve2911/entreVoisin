package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.openclassrooms.entrevoisins.R;




public class ProfilNeighbour extends AppCompatActivity {

   private ImageView mActivityImgProfil;
   private FloatingActionButton mActivityFav;
   private TextView mActivityName;
   private ImageView mActivityPhone;
   private ImageView mActivityLocation;
   private ImageView mActivityLanguage;
   private TextView mActivityPrésentation;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorit_neighbour2);
        this.ConfigureToolBar();
        mActivityImgProfil = (ImageView)findViewById(R.id.activity_image_profil);
        mActivityFav = (FloatingActionButton) findViewById(R.id.activity_fav);
        mActivityName = (TextView) findViewById(R.id.activity_name);
        mActivityPhone = (ImageView) findViewById(R.id.activity_phone);
        mActivityLocation = (ImageView) findViewById(R.id.activity_location);
        mActivityLanguage = (ImageView) findViewById(R.id.activity_language);
        mActivityPrésentation = (TextView) findViewById(R.id.activity_presentation_txt);

    }
    private void ConfigureToolBar() {

        //Get the toolbar (Serialise)
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set the toolbar
        setSupportActionBar(toolbar);
        // Get a support ActionBar corresponding to this toolbar

        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

    }

    private void setSupportActionBar(Toolbar toolbar) {



    }

}
