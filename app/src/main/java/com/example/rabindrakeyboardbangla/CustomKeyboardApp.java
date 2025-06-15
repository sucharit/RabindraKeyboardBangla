package com.example.rabindrakeyboardbangla;


import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;

public class CustomKeyboardApp extends InputMethodService
        implements KeyboardView.OnKeyboardActionListener {


    private String inpState = "";

    @Override
    public View onCreateInputView() {
        KeyboardView kv = (KeyboardView)getLayoutInflater().inflate(R.layout.custom_layout, null);
        kv.setPreviewEnabled(false);
        Keyboard keyboard = new Keyboard(this, R.xml.custom_keypad);
        kv.setKeyboard(keyboard);
        kv.setOnKeyboardActionListener(this);
        return kv;
    }

    private void playClick(int keyCode){
    }

    private boolean isVowel(String s){
        if(s==""){return true;}
        if(s=="।"){return true;}
        if(s=="ং"){return true;}
        if(s=="অ"){return true;}
        if(s=="."){return true;}
        if(s=="ি"){return true;}
        if(s=="ই"){return true;}
        if(s=="ু"){return true;}
        if(s=="উ"){return true;}
        if(s=="ৃ"){return true;}
        if(s=="ঋ"){return true;}
        if(s=="ে"){return true;}
        if(s=="ো"){return true;}
        if(s=="ও"){return true;}
        if(s=="এ"){return true;}
        if(s=="#"){return true;}

        return false;
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection ic = getCurrentInputConnection();
        switch(primaryCode){
            case -5 :
                ic.deleteSurroundingText(1, 0);
                inpState="";
                break;
            case -4:
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_ENTER));
                inpState="";
                break;
            case 60:
                ic.commitText("",-1);
                inpState="";
                break;
            case 62:
                ic.commitText("",2);
                inpState="";
                break;
            default:
                char code = (char)primaryCode;
                String scode="";
                switch(code){
                    case '0':
                        inpState="";
                        scode="০";
                        break;
                    case '1':
                        inpState="";
                        scode="১";
                        break;
                    case '2':
                        inpState="";
                        scode="২";
                        break;
                    case '3':
                        inpState="";
                        scode="৩";
                        break;
                    case '4':
                        inpState="";
                        scode="৪";
                        break;
                    case '5':
                        inpState="";
                        scode="৫";
                        break;
                    case '6':
                        inpState="";
                        scode="৬";
                        break;
                    case '7':
                        inpState="";
                        scode="৭";
                        break;
                    case '8':
                        inpState="";
                        scode="৮";
                        break;
                    case '9':
                        inpState="";
                        scode="৯";
                        break;
                    case 'a':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গ";
                            inpState=".";
                        }
                        else if(isVowel(inpState)) {
                            if (inpState == ".") {
                                inpState = "";
                                scode = "া";
                            } else if (inpState == "অ") {
                                inpState = "";
                                ic.deleteSurroundingText(1, 0);
                                scode = "আ";
                            } else {
                                inpState = "অ";
                                scode = "অ";
                            }
                        }
                        else {
                            inpState = ".";
                            scode = "";
                        }
                        break;
                    case 'A':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গা";
                            inpState="";
                        }
                        else if(isVowel(inpState)){
                            if(inpState=="অ" | inpState=="এ"){scode="্যা";}
                            else{scode="আ";}
                            inpState="";
                        }
                        else {
                            inpState = "";
                            scode = "া";
                        }
                        break;
                    case 'e':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গে";
                            inpState="";
                        }
                        else if(isVowel(inpState)){
                            if(inpState=="ে") {
                                scode = "ঽ";
                                inpState = "";
                            }
                            else {
                                inpState = "এ";
                                scode = "এ";
                            }
                        }
                        else {
                            inpState = "ে";
                            scode = "ে";
                        }
                        break;
                    case 'Z':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গৃ";
                            inpState="";
                        }
                        else if(isVowel(inpState)){
                            if (inpState == "ৃ") {
                                    inpState = "";
                                    ic.deleteSurroundingText(1, 0);
                                    scode = "ৄ";
                            } else if (inpState == "ঋ") {
                                    inpState = "";
                                    ic.deleteSurroundingText(1, 0);
                                    scode = "ৠ";
                            }
                            else {
                                    inpState = "";
                                    scode = "ঋ";
                            }
                        }
                        else {
                            inpState = "";
                            scode = "ৃ";
                        }
                        break;
                    case 'o':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গো";
                            inpState="ো";
                        }
                        else if(isVowel(inpState)){
                            if(inpState=="ো"){
                                scode="ঽ";
                                inpState="";
                            }
                            else {
                                inpState = "ও";
                                scode = "ও";
                            }
                        }
                        else {
                            inpState = "ো";
                            scode = "ো";
                        }
                        break;
                    case 'i':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গি";
                            inpState="ি";
                        }
                        else if(isVowel(inpState)) {
                            if (inpState == "ি") {
                                inpState = "";
                                ic.deleteSurroundingText(1, 0);
                                scode = "ী";
                            } else if (inpState == "ই") {
                                inpState = "";
                                ic.deleteSurroundingText(1, 0);
                                scode = "ঈ";
                            } else if(inpState=="ো") {
                                inpState = "";
                                ic.deleteSurroundingText(1,0);
                                scode="ৈ";
                            } else if(inpState=="ও") {
                                inpState="";
                                ic.deleteSurroundingText(1,0);
                                scode="ঐ";
                            } else {
                                inpState = "ই";
                                scode = "ই";
                            }
                        }
                        else {
                            inpState = "ি";
                            scode = "ি";
                        }
                        break;
                    case 'I':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গী";
                            inpState="";
                        }
                        else if(isVowel(inpState)){
                            inpState="";
                            scode="ঈ";
                        }
                        else {
                            inpState = "";
                            scode = "ী";
                        }
                        break;
                    case 'u':
                        if(isVowel(inpState)) {
                            if(inpState=="ং")
                            {
                                ic.deleteSurroundingText(1,0);
                                scode="ঙ্গু";
                                inpState="ু";
                            }
                            else if (inpState == "ু") {
                                inpState = "";
                                ic.deleteSurroundingText(1, 0);
                                scode = "ূ";
                            } else if (inpState == "উ") {
                                inpState = "";
                                ic.deleteSurroundingText(1, 0);
                                scode = "ঊ";
                            } else if(inpState=="ো") {
                                inpState = "";
                                ic.deleteSurroundingText(1,0);
                                scode="ৌ";
                            } else if(inpState=="ও") {
                                inpState="";
                                ic.deleteSurroundingText(1,0);
                                scode="ঔ";
                            } else {
                                inpState = "উ";
                                scode = "উ";
                            }
                        }
                        else {
                            inpState = "ু";
                            scode = "ু";
                        }
                        break;
                    case 'U':
                        if(inpState=="ং")
                        {
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্গূ";
                            inpState="";
                        }
                        else if(isVowel(inpState)){
                            inpState="";
                            scode="ঊ";
                        }
                        else {
                            inpState = "";
                            scode = "ূ";
                        }
                        break;
                    case 'H':
                        if(isVowel(inpState)) {
                            scode = "ঃ";
                            inpState = "";
                        }
                        break;
                    case 'x':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ক্ষ";
                        inpState="ষ";
                        break;
                    case '`':
                        if(inpState=="ত"){
                            ic.deleteSurroundingText(1,0);
                            scode="ৎ";
                        }
                        else{
                            scode="্";
                        }
                        inpState="";
                        break;
                    case '#':
                        if(inpState=="#") {
                            inpState = "";
                            scode = "\u2060";
                        } else {
                            inpState = "#";
                        }
                        break;
                    case '.':
                        if(inpState=="।"){
                            inpState="";
                            ic.deleteSurroundingText(1,0);
                            scode="॥";
                        } else {
                            inpState = "।";
                            scode = "।";
                        }
                        break;
                    case '^':
                        if(isVowel(inpState)) {
                            inpState = "";
                            scode = "ঁ";
                        }
                        break;
                    case 'k':
                        if(!isVowel(inpState)){scode="্";};
                        if(inpState=="ন"){
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ্ক";
                            inpState="ক";
                        } else {
                            scode += "ক";
                            inpState = "ক";
                        }
                        break;
                    case 'g':
                        if(!isVowel(inpState)){scode="্";};
                        if(inpState=="ণ"){
                            ic.deleteSurroundingText(1,0);
                            scode="ঙ";
                            inpState="ঙ";
                        } else if(inpState=="ন"){
                            ic.deleteSurroundingText(1,0);
                            scode="ং";
                            inpState="ং";
                        } else {
                            scode += "গ";
                            inpState = "গ";
                        }
                        break;
                    case 'c':
                        if(!isVowel(inpState)){scode="্";};
                        if(inpState=="ন"){
                            ic.deleteSurroundingText(1,0);
                            scode="ঞ্চ";
                            inpState="চ";
                        } else {
                            scode += "চ";
                            inpState = "চ";
                        }
                        break;
                    case 'j':
                        if(!isVowel(inpState)){scode="্";};
                        if(inpState=="ণ"){
                            ic.deleteSurroundingText(1,0);
                            scode="ঞ";
                            inpState="ঞ";
                        } else if(inpState=="ন"){
                            ic.deleteSurroundingText(1,0);
                            scode="ঞ্জ";
                            inpState="জ";
                        } else {
                            scode += "জ";
                            inpState = "জ";
                        }
                        break;
                    case 'T':
                        if(!isVowel(inpState)){scode="্";};
                        if(inpState=="ন"){
                            ic.deleteSurroundingText(1,0);
                            scode="ণ্ট";
                            inpState="ট";
                        } else {
                            scode+="ট";
                            inpState="ট";
                        }
                        break;
                    case 'D':
                        if(!isVowel(inpState)){scode="্";};
                        if(inpState=="ন"){
                            ic.deleteSurroundingText(1,0);
                            scode="ণ্ড";
                            inpState="ড";
                        } else {
                            scode += "ড";
                            inpState = "ড";
                        }
                        break;
                    case 'N':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ণ";
                        inpState="ণ";
                        break;
                    case 't':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ত";
                        inpState="ত";
                        break;
                    case 'd':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="দ";
                        inpState="দ";
                        break;
                    case 'n':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ন";
                        inpState="ন";
                        break;
                    case 'p':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="প";
                        inpState="প";
                        break;
                    case 'f':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ফ";
                        inpState="ফ";
                        break;
                    case 'b':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ব";
                        inpState="ব";
                        break;
                    case 'v':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ভ";
                        inpState="ভ";
                        break;
                    case 'm':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ম";
                        inpState="ম";
                        break;
                    case 'J':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="য";
                        inpState="য";
                        break;
                    case 'r':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="র";
                        inpState="র";
                        break;
                    case 'l':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ল";
                        inpState="ল";
                        break;
                    case 'S':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ষ";
                        inpState="ষ";
                        break;
                    case 's':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="স";
                        inpState="স";
                        break;
                    case 'h':
                        switch(inpState) {
                            case "ক":
                                ic.deleteSurroundingText(1, 0);
                                scode="খ";
                                inpState="খ";
                                break;
                            case "খ":
                                break;
                            case "গ":
                                ic.deleteSurroundingText(1, 0);
                                scode="ঘ";
                                inpState="ঘ";
                                break;
                            case "ঘ":
                                break;
                            case "ং":
                                ic.deleteSurroundingText(1,0);
                                scode="ঙ্ঘ";
                                inpState="ঘ";
                                break;
                            case "চ":
                                ic.deleteSurroundingText(1, 0);
                                scode="ছ";
                                inpState="ছ";
                                break;
                            case "ছ":
                                break;
                            case "জ":
                                ic.deleteSurroundingText(1, 0);
                                scode="ঝ";
                                inpState="ঝ";
                                break;
                            case "ঝ":
                                break;
                            case "ট":
                                ic.deleteSurroundingText(1, 0);
                                scode="ঠ";
                                inpState="ঠ";
                                break;
                            case "ঠ":
                                break;
                            case "ড":
                                ic.deleteSurroundingText(1, 0);
                                scode="ঢ";
                                inpState="ঢ";
                                break;
                            case "ঢ":
                                break;
                            case "ত":
                                ic.deleteSurroundingText(1, 0);
                                scode="থ";
                                inpState="থ";
                                break;
                            case "থ":
                                break;
                            case "দ":
                                ic.deleteSurroundingText(1, 0);
                                scode="ধ";
                                inpState="ধ";
                                break;
                            case "ধ":
                                break;
                            case "প":
                                ic.deleteSurroundingText(1, 0);
                                scode="ফ";
                                inpState="ফ";
                                break;
                            case "ফ":
                                break;
                            case "ব":
                                ic.deleteSurroundingText(1, 0);
                                scode="ভ";
                                inpState="ভ";
                                break;
                            case "ভ":
                                break;
                            case "স":
                                ic.deleteSurroundingText(1, 0);
                                scode="শ";
                                inpState="শ";
                                break;
                            case "শ":
                                break;
                            case "ষ":
                                break;
                            case "ড়":
                                ic.deleteSurroundingText(1, 0);
                                scode="ঢ়";
                                inpState="ঢ়";
                                break;
                            case "ঢ়":
                                break;
                            default:
                                if(!isVowel(inpState)){scode="্";};
                                scode+="হ";
                                inpState="হ";
                        }
                        break;
                    case 'R':
                        if(!isVowel(inpState)){scode="্";};
                        scode+="ড়";
                        inpState="ড়";
                        break;
                    case 'Y':
                        if(!isVowel(inpState)){
                            if(inpState=="গ")
                            {
                                ic.deleteSurroundingText(1,0);
                                scode="জ্ঞ";
                                inpState="ঞ";
                            }
                            else if(inpState=="র")
                            {
                                scode="\u200C";
                                scode+="্য";
                                inpState = "য";
                            }
                            else {
                                scode = "্য";
                                inpState = "য";
                            }
                        }
                        else {
                            scode = "য়";
                            inpState = "য়";
                        }
                        break;
                    case 'y':
                        if(!isVowel(inpState)){
                            if(inpState=="র")
                            {
                                scode="\u200C";
                                scode+="্য";
                                inpState = "য";
                            }
                            else if(inpState=="গ"){
                                scode = "্য";
                                inpState = "গ্য";
                            }
                            else if(inpState=="গ্য"){
                                ic.deleteSurroundingText(3,0);
                                scode="জ্ঞ";
                                inpState="ঞ";
                            }
                            else {
                                scode = "্য";
                                inpState = "য";
                            }
                        }
                        else {
                            scode = "য়";
                            inpState = "য়";
                        }
                        break;
                    default:
                        inpState="";
                        scode=String.valueOf(code);
                }
                ic.commitText(scode,1);
                scode="";
        }
    }

    @Override
    public void onPress(int primaryCode) {
    }

    @Override
    public void onRelease(int primaryCode) {
    }

    @Override
    public void onText(CharSequence text) {
    }

    @Override
    public void swipeDown() {
    }

    @Override
    public void swipeLeft() {
    }

    @Override
    public void swipeRight() {
    }

    @Override
    public void swipeUp() {
    }
}

/*
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.view.inputmethod.InputConnection;

public class CustomKeyboardApp extends InputMethodService
        implements KeyboardView.OnKeyboardActionListener {

    @Override
    public View onCreateInputView() {
        KeyboardView keyboardView= (KeyboardView) getLayoutInflater().inflate(R.layout.custom_layout, null);
        Keyboard keyboard= new Keyboard(this, R.xml.custom_keypad);
        keyboardView.setKeyboard(keyboard);
        keyboardView.setPreviewEnabled(false);
        keyboardView.setOnKeyboardActionListener(this);

        return keyboardView;
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int i, int[] ints) {


        InputConnection inputConnection=getCurrentInputConnection();
        if(inputConnection==null)
        {
            return;
        }

        inputConnection.commitText(String.valueOf((char)i),1);
    }

    @Override
    public void onText(CharSequence charSequence) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
*/