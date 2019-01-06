package com.branderdokan;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.multidex.MultiDex;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import java.net.URI;

public class MainActivity extends Activity {




    InterstitialAd mInterstitialAd ;
    private InterstitialAd interstitial;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });


    }


 public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }



    public void browser(View view){
        Intent intent = null , chooser = null;
        switch (view.getId()){

            case R.id.imageButtonA:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ecstasybd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }

            case R.id.imageButtonB:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bibianaoutlet.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonC:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.richmanbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonD:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.rang-bd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonE:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.aarong.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonF:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://kaykraft.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonG:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.dorjibaribd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonH:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.anjans.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonI:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.catseye.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
            case R.id.imageButtonJ:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.yellowclothing.net/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }



            case R.id.imageButton1:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.infinitymegamall.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton2:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://menzklub.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton3:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.pinterest.com/pin/355995545517158509/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton4:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/pg/Dressy-Dale-543279362417703/photos/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton5:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/Ahangfashion/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton6:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.lerevecraze.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton7:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.banglarmela.org/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton8:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.fitelegance.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton9:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.foringbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton10:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://menzklub.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton11:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(""));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton12:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.freeland.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton13:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.easyfashion.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton14:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://sadakalo.net/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton15:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/countryboybd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton16:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://nogordolabd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton17:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.deshal.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton18:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.foringbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton19:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.shoishobbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton20:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://grameenuniqlo.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton21:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://h-office.com/portfolios/jatra/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton22:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://smartex-bd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton23:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.texmartfashion.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;

            case R.id.imageButton24:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://zaarafashions.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton25:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.doors-fashion.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;

            case R.id.imageButton26:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://trendzbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton27:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/clothings.sailor/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton28:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.bibianaoutlet.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton29:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.zariffashion.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton30:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.vasavifashions.com.bd/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;
            case R.id.imageButton31:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://lubnanbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;

            case R.id.imageButton33:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(" http://www.shoppersbd.com/"));
                chooser = Intent.createChooser(intent, "শপিং এর দোকান  কোন ব্রাউসার দিয়ে দেকবেন?");
                if (intent.resolveActivity(getPackageManager()) !=null ){
                    startActivity(chooser);

                }
                break;




        }



    }

}
