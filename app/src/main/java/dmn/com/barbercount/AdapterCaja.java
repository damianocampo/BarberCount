package dmn.com.barbercount;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import DTOs.ServicioDTO;
import Entidades.Producto;

/**
 * Created by ocamp on 15/08/2016.
 */
public class AdapterCaja extends ArrayAdapter<Producto> {

    Context Context;
    int LayoutResourceId;
    List<Producto> Productos;

    public AdapterCaja(Context context, int layoutResourceId, List<Producto> productos){

        super(context, layoutResourceId, productos);

        this.Context = context;
        this.LayoutResourceId = layoutResourceId;
        this.Productos = productos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        ProductoHolder holder;
        if(row == null){
            LayoutInflater inflater = ((Activity)Context).getLayoutInflater();
            row = inflater.inflate(LayoutResourceId,parent,false);
            holder = new ProductoHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagen);
            holder.texto = (TextView) row.findViewById(R.id.txtDescripcion);
            row.setTag(holder);
        }else {

            holder= (ProductoHolder)row.getTag();
        }
        Producto producto = Productos.get(position);
        holder.texto.setText(producto.getNombre());
        //holder.imagen.setImageResource(producto.get);
        return row;
    }

    static class ProductoHolder{
        ImageView imagen;
        TextView texto;

    }
//    protected Activity activity;
//
//    protected ArrayList<ServicioDTO> items;
//
//    public AdapterCaja(Activity activity, ArrayList<ServicioDTO> items){
//        this.activity = activity;
//        this.items = items;
//    }
//
//    @Override
//    public int getCount() {
//        return items.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return items.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return items.get(position).getId();
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//
//        View row = convertView;
//        if(row == null){
//            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            row = inf.inflate(R.layout.itemserviciocaja, null);
//        }
//        // Creamos un objeto de la clase Datos
//        ServicioDTO ser = items.get(position);
//        //Rellenamos el nombre
//        TextView serv = (TextView) row.findViewById(R.id.txtDescripcion);
//        serv.setText(ser.getNombreServicio() + " "+ ser.getPrecio());
//        return row;
//
//    }


}
