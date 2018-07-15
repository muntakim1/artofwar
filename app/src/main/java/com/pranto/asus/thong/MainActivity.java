package com.pranto.asus.thong;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
public class MainActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,
    cardView11,cardView12,cardView13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView1=(CardView)findViewById(R.id.chapter1);
        cardView2=(CardView)findViewById(R.id.chapter2);
        cardView3=(CardView)findViewById(R.id.chapter3);
        cardView4=(CardView)findViewById(R.id.chapter4);
        cardView5=(CardView)findViewById(R.id.chapter5);
        cardView6=(CardView)findViewById(R.id.chapter6);
        cardView7=(CardView)findViewById(R.id.chapter7);
        cardView8=(CardView)findViewById(R.id.chapter8);
        cardView9=(CardView)findViewById(R.id.chapter9);
        cardView10=(CardView)findViewById(R.id.chapter10);
        cardView11=(CardView)findViewById(R.id.chapter11);
        cardView12=(CardView)findViewById(R.id.chapter12);
        cardView13=(CardView)findViewById(R.id.chapter13);

        toolbar=(Toolbar)findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);
        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.colapsetoolbar);
        collapsingToolbarLayout.setTitle(" ");
        AppBarLayout appBarLayout=(AppBarLayout)findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow=false;
            int scrollRange=-1;
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if(scrollRange==-1){
                    scrollRange=appBarLayout.getTotalScrollRange();
                }
                if (scrollRange+verticalOffset==0){
                    collapsingToolbarLayout.setTitle(getString(R.string.app_name));
                    isShow=true;
                }
                else if(isShow){
                    collapsingToolbarLayout.setTitle(" ");
                    isShow=false;
                }
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapteroneActivity.class));
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterTowActivity.class));
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterThreeActivity.class));
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterFourActivity.class));
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterFiveActivity.class));
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterSixActivity.class));
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterSevenActivity.class));
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterEightActivity.class));
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterNineActivity.class));
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterTenActivity.class));
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterelevenActivity.class));
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChaptertwelveActivity.class));
            }
        });
        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChapterthirteenActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if(id==R.id.telafrnd){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_SUBJECT,new String[]{"Read Art Of War"});
            intent.setType("message/rfc822");
            startActivity(intent.createChooser(intent, "Choose a app..."));
        }
        else if (id==R.id.exit){
            System.exit(0);
        }
        else if(id==R.id.ratethis){
            startActivity(new Intent(MainActivity.this,About.class));

        }
        return super.onOptionsItemSelected(item);

    }
}
