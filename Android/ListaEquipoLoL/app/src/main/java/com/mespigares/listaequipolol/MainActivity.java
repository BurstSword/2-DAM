package com.mespigares.listaequipolol;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ListActivity {



    private static final Equipo[] arrayEquipo={
            (new Equipo("Fnatic",R.drawable.fnatic, Tipo.IMPAR)),
            (new Equipo("SKT T1",R.drawable.sktt1, Tipo.PAR)),
            (new Equipo("G2 Esports",R.drawable.g2esports,Tipo.IMPAR)),
            (new Equipo("Fun Plus Phoenix",R.drawable.funplus , Tipo.PAR)),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new IconicAdapter<>(this, R.layout.row, arrayEquipo));
    }

    class IconicAdapter<T> extends ArrayAdapter<T> {
        IconicAdapter(Context c, int resourceId, T[] objects) {
            super(c, resourceId, objects);
        }

        class ViewHolder {
            TextView textoHeroe;
            ImageView perfil;

            public ViewHolder(TextView textoHeroe, ImageView perfil) {
                this.textoHeroe = textoHeroe;
                this.perfil = perfil;
            }

            public TextView getTextoHeroe() {
                return this.textoHeroe;
            }

            public ImageView getPerfil() {
                return perfil;
            }
        }

        //La clase que creemos de ArrayAdapter debe sobreescribir al menos el método getView
        public View getView(int position, View convertView, ViewGroup parent) {
            View fila = convertView;
            ViewHolder holder;
            TextView textoEquipo;
            ImageView foto;
            if (fila == null) {
                LayoutInflater inflater = getLayoutInflater();
                if(arrayEquipo[position].getTipo()==Tipo.IMPAR){
                    fila = inflater.inflate(R.layout.row, parent, false);
                }else{
                    fila = inflater.inflate(R.layout.row2, parent, false);
                }


                textoEquipo = fila.findViewById(R.id.txtNombre);
                foto = fila.findViewById(R.id.imgFoto);
                holder = new ViewHolder(textoEquipo, foto);
                fila.setTag(holder);
            } else {
                holder = (ViewHolder) fila.getTag();
            }

            holder.getTextoHeroe().setText(arrayEquipo[position].getNombre());
            holder.getPerfil().setImageResource(arrayEquipo[position].getIdImage());

            return fila;
        }
    }
}
