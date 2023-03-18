package utec.edu.sv.ejercicio5guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtv1,edtv2,edtv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtv1 = findViewById(R.id.edtA);
        edtv2 = findViewById(R.id.edtB);
        edtv3 = findViewById(R.id.edtC);
    }

    public void Procesar(View view){
        Integer v1, v2, v3;
        v1 = Integer.parseInt(edtv1.getText().toString());
        v2 = Integer.parseInt(edtv2.getText().toString());
        v3 = Integer.parseInt(edtv3.getText().toString());

        if((v1 == v2) && (v1 == v3) && (v2 == v3)){
            Intent a = new Intent(this, Equilatero.class );
            startActivity(a);
        }else if(v1 == v2){
            Intent b = new Intent(this, Isosceles.class );
            startActivity(b);
        }else{
            Intent c = new Intent(this, Escaleno.class );
            startActivity(c);
        }
    }
}