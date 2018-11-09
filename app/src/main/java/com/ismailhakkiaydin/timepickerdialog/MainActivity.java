package com.ismailhakkiaydin.timepickerdialog;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    public class TimeHandler implements TimePickerDialog.OnTimeSetListener{
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute){
           // SimpleDateFormat sdf = new SimpleDateFormat();
            //String str = sdf.format(new Time(hourOfDay,minute,0));
            //MainActivity.this.setTitle(str);
            MainActivity.this.setTitle(hourOfDay + ":" + minute);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TimePickerDialog dlg = new TimePickerDialog(this, new TimeHandler(),19,23,true);
        dlg.setTitle("Ringing Time");
        dlg.show();

    }
}
