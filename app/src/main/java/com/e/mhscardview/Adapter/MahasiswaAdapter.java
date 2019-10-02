package com.e.mhscardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.mhscardview.Model.Mahasiswa;
import com.e.mhscardview.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList){
        this.dataList=dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgFoto.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtGender.setText(dataList.get(position).getGender());
        holder.txtHobi.setText(dataList.get(position).getHobi());
        holder.txtCita2.setText(dataList.get(position).getCita2());
        holder.txtMotoHidup.setText(dataList.get(position).getMotohidup());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtGender, txtHobi, txtCita2, txtMotoHidup;
        private ImageView imgFoto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            txtNama = itemView.findViewById(R.id.txtNama);
            txtNim = itemView.findViewById(R.id.txtNim);
            txtGender = itemView.findViewById(R.id.txtGender);
            txtHobi = itemView.findViewById(R.id.txtHobi);
            txtCita2 = itemView.findViewById(R.id.txtCita2);
            txtMotoHidup = itemView.findViewById(R.id.txtMotoHidup);
        }
    }
}
