package com.example.dialoguefrag;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialFrag extends androidx.fragment.app.DialogFragment{

   public View  onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
       super.onCreateView(inflater, container, savedInstanceState);
       return inflater.inflate(R.layout.fragment_dialog, container, false);
   }
}