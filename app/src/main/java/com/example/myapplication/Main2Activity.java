package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.LinearGradient;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {
    LinearLayout ll;
    LinearLayout ll1;
    CheckBox cb;
    CheckBox cb1;
    private Button pogodi;
    int najveci=0;
    String kljuc;
    Map<String, Integer> likovi = new HashMap<String, Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        likovi.put("Sam",0);
        likovi.put("Frodo",0);
        likovi.put("Pipin",0);
        likovi.put("Mary",0);
        likovi.put("Aragorn",0);
        likovi.put("Boromir",0);
        likovi.put("Gimli",0);
        likovi.put("Legolas",0);
        likovi.put("Gandalf",0);


        ll=(LinearLayout) findViewById(R.id.ll);
        ArrayList<String> rasa=new ArrayList<String>();
        rasa.add("hobit");
        rasa.add("vilenjak");
        rasa.add("čovjek");
        rasa.add("patuljak");
        rasa.add("goblin");
        rasa.add("uruk");
        rasa.add("ainur");
        rasa.add("ent");

        for(int i =0; i<rasa.size();i++){
            cb=new CheckBox(this);
            cb.setId(i);
            cb.setText(rasa.get(i));
            cb.setOnClickListener(getOnClick1(cb));
            ll.addView(cb);
        }

        ll1=(LinearLayout) findViewById(R.id.ll1);
        ArrayList<String> zanimanje=new ArrayList<String>();
        zanimanje.add("vrtlar");
        zanimanje.add("strijelac");
        zanimanje.add("graničar");
        zanimanje.add("ratnik");
        zanimanje.add("čarobnjak");
        zanimanje.add("nosi prsten");
        zanimanje.add("kapetan/general");
        zanimanje.add("ostalo");

        for(int i =0; i<zanimanje.size();i++){
            cb1=new CheckBox(this);
            cb1.setId(i);
            cb1.setText(zanimanje.get(i));
            cb1.setOnClickListener(getOnClick2(cb1));
            ll1.addView(cb1);
        }

        Button pogodi=findViewById(R.id.pogodi);
        pogodi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(Map.Entry<String, Integer> i : likovi.entrySet()) {
                    if (i.getValue() >= najveci) {
                        najveci = i.getValue();
                        kljuc = i.getKey();
                    }
                }

                Context context = getApplicationContext();
                CharSequence text = kljuc;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    View.OnClickListener getOnClick1(final Button button){
        return new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                if(button.getId()==0){
                    likovi.put("Sam", likovi.containsKey("Sam") ? likovi.get("Sam") + 1 : 1);
                    likovi.put("Pipin", likovi.containsKey("Pipin") ? likovi.get("Pipin") + 1 : 1);
                    likovi.put("Frodo", likovi.containsKey("Frodo") ? likovi.get("Frodo") + 1 : 1);
                    likovi.put("Mary", likovi.containsKey("Mary") ? likovi.get("Mary") + 1 : 1);
                }
                if(button.getId()==1){
                    likovi.put("Legolas", likovi.containsKey("Legolas") ? likovi.get("Legolas") + 1 : 1);
                }
                if(button.getId()==2){
                    likovi.put("Aragorn", likovi.containsKey("Aragorn") ? likovi.get("Aragorn") + 1 : 1);
                    likovi.put("Boromir", likovi.containsKey("Boromir") ? likovi.get("Boromir") + 1 : 1);
                }
                if(button.getId()==3){
                    likovi.put("Gimli", likovi.containsKey("Gimli") ? likovi.get("Gimli") + 1 : 1);
                }
                if(button.getId()==6){
                    likovi.put("Gandalf", likovi.containsKey("Gandalf") ? likovi.get("Gandalf") + 1 : 1);
                }
            }
        };
    }
    View.OnClickListener getOnClick2(final Button button){
        return new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                if(button.getId()==0){
                    likovi.put("Sam", likovi.containsKey("Sam") ? likovi.get("Sam") + 1 : 1);
                }
                if(button.getId()==1){
                    likovi.put("Legolas", likovi.containsKey("Legolas") ? likovi.get("Legolas") + 1 : 1);
                }
                if(button.getId()==2){
                    likovi.put("Aragorn", likovi.containsKey("Aragorn") ? likovi.get("Aragorn") + 1 : 1);
                }
                if(button.getId()==3){
                    likovi.put("Gimli", likovi.containsKey("Gimli") ? likovi.get("Gimli") + 1 : 1);
                }
                if(button.getId()==4){
                    likovi.put("Gandalf", likovi.containsKey("Gandalf") ? likovi.get("Gandalf") + 1 : 1);
                }
                if(button.getId()==5){
                    likovi.put("Frodo", likovi.containsKey("Frodo") ? likovi.get("Frodo") + 1 : 1);
                }
                if(button.getId()==6){
                    likovi.put("Boromir", likovi.containsKey("Boromir") ? likovi.get("Boromir") + 1 : 1);
                }
                if(button.getId()==7){
                    likovi.put("Marry", likovi.containsKey("Marry") ? likovi.get("Marry") + 1 : 1);
                    likovi.put("Pippin", likovi.containsKey("Pippin") ? likovi.get("Pippin") + 1 : 1);
                }
            }
        };
    }


}
