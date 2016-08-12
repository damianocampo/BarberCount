package dmn.com.barbercount;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import DTOs.EmpleadoDTO;
import Entidades.Empleado;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BarberosFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BarberosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BarberosFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BarberosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BarberosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BarberosFragment newInstance(String param1, String param2) {
        BarberosFragment fragment = new BarberosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private List<Empleado> Empleados;
    private ArrayAdapter<String> Lista;

    ListView listView;
    String[] valores = new  String[] {"Holanda","España","Estados Unidos","China","Argentina"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();

        Empleado emp1 = new Empleado();
        emp1.setNombreCompleto("Arturo Damian Ocampo Baca");
        emp1.setCorreo("ocampo.damian@hotmail.com");
        Empleado emp2 = new Empleado();
        emp2.setNombreCompleto("Jesus Ismael Galan Cazares");
        emp2.setCorreo("icazares@trapichar.com");




        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //
//        View view = inflater.inflate(R.layout.fragment_barberos, container, false);
//        listView = (ListView) view.findViewById(R.id.lista);
//           ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1,valores);
//           listView.setAdapter(adapter);
//
//           listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//
//               @Override
//               public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                  Toast.makeText(getActivity().getApplicationContext(),"Position "+ i,Toast.LENGTH_SHORT).show();
//               }
//           });


        View view = inflater.inflate(R.layout.fragment_barberos, container, false);

//        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.addBarber);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
////               Toast.makeText(getActivity().getApplicationContext(),"Acccion desde el boton",Toast.LENGTH_LONG).show();
//                Intent act = new Intent(getActivity(),BarberoActivity.class);
//                startActivity(act);
//            }
//        });
//
//        ListView lista = (ListView) view.findViewById(R.id.lista);
//        ArrayList<EmpleadoDTO> empleados = new ArrayList<EmpleadoDTO>();
//        EmpleadoDTO empleado;
//
//        empleado = new EmpleadoDTO(getResources().getDrawable(R.drawable.barbers_chair),"Arturo Damian Ocampo","ocampo.damian@hotmail.com");
//        empleados.add(empleado);
//        empleado = new EmpleadoDTO(getResources().getDrawable(R.drawable.barbers_chair),"Ismael Galan","icazares@trapichar.com");
//        empleados.add(empleado);
//
//        // Crea el adapter personalizado
//        AdapterEmpleado adapter = new AdapterEmpleado(getActivity(), empleados);
//        //Lo aplico
//        lista.setAdapter(adapter);


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }






}
