package dmn.com.barbercount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent principal = new Intent(MainActivity.this, NavActivity.class);
                startActivity(principal);
//                String usuario = ((EditText)findViewById(R.id.txtUsuario)).getText().toString();
//                String contra = ((EditText) findViewById(R.id.txtContra)).getText().toString();
//                if(usuario.equals("ocampo.arturodamian@gmail.com")&& contra.equals("ocampo") || usuario.equals("ismael.gc.91@gmail.com")&& contra.equals("12345")){
//
//
//                }else{
//                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecta",Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}
