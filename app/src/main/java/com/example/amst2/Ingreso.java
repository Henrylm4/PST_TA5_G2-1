package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ingreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
    }
    public void ingresara(View view) {
        EditText et1 =  findViewById(R.id.user);
        EditText et2 =  findViewById(R.id.password);
        try{
            if (et1.getText().toString().equals("GRUPO2PST")){
                if (et2.getText().toString().equals("GRUPO2PST")){

                Intent i = new Intent(this, MenuPelis.class );
                i.putExtra("usuario", et1.getText().toString());
                startActivity(i);        }

            }
            else{
                Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
