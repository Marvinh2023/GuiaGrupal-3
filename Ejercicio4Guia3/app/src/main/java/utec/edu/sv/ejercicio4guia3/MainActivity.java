package utec.edu.sv.ejercicio4guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtNum;
    TextView tv1,tv2;
    Integer contador = 0, pares = 0;
    Integer numPositivos = 0,  numNegativos = 0, cantMultiplos = 0;

    Button agregar;

    String data1="", data2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum = findViewById(R.id.edtNumber);
        tv1 = findViewById(R.id.tvTotalIngresado);
        tv2 = findViewById(R.id.tvResultado);
        agregar = findViewById(R.id.button);
    }

    public void procesar(View view){

        String data = edtNum.getText().toString();

        Integer num = Integer.parseInt(data);
        double resul;

        if(num < 0 ){
            numNegativos++;
        }else{
            numPositivos++;
            if(num % 2 == 0){
                pares = pares + num;
            }
            resul = num%15;
            if(resul == 0){
                cantMultiplos++;
            }
        }
        contador++;
        tv1.setText("Cantidad de numeros ingresados: "+contador.toString());
        tv2.setText("Total numeros positivos: "+numPositivos+"\nTotal numeros negativos: "+numNegativos+"\nLa suma de numeros pares es: "+pares+"\nCantidad de numeros multiplo de 15: "+cantMultiplos);
        if(contador == 10){
            agregar.setEnabled(true);
        }
    }
}