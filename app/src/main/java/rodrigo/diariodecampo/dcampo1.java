package rodrigo.diariodecampo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class dcampo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcampo1);
        Intent intent = getIntent();
        String extra = intent.getStringExtra("diario");
        Toast.makeText(this,"este es el dato " + extra, Toast.LENGTH_LONG ).show();

    }
    public void  ANTERIOR (View ANTERIOR) {
        Intent intent = new Intent(this, DCAMPO.class);
        intent.putExtra("diario","VA PARA ATRAS");
        startActivity(intent);



    }
    }
