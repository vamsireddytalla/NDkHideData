package com.example.ndkhidedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.ndkhidedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;
    static {
        System.loadLibrary("native-lib");
    }
    public native String getEncryptedKey();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tv1.setText(getEncryptedKey()+" ");
            }
        });
    }
}