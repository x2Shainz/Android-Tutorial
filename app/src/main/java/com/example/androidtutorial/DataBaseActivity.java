package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class DataBaseActivity extends AppCompatActivity {

    //View References
    private Button btn_add, btn_view;
    private EditText et_age, et_name;
    private Switch sw_activeCustomer;
    private RecyclerView rv_customerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);

        //Instantiate view references
        btn_add = findViewById(R.id.btn_add);
        btn_view = findViewById(R.id.btn_view);
        et_age  = findViewById(R.id.et_age);
        et_name = findViewById(R.id.et_name);
        sw_activeCustomer = findViewById(R.id.sw_activeCustomer);
        rv_customerList = findViewById(R.id.rv_customerList);

        //Button listeners for the add and view all buttons
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    CustomerModel customerModel = new CustomerModel(-1, et_name.getText().toString(), Integer.parseInt(et_age.getText().toString()), sw_activeCustomer.isChecked());
                    Toast.makeText(DataBaseActivity.this, customerModel.toString(), Toast.LENGTH_SHORT).show();
                }catch(NumberFormatException e) {
                    Toast.makeText(DataBaseActivity.this, R.string.number_format_error, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(DataBaseActivity.this, R.string.view_all_customers, Toast.LENGTH_SHORT).show();
            }
        });
    }
}