package edu.tecii.android.sumanumeros1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText NumeroEntero;
    private TextView Resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumeroEntero=(EditText)findViewById(R.id.edt1);
        Resultado= (TextView)findViewById(R.id.txt2);

    }
        public void sumatoria (View view){
            String valor=NumeroEntero.getText().toString();
            int numero1=Integer.parseInt(valor);
            int suma = numero1* (numero1 + 1) / 2;
            String resu = "la suma de los " + numero1 + "primeros numeros enteros es: " + suma;
            Resultado.setText(resu);
        }
}

