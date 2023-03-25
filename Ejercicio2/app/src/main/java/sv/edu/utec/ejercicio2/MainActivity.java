package sv.edu.utec.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNum;
    TextView twMsj;
    Button btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum = findViewById(R.id.edtNumero);
        twMsj = findViewById(R.id.twMensaje);
        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText("");
                twMsj.setText("");
            }
        });
    }

    public void Mensaje(View view){
        int numero;
        String mensaje = " ";

        numero = Integer.parseInt(edtNum.getText().toString());

        if (numero >= 0 && numero <=9){
            mensaje = "El numero " + numero + " Es de 1 cifra";
        } else if (numero >= 10 && numero <=99) {
            mensaje = "El numero " + numero + " Es de 2 cifras";
        } else if (numero >=100 && numero <=999) {
            mensaje = "El numero " + numero + " Es de 3 cifras";
        } else
            mensaje = "¡¡ERROR!! " + "El numero " + numero + " Es de 4 cifras";

        twMsj.setText(String.valueOf(mensaje));

    }

}