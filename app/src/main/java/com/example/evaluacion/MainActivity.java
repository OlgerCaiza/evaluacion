package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //llenar el combo box
        //Paso 1 Data
        final String[] datos =
                new
                        String[]{"Alojamiento","Alimentacion y Bebidas","Elem3","Elem4","Elem5"};
        //Paso 2 adaptador
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        //paso 3 Lista
       Spinner cmbOpciones = (Spinner)findViewById(R.id.cmdOpciones);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);


       //paso1
        final String[] datos2 =
                new
                        String[]{"Alojamiento","Alimentacion y Bebidas","Elem3","Elem4","Elem5"};

        //paso 2
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos2);


        //paso 3
        ListView lstOpciones = (ListView)findViewById(R.id.lstLugaresT);
        lstOpciones.setAdapter(adaptadornoticias);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView datoSelect = (TextView) findViewById(R.id.selectDatos);
        datoSelect.setText("Datos Selecto: "+parent.getItemAtPosition(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
}