package com.s.m.marzuk.n.bogorkuy;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;

/**
 * Created by nmms on 12/2/2017.
 */

public class custoAdapterLisViw extends ArrayAdapter<String> {
    String[] judul;
    String[] konten;
    Integer[] gambar;
    Activity context;

    public custoAdapterLisViw(Activity context, String[] judul, String[] konten, Integer[] gambar) {
        super(context, R.layout.lisviw1style, judul);

        this.context = context;
        this.judul = judul;
        this.konten = konten;
        this.gambar = gambar;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.lisviw1style, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
            //Button btn = r.findViewById(R.id.judulArt);
            //btn.setOnClickListener(new View.OnClickListener() {
            //  @Override
            //public void onClick(View v) {
            //Menu as = new Menu();
            //  Toast.makeText(context, " "+position, Toast.LENGTH_SHORT).show();
            //Intent cobalagi = new Intent(as,detailBacaLagi.class);
            //cobalagi.putExtra("Judul",as.dataListObjekWisata[position]);
            //cobalagi.putExtra("gambar",as.imgid[position]);
            //as.startActivity(cobalagi);
            //}
            //});
        } else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.imgv1.setImageResource(gambar[position]);
        viewHolder.tv1.setText(judul[position]);
        viewHolder.tv2.setText(konten[position]);

        viewHolder.imgv1.setFocusable(false);
        viewHolder.tv1.setFocusable(false);
        viewHolder.tv2.setFocusable(false);

        viewHolder.imgv1.setFocusableInTouchMode(false);
        viewHolder.tv1.setFocusableInTouchMode(false);
        viewHolder.tv2.setFocusableInTouchMode(false);
        return r;
    }

    class ViewHolder {
        TextView tv1;
        DocumentView tv2;
        ImageView imgv1;

        ViewHolder(View v) {
            tv1 = v.findViewById(R.id.judulArt);
            tv2 = v.findViewById(R.id.kontenArt);
            imgv1 = v.findViewById(R.id.gambarArt);
        }
    }
}
