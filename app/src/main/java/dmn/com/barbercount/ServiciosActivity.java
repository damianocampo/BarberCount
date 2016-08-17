package dmn.com.barbercount;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import DTOs.ServicioDTO;

/**
 * Created by Ismael on 12/08/2016.
 */
public class ServiciosActivity extends AppCompatActivity {
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
                Toast.makeText(getApplicationContext(), "Producto", Toast.LENGTH_LONG).show();
//                Intent act = new Intent(getActivity(),BarberoActivity.class);
//                startActivity(act);
            }
        });

        ListView lista = (ListView) findViewById(R.id.listaBarberos);
        ArrayList<ServicioDTO> servicios = new ArrayList<ServicioDTO>();
        ServicioDTO servicio;



//        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
//               // String yourData = temparr.get(position);
//                Toast.makeText(getApplicationContext(), "Agregado " +position, Toast.LENGTH_LONG).show();
//            }
//        });



        servicio = new ServicioDTO(1, getResources().getDrawable(R.drawable.barbers_chair), "Corte de pelo", 50);
        servicios.add(servicio);
        servicio = new ServicioDTO(2, getResources().getDrawable(R.drawable.barbers_chair), "Corte barba", 20);
        servicios.add(servicio);

        // Crea el adapter personalizado
        AdapterServicio adapter = new AdapterServicio(this, servicios);
        //Lo aplico
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // selected item
                String selected = ((TextView) view.findViewById(R.id.txtNombreServicio)).getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}