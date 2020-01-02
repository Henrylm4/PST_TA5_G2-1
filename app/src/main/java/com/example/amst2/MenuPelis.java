package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuPelis extends AppCompatActivity {

    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pelis);

        Bundle bundle = getIntent().getExtras();
        TextView et1 = findViewById(R.id.infonombre);
        et1.setText(bundle.getString("usuario"));

    }

    //botones qque llevaran a una url de imBD para mostrar info de la pelicula seleccionada

    public void Spidermanffh(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film978970.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void AvengersEG(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film993884.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void CapMarvel(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film347261.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void AntWasp(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film941845.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void AvengersIW(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film827414.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void BlackPanther(View view) {
        url="https://www.filmaffinity.com/es/film805562.html";
        Intent i = new Intent(this, InfoPeli.class );
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void ThorRagnarok(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film546383.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void SpidermanHC(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film478990.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void AvengersAU(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film486156.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void GuardianesGalaxiaV2(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film406284.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void DrStrange(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film406284.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

    public void CivilWar(View view) {
        Intent i = new Intent(this, InfoPeli.class );
        url="https://www.filmaffinity.com/es/film712492.html";
        i.putExtra("url",url);
        Bundle bundle = getIntent().getExtras();
        i.putExtra("usuario", bundle.getString("usuario"));
        startActivity(i);

    }

}
