package com.innerglow.dosugnavigator;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.innerglow.dosugnavigator.libs.SessionMngr;

/**
 * Created by innerglowitsolutions on 07/08/14.
 */
public class HomeActivity extends Activity {
    //	UserFunctions userFunctions;
	Button btnLogout;
    ImageButton btnAA, btnBB, btnCC, btnDD, btnEE, btnFF, btnGG, btnHH, btnII;
    TextView Txt_app_name;
//    public int uid;

    SessionMngr session;

//    Account account = new Account();

    Context context;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setIcon(android.R.color.transparent);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        session = new SessionMngr(getApplicationContext());
//        uid = session.getIntValues("uid");
//
//        instagramSession = new InstagramSession(this);

        context = this;

        setContentView(R.layout.activity_home);
//        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        overridePendingTransition(R.anim.activity_open_translate,R.anim.activity_close_scale);
        btnAA =(ImageButton)findViewById(R.id.btnA);
//        Animation vanish = AnimationUtils.loadAnimation(this, R.anim.vanish);
//        findViewById(R.id.btnA).startAnimation(vanish);
        btnBB =(ImageButton)findViewById(R.id.btnB);
        btnCC =(ImageButton)findViewById(R.id.btnC);
        btnDD =(ImageButton)findViewById(R.id.btnD);
        btnEE =(ImageButton)findViewById(R.id.btnE);
//        findViewById(R.id.btnE).startAnimation(vanish);
        btnFF =(ImageButton)findViewById(R.id.btnF);
        btnGG =(ImageButton)findViewById(R.id.btnG);
        btnHH =(ImageButton)findViewById(R.id.btnH);
        btnII =(ImageButton)findViewById(R.id.btnI);
        btnLogout = (Button)findViewById(R.id.btnLogout);
//        findViewById(R.id.btnI).startAnimation(vanish);
        Txt_app_name = (TextView) findViewById(R.id.app_name);


//        DpsControlApplication.exception_handler(this);
//        String user = session.getStringValues("userName");

        Typeface type = Typeface.createFromAsset(this.getAssets(), "arlekino.TTF");
        Txt_app_name.setTypeface(type, Typeface.BOLD);


        btnAA.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnBB.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnCC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnDD.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent4 = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(myintent4);

            }
        });
        btnDD.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnDD.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnEE.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnFF.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnGG.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnHH.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
        btnII.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);

            }
        });
//        Button btnLogout = (Button) findViewById(R.id.btnLogout);
//        btnLogout.setOnClickListener( new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//            }
//        });

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        //closing transition animations
        overridePendingTransition(R.anim.activity_open_scale,R.anim.activity_close_translate);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/

    //  show the language selection in menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item4:
            {
                MyPlaces();

            }
            Toast.makeText(this, "My Places", Toast.LENGTH_SHORT).show();
            return true;
            case R.id.item5:
            {
                Map();

            }
            Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();
            return true;
            case R.id.item6:
            {
                AboutUs();

            }
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    protected void MyPlaces()
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    protected void Map()
    {
        Intent i = new Intent(this, MapActivity.class);
        startActivity(i);

    }
    protected void AboutUs()
    {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle(getResources().getString(R.string.exit))
//                .setMessage("Are you sure you want to exit?")    getResources().getString(R.string.loading)
                .setMessage(getResources().getString(R.string.app_exit))
                .setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton(getResources().getString(R.string.no), null).show();
    }

}