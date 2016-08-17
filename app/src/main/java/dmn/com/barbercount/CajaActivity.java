package dmn.com.barbercount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import DTOs.ServicioDTO;
import Entidades.DetalleVenta;
import Entidades.Producto;

public class CajaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja);



        ArrayList<DetalleVenta> ListaDetalleVenta = new ArrayList<DetalleVenta>();

        ListView lista = (ListView) findViewById(R.id.listaServiciosCaja);
        ArrayList<Producto> servicios = new ArrayList<Producto>();
        Producto servicio;

        servicio = new Producto("15140","Corte de Cabello",60);
        servicios.add(servicio);
        servicio = new Producto("15141","Corte de Barba",30);
        servicios.add(servicio);
        // Crea el adapter personalizado
        AdapterCaja adapter = new AdapterCaja(this, R.layout.itemserviciocaja,servicios);

        View header = (View)getLayoutInflater().inflate(R.layout.header_caja,null);
        lista.addHeaderView(header);
        //Lo aplico
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView v = (TextView)view.findViewById(R.id.txtDescripcion);
                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
            }
        });





    }
}
