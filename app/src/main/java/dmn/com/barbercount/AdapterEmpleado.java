package dmn.com.barbercount;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import DTOs.EmpleadoDTO;
import Entidades.Empleado;

/**
 * Created by ocamp on 11/08/2016.
 */
public class AdapterEmpleado extends BaseAdapter {

    protected Activity activity;

    protected ArrayList<EmpleadoDTO> items;

    public AdapterEmpleado(Activity activity, ArrayList<EmpleadoDTO> items){
        this.activity = activity;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemlista, null);
        }
        // Creamos un objeto de la clase Datos
        EmpleadoDTO emp = items.get(position);
        //Rellenamos la fotografia
        ImageView foto = (ImageView) v.findViewById(R.id.img_foto);
        foto.setImageDrawable(emp.getFoto());
        //Rellenamos el nombre
        TextView nombreCompleto = (TextView) v.findViewById(R.id.txtNombreCompleto);
        nombreCompleto.setText(emp.getNombreCompleto());
        return v;




    }
}
