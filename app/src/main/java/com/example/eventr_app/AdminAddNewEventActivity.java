package com.example.eventr_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AdminAddNewEventActivity extends AppCompatActivity
{
    private String CategoryName;
    private Button AddNewEventButton;
    private ImageView InputEventImage;
    private EditText InputEventName, InputEventPlace, InputEventTime, InputEventDate, InputEventLimit,InputEventPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_event);

        CategoryName = getIntent().getExtras().get("category").toString();


        AddNewEventButton = (Button) findViewById(R.id.add_new_event);
        InputEventImage = (ImageView) findViewById(R.id.select_event_image);
        InputEventName = (EditText) findViewById(R.id.txtNameOfEvent);
        InputEventPlace = (EditText) findViewById(R.id.txtPlace);
        InputEventTime = (EditText) findViewById(R.id.txtTime);
        InputEventDate = (EditText) findViewById(R.id.txtDate);
        InputEventLimit = (EditText) findViewById(R.id.txtAmountPpl);
        InputEventPrice = (EditText) findViewById(R.id.price);
    }
}
