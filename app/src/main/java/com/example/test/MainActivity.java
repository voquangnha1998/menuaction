package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Context context;
    ArrayList<CountriesModel> countriesData;
    CustomAdapter customAdapter;
    CountriesModel countriesModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        //getviews
        listView = findViewById(R.id.listView);
        countriesData = new ArrayList<>();
        //add Countries Data
        populateCountriesData();
        customAdapter = new CustomAdapter(context,countriesData);
        listView.setAdapter(customAdapter);
        registerForContextMenu(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,countriesData.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void populateCountriesData() {
        //country 1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Hoa nở không màu");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("1,333,234");
        countriesModel.setPopulation("Chi Dân");
        countriesData.add(countriesModel);

        //country 2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("Còn lại gì");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("3,243,243");
        countriesModel.setPopulation("Hoàng Thanh");
        countriesData.add(countriesModel);

        //country 3
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Huy hoàng");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("5,345,354");
        countriesModel.setPopulation("Khánh Hoàng");
        countriesData.add(countriesModel);

        //country 4
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Hoa nở không màu");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("1,333,234");
        countriesModel.setPopulation("Chi Dân");
        countriesData.add(countriesModel);

        //country 5
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("Còn lại gì");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("3,243,243");
        countriesModel.setPopulation("Hoàng Thanh");
        countriesData.add(countriesModel);

        //country 6
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Huy hoàng");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("5,345,354");
        countriesModel.setPopulation("Khánh Hoàng");
        countriesData.add(countriesModel);

        //country 7
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Hoa nở không màu");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("1,333,234");
        countriesModel.setPopulation("Chi Dân");
        countriesData.add(countriesModel);

        //country 8
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("Còn lại gì");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("3,243,243");
        countriesModel.setPopulation("Hoàng Thanh");
        countriesData.add(countriesModel);
        //country 9
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Huy hoàng");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("5,345,354");
        countriesModel.setPopulation("Khánh Hoàng");
        countriesData.add(countriesModel);

        //country 10
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Hoa nở không màu");
        countriesModel.setImage(R.drawable.ic_nha);
        countriesModel.setArea("1,333,234");
        countriesModel.setPopulation("Chi Dân");
        countriesData.add(countriesModel);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        menu.setHeaderTitle("Chọn");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.add){
            Toast.makeText(this,"Bạn đã chọn add",Toast.LENGTH_LONG).show();
            return true;
        }else if(item.getItemId()==R.id.update){
            Toast.makeText(this,"Bạn đã chọn sửa",Toast.LENGTH_LONG).show();
        }else if(item.getItemId()==R.id.delete){
            Toast.makeText(this,"Bạn đã chọn xóa",Toast.LENGTH_LONG).show();
        }else
            return  false;
        return true;
    }
}