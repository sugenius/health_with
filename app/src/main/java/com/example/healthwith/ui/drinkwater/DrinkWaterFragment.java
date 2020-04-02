package com.example.healthwith.ui.drinkwater;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.healthwith.R;

public class DrinkWaterFragment extends Fragment {

    private DrinkWaterViewModel drinkWaterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        drinkWaterViewModel =
                ViewModelProviders.of(this).get(DrinkWaterViewModel.class);
        View root = inflater.inflate(R.layout.fragment_drinkwater, container, false);
        final TextView textView = root.findViewById(R.id.text_drinkwater);
        drinkWaterViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
