package com.e.mhscardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.e.mhscardview.Adapter.MahasiswaAdapter;
import com.e.mhscardview.Model.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener tambahButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TambahActivity.class);
                startActivity(intent);
            }
        };
        Button tambahBtn = (Button)findViewById(R.id.btnTambah);
        tambahBtn.setOnClickListener(tambahButtonListener);

        View.OnClickListener updateButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UpdateActivity.class);
                startActivity(intent);
            }
        };
        Button updateBtn = (Button)findViewById(R.id.btnUpdate);
        updateBtn.setOnClickListener(updateButtonListener);

        addData();
        recyclerView = findViewById(R.id.rvMhs);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);

        /*ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Anda memilih " + items[position], Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.deo,"Alfadeo Bulin","72170106","Laki-Laki","main layangan","pengacara","sing penting yakin"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.dorra,"Christian Dorra","72170148","Laki-Laki","Makan","Terbang","tetap kuat seperti larry"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.adrian,"Adrian Paskalis","72170125","Laki-Laki","cukur","Barber","yang penting makan"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.desta,"Desta Siwi Prabawan","72170126","Laki-Laki","olahraga","nikah","beyond limit"));
    }
}
