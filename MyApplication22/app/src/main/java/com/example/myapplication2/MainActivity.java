package com.example .myapplication2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    ImageView resim; //RESİMLERİ UYGULAMA İÇİNDE GÖSTERMEYİ SAĞLAR.
    Button göster;//GÖSTER ADINDA BUTON TANIMLADIM.
    Button gizle; //GİZLE ADINDA BUTON TANIMLADIM.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //BİR AKTİVİTE BAŞLATILDIĞINDA ARKA PLANDA DEVREYE GİREN İLK METOD.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resim = (ImageView)findViewById(R.id.imageView);
        //RESMİ RES DOSYASININ ALTINDAKİ DRAWBLE KISMINDA DOSYAYI BULMAYI SAĞLAR.
        göster = (Button)findViewById(R.id.button2);
        //BUTON 2 Yİ KODDA HIZLI BULMAMIMIZI SAĞLAR.
        //GÖSTER BUTONUNA BUTON 2 Yİ ATADIM.
        gizle = (Button)findViewById(R.id.button1);
        //BUTON 1 İ KODDA HIZLI BULMAMIZI SAĞLAR.
        //GİZLE BUTONUNA BUTON 1 Yİ ATADIM.

        gizle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //onCLİCK BUTONA AKTİF BİR ŞEKİLDE BASMAYI SAĞLAR.

                resim.setVisibility(View.INVISIBLE);
                //RESMİ KODDA SAKLAR.
                gizle.setVisibility(View.INVISIBLE);
                //INVISIBLE KODDA GÖRÜNMEMEYİ SAĞLAR.
                göster.setVisibility(View.VISIBLE);
                //VISIBLE GÖRÜNMEYİ SAĞLAR.
                //GÖSTER BUTONUNU KODDA GÖSTERMEYİ SAĞLADI.
            }
        });

        göster.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                resim.setVisibility(View.VISIBLE);
                göster.setVisibility(View.INVISIBLE);
                gizle.setVisibility(View.VISIBLE);
            }
        });
    }
}

