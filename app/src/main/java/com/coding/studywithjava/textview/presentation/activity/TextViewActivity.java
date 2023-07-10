package com.coding.studywithjava.textview.presentation.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studywithjava.R;

public class TextViewActivity extends AppCompatActivity implements TextWatcher {

    private EditText editTextInput;
    private TextView textViewByte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        initComponentsAndSetListener();
    }

    private void initComponentsAndSetListener() {
        // Initialize components
        editTextInput = (EditText) findViewById(R.id.edit_text_text_view_input);
        textViewByte = (TextView) findViewById(R.id.text_view_text_view_byte);
        // Set listener to components
        editTextInput.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        textViewByte.setText(editable.length()+" / 800 바이트");
    }
}