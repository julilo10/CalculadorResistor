package com.example.usuario.calculadorresistor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tResultado,tNegro2,tNegro3,tLinea1,tLinea2,tMultiplicador,tTolerancia, tCafe1,tCafe2,tCafe3,tCafe4,tRojo1,tRojo2,tRojo3,tRojo4,tNaranjado1,tNaranjado2,tNaranjado3;
    TextView tAmarillo1,tAmarillo2,tAmarillo3,tVerde1,tVerde2,tVerde3,tVerde4,tAzul1,tAzul2,tAzul3,tAzul4, tMorado1,tMorado2,tMorado3,tMorado4,tGris1,tGris2,tGris3,tGris4,tBlanco1,tBlanco2,tBlanco3;
    TextView tDorado3,tDorado4,tPlateado3,tPlateado4;
    String termino1="", termino2="", termino4="", acumulador="";
    Double termino3=0.0, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tLinea1=findViewById(R.id.tLinea1);
        tLinea2=findViewById(R.id.tLinea2);
        tMultiplicador=findViewById(R.id.tMultiplicador);
        tTolerancia=findViewById(R.id.tTolerancia);
        tResultado=findViewById(R.id.tResultado);
        tNegro2=findViewById(R.id.tNegro2);
        tNegro3=findViewById(R.id.tNegro3);
        tCafe1=findViewById(R.id.tCafe1);
        tCafe2=findViewById(R.id.tCafe2);
        tCafe3=findViewById(R.id.tCafe3);
        tCafe4=findViewById(R.id.tCafe4);
        tRojo1=findViewById(R.id.tRojo1);
        tRojo2=findViewById(R.id.tRojo2);
        tRojo3=findViewById(R.id.tRojo3);
        tRojo4=findViewById(R.id.tRojo4);
        tNaranjado1=findViewById(R.id.tNaranjado1);
        tNaranjado2=findViewById(R.id.tNaranjado2);
        tNaranjado3=findViewById(R.id.tNaranjado3);
        tAmarillo1=findViewById(R.id.tAmarillo1);
        tAmarillo2=findViewById(R.id.tAmarillo2);
        tAmarillo3=findViewById(R.id.tAmarillo3);
        tVerde1=findViewById(R.id.tVerde1);
        tVerde2=findViewById(R.id.tVerde2);
        tVerde3=findViewById(R.id.tVerde3);
        tVerde4=findViewById(R.id.tVerde4);
        tAzul1=findViewById(R.id.tAzul1);
        tAzul2=findViewById(R.id.tAzul2);
        tAzul3=findViewById(R.id.tAzul3);
        tAzul4=findViewById(R.id.tAzul4);
        tMorado1=findViewById(R.id.tMorado1);
        tMorado2=findViewById(R.id.tMorado2);
        tMorado3=findViewById(R.id.tMorado3);
        tMorado4=findViewById(R.id.tMorado4);
        tGris1=findViewById(R.id.tGris1);
        tGris2=findViewById(R.id.tGris2);
        tGris3=findViewById(R.id.tGris3);
        tGris4=findViewById(R.id.tGris4);
        tBlanco1=findViewById(R.id.tBlanco1);
        tBlanco2=findViewById(R.id.tBlanco2);
        tBlanco3=findViewById(R.id.tBlanco3);
        tDorado3=findViewById(R.id.tDorado3);
        tDorado4=findViewById(R.id.tDorado4);
        tPlateado3=findViewById(R.id.tPlateado3);
        tPlateado4=findViewById(R.id.tPlateado4);
    }

    public void columna1(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tCafe1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.maroon));
                termino1 = "1";
                break;
            case R.id.tRojo1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.red));
                termino1 = "2";
                break;
            case R.id.tNaranjado1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.orange));
                termino1 = "3";
                break;
            case R.id.tAmarillo1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.yellow));
                termino1 = "4";
                break;
            case R.id.tVerde1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.green));
                termino1 = "5";
                break;
            case R.id.tAzul1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.blue));
                termino1 = "6";
                break;
            case R.id.tMorado1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                termino1 = "7";
                break;
            case R.id.tGris1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.gray));
                termino1 = "8";
                break;
            case R.id.tBlanco1:
                tLinea1.setBackgroundColor(getResources().getColor(R.color.ivory));
                termino1 = "9";
                break;
        }
        acumulador=termino1+termino2;
        resultado=Double.parseDouble(acumulador);
        tResultado.setText(Double.toString(resultado)+ "Ω" +termino4.toString());
    }

    public void columna2(View view) {

        int id=view.getId();
        switch (id){
            case R.id.tNegro2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.black));
                termino2="0";
                break;
            case R.id.tCafe2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.maroon));
                termino2="1";
                break;
            case R.id.tRojo2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.red));
                termino2="2";
                break;
            case R.id.tNaranjado2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.orange));
                termino2="3";
                break;
            case R.id.tAmarillo2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.yellow));
                termino2="4";
                break;
            case R.id.tVerde2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.green));
                termino2="5";
                break;
            case R.id.tAzul2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.blue));
                termino2="6";
                break;
            case R.id.tMorado2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                termino2="7";
                break;
            case R.id.tGris2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.gray));
                termino2="8";
                break;
            case R.id.tBlanco2:
                tLinea2.setBackgroundColor(getResources().getColor(R.color.ivory));
                termino2="9";
                break;
        }
        acumulador=termino1+termino2;
        resultado=Double.parseDouble(acumulador);
        tResultado.setText(Double.toString(resultado)+"Ω"+termino4.toString());
    }

    public void columna3(View view) {

        int id=view.getId();
        switch (id){
            case R.id.tNegro3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.black));
                termino3=1.0;
                break;
            case R.id.tCafe3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.maroon));
                termino3=10.0;
                break;
            case R.id.tRojo3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.red));
                termino3=100.0;
                break;
            case R.id.tNaranjado3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.orange));
                termino3=1000.0;
                break;
            case R.id.tAmarillo3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.yellow));
                termino3=10000.0;
                break;
            case R.id.tVerde3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.green));
                termino3=100000.0;
                break;
            case R.id.tAzul3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.blue));
                termino3=1000000.0;
                break;
            case R.id.tMorado3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                termino3=10000000.0;
                break;
            case R.id.tGris3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.gray));
                termino3=100000000.0;
                break;
            case R.id.tBlanco3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.ivory));
                termino3=1000000000.0;
                break;
            case R.id.tDorado3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.darkgoldenrod));
                termino3=0.1;
                break;
            case R.id.tPlateado3:
                tMultiplicador.setBackgroundColor(getResources().getColor(R.color.silver));
                termino3=0.01;
                break;
        }
        if(!termino1.equals("")&&!termino2.equals("")){
            acumulador=termino1+termino2;
            resultado=Double.parseDouble(acumulador)*termino3;
            tResultado.setText(Double.toString(resultado)+"Ω"+termino4.toString());
        }
    }

    public void columna4(View view) {
        int id=view.getId();
        switch (id){
            case R.id.tCafe4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.maroon));
                termino4="±1%";
                break;
            case R.id.tRojo4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.red));
                termino4="±2%";
                break;
            case R.id.tVerde4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.green));
                termino4="±0.5%";
                break;
            case R.id.tAzul4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.blue));
                termino4="±0.25%";
                break;
            case R.id.tMorado4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.darkgreen));
                termino4="±0.1%";
                break;
            case R.id.tGris4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.gray));
                termino4="±0.05%";
                break;
            case R.id.tDorado4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.darkgoldenrod));
                termino4="±5%";
                break;
            case R.id.tPlateado4:
                tTolerancia.setBackgroundColor(getResources().getColor(R.color.silver));
                termino4="±10%";
                break;
        }
        if(!termino1.equals("")&&!termino2.equals("")&&termino3!=0.0){
            acumulador=termino1+termino2;
            resultado=Double.parseDouble(acumulador)*termino3;
            tResultado.setText(Double.toString(resultado)+"Ω"+termino4.toString());
        }
    }
}