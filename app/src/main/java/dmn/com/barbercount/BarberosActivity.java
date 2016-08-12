package dmn.com.barbercount;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import DTOs.EmpleadoDTO;

public class BarberosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barberos);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.addBarber);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
              Toast.makeText(getApplicationContext(),"Acccion desde el boton",Toast.LENGTH_LONG).show();
//                Intent act = new Intent(getActivity(),BarberoActivity.class);
//                startActivity(act);
            }
        });


        ListView lista = (ListView) findViewById(R.id.listaBarberos);
        ArrayList<EmpleadoDTO> empleados = new ArrayList<EmpleadoDTO>();
        EmpleadoDTO empleado;

        empleado = new EmpleadoDTO(getResources().getDrawable(R.drawable.barbers_chair),"Arturo Damian Ocampo","ocampo.damian@hotmail.com");
        empleados.add(empleado);
        empleado = new EmpleadoDTO(getResources().getDrawable(R.drawable.barbers_chair),"Ismael Galan","icazares@trapichar.com");
        empleados.add(empleado);

        // Crea el adapter personalizado
        AdapterEmpleado adapter = new AdapterEmpleado(this, empleados);
        //Lo aplico
        lista.setAdapter(adapter);
    }
}
