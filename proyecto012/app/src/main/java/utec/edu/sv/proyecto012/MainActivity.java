package utec.edu.sv.proyecto012;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.tv1);
    }

    public void ver(View v){
        Intent i = new Intent(this, Actividad2.class);
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }
}