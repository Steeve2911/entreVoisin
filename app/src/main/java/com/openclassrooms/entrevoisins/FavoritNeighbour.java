package com.openclassrooms.entrevoisins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;


public class FavoritNeighbour extends AppCompatActivity {
private Button mFavoritBtn;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorit_neighbour);

        mFavoritBtn = (Button) findViewById(R.id.activity_favorit_btn);
        mFavoritBtn.setOnClickListener(new View.OnClickListener() {

       @Override
       public void onClick(View v) {

        }
        });

        }

public void back(View v) {    //pour retourner à l’activite principale on appel la methode finish()
        // qui vas tuer cette activite

        finish();

        }
        }

}
