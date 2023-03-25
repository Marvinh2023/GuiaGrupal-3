package sv.edu.utec.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNums;
    TextView twResp;
    TextView twNumerosAgregados;
    Button btnAgregarn;
    Button btnclear;

    int numsAgregados = 0, suma = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNums = findViewById(R.id.edtNumeros);
        twResp = findViewById(R.id.twRespuesta);
        twNumerosAgregados = findViewById(R.id.twNumsAgregados);
        btnAgregarn = findViewById(R.id.btnAgregarNums);
        btnclear = findViewById(R.id.btnClear);
    }
    public void Agregar(View view){
        int numeros, resp;

        numeros = Integer.parseInt(edtNums.getText().toString());

        if (numsAgregados > 4){
            suma =suma + numeros;
        }
        numsAgregados++;

        twNumerosAgregados.setText("Los numeros agregados son: " + String.valueOf(numsAgregados));

        if (numsAgregados > 9){
            btnAgregarn.setEnabled(false);
            twResp.setText(String.valueOf(suma));
        }
    }
    public void Clear(View view){
        btnAgregarn.setEnabled(true);
        edtNums.setText("");
        twNumerosAgregados.setText("");
        twResp.setText("");
    }

}