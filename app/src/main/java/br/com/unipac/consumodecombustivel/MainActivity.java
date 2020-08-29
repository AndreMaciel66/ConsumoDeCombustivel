package br.com.unipac.consumodecombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText distanciaEdt;
    EditText litrosEd;
    Button calcularMediaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         distanciaEdt = (EditText) findViewById(R.id.distanciaEdt);
         litrosEd = (EditText) findViewById(R.id.litrosEdt);
         calcularMediaBtn = (Button) findViewById(R.id.calcularMediaBtn);

        calcularMediaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double distancia = Double.parseDouble(distanciaEdt.getText().toString());
                double litros = Double.parseDouble(litrosEd.getText().toString());

                double media = getMedia(distancia, litros);

                String resultado = "O calculo da média de consumo de Combustivel é " + media + " u.d/litros";
                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_LONG).show();
            }
        });
    }

    private double getMedia(double distancia, double litros) {
        return distancia / litros;
    }

    //TRabalho para sexta dia 04/09/2020
    //String resultado =  null;
    // double media = valorEtanol / valor da gasolina
    //if (media > 0.7) {
    // resultado = "O calculo da média de consumo de Combustivel é " + media + " u.d/litros";
    //} else {
    // resultado = "O calculo da média de consumo de Combustivel é " + media + " u.d/litros";
    //}
   // Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_LONG).show();
}