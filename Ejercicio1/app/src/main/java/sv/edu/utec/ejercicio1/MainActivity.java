package sv.edu.utec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumero;
    Button btnMostrar, btnLimpiar;
    TextView twResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero = findViewById(R.id.edtNumero);
        twResultado = findViewById(R.id.txvResultado);
        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumero.setText("");
                twResultado.setText("");
            }
        });
    }

    public void Resultado(View view){
        int numero;
        String resultado = " ";

        numero = Integer.parseInt(etNumero.getText().toString());

        if (numero == 0){
            resultado = ("El numero " + numero + " es neutro");
        } else if (numero > 0 ) {
            resultado = ("El numero " + numero +  " es positivo");
        }else
            resultado = "El numero " + numero + " es negativo";

        twResultado.setText(String.valueOf(resultado));
    }
}