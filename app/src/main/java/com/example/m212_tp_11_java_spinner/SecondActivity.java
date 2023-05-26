package com.example.m212_tp_11_java_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Calendar c = Calendar.getInstance();

        btn=findViewById(R.id.dateButton);
        txt=findViewById(R.id.dateSelect);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog.OnDateSetListener OL = new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker datePicker, int selectedYear, int selectedMonth, int selectedDay) {
                        txt.setText("" + selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear);
                    }
                };

                DatePickerDialog mDatePicker = new DatePickerDialog(SecondActivity.this, OL, mYear, mMonth, mDay);
                mDatePicker.show();



            }
        });


    }
}