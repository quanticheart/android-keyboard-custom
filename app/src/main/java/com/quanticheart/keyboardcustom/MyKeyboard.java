package com.quanticheart.keyboardcustom;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MyKeyboard extends InputMethodService {

    @Override
    public View onCreateInputView() {
        // Inflate the keyboard layout
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.keyboard2, null);

        // Set up the keyboard buttons
        Button buttonA = (Button) view.findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Insert the character 'A' into the edit field
                getCurrentInputConnection().commitText("A", 1);
            }
        });

        Button buttonB = (Button) view.findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Insert the character 'A' into the edit field
                getCurrentInputConnection().commitText("B", 1);
            }
        });
        // Repeat the process for other keyboard buttons

        return view;
    }
}
