package com.example.whichkey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        txtView = findViewById(R.id.txtView);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                String msg = detectKey(keyCode);
                txtView.setText(msg);
                return false;
            }
        });
    }



    private String detectKey(int keyCode){
        String msg ="Your Key Isn't Detected";
        switch (keyCode){
            case KeyEvent.KEYCODE_0: {
                msg = "0 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_1: {
                msg = "1 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_2: {
                msg = "2 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_3: {
                msg = "3 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_4: {
                msg = "4 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_5: {
                msg = "5 Clicked!";
                break;
            }case KeyEvent.KEYCODE_6: {
                msg = "6 Clicked!";
                break;
            }case KeyEvent.KEYCODE_7: {
                msg = "7 Clicked!";
                break;
            }case KeyEvent.KEYCODE_8: {
                msg = "8 Clicked!";
                break;
            }case KeyEvent.KEYCODE_9: {
                msg = "9 Clicked!";
                break;
            }case KeyEvent.KEYCODE_A: {
                msg = "A Clicked!";
                break;
            }case KeyEvent.KEYCODE_B: {
                msg = "B Clicked!";
                break;
            }case KeyEvent.KEYCODE_C: {
                msg = "C Clicked!";
                break;
            }case KeyEvent.KEYCODE_D: {
                msg = "D Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_E: {
                msg = "E Clicked!";
                break;
            }case KeyEvent.KEYCODE_F: {
                msg = "F Clicked!";
                break;
            }case KeyEvent.KEYCODE_G: {
                msg = "G Clicked!";
                break;
            }case KeyEvent.KEYCODE_H: {
                msg = "H Clicked!";
                break;
            }case KeyEvent.KEYCODE_I: {
                msg = "I Clicked!";
                break;
            }case KeyEvent.KEYCODE_J: {
                msg = "J Clicked!";
                break;
            }case KeyEvent.KEYCODE_K: {
                msg = "K Clicked!";
                break;
            }case KeyEvent.KEYCODE_L: {
                msg = "L Clicked!";
                break;
            }case KeyEvent.KEYCODE_M: {
                msg = "M Clicked!";
                break;
            }case KeyEvent.KEYCODE_N: {
                msg = "N Clicked!";
                break;
            }case KeyEvent.KEYCODE_O: {
                msg = "O Clicked!";
                break;
            }case KeyEvent.KEYCODE_P: {
                msg = "P Clicked!";
                break;
            }case KeyEvent.KEYCODE_Q: {
                msg = "Q Clicked!";
                break;
            }case KeyEvent.KEYCODE_R: {
                msg = "R Clicked!";
                break;
            }case KeyEvent.KEYCODE_S: {
                msg = "S Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_T: {
                msg = "T Clicked!";
                break;
            }case KeyEvent.KEYCODE_U: {
                msg = "U Clicked!";
                break;
            }case KeyEvent.KEYCODE_V: {
                msg = "V Clicked!";
                break;
            }case KeyEvent.KEYCODE_W: {
                msg = "W Clicked!";
                break;
            }case KeyEvent.KEYCODE_X: {
                msg = "X Clicked!";
                break;
            }case KeyEvent.KEYCODE_Y: {
                msg = "Y Clicked!";
                break;
            }case KeyEvent.KEYCODE_Z: {
                msg = "Z Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_DEL: {
                msg = "Delete Clicked!";
                break;
            }case KeyEvent.KEYCODE_BACK: {
                msg = "Back Clicked!";
                break;
            }case KeyEvent.KEYCODE_F1: {
                msg = "F1 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F2: {
                msg = "F2 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F3: {
                msg = "F3 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F4: {
                msg = "F4 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F5: {
                msg = "F5 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F6: {
                msg = "F6 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F7: {
                msg = "F7 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_F8: {
                msg = "F8 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F9: {
                msg = "F9 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F10: {
                msg = "F10 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F11: {
                msg = "F11 Clicked!";
                break;
            }case KeyEvent.KEYCODE_F12: {
                msg = "F12 Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_NUMPAD_DOT: {
                msg = "Dot Clicked!";
                break;
            }case KeyEvent.KEYCODE_SHIFT_LEFT: {
                msg = "ShiftLeft Clicked!";
                break;
            }case KeyEvent.KEYCODE_SHIFT_RIGHT: {
                msg = "ShiftRight Clicked!";
                break;
            }case KeyEvent.KEYCODE_ENTER: {
                msg = "Enter Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_MINUS: {
                msg = "Minus Clicked!";
                break;
            }case KeyEvent.KEYCODE_PLUS: {
                msg = "Plus Clicked!";
                break;
            }case KeyEvent.KEYCODE_ALT_LEFT: {
                msg = "AltLeft Clicked!";
                break;
            }case KeyEvent.KEYCODE_ALT_RIGHT: {
                msg = "AltRight Clicked!";
                break;
            }
            case KeyEvent.KEYCODE_CTRL_LEFT: {
                msg = "CtrlLeft Clicked!";
                break;
            }case KeyEvent.KEYCODE_CTRL_RIGHT: {
                msg = "CtrlRight Clicked!";
                break;
            }case KeyEvent.KEYCODE_CAPS_LOCK: {
                msg = "CapsLock Clicked!";
                break;
            }case KeyEvent.KEYCODE_TAB: {
                msg = "Tab Clicked!";
                break;
            }case KeyEvent.KEYCODE_NUM_LOCK: {
                msg = "NumLock Clicked!";
                break;
            }case KeyEvent.KEYCODE_EQUALS: {
                msg = "Equals Clicked!";
                break;
            }
        }
        return msg;
    }
}