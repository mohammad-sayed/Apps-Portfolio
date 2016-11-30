package com.ms.appsportfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Mohammad-Sayed-PC on 11/30/2016.
 */

public class MainFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeViews(view);
    }

    private void initializeViews(View view) {
        view.findViewById(R.id.btn_popular_movies).setOnClickListener(this);
        view.findViewById(R.id.btn_stock_hawk).setOnClickListener(this);
        view.findViewById(R.id.btn_build_it_bigger).setOnClickListener(this);
        view.findViewById(R.id.btn_make_your_app_material).setOnClickListener(this);
        view.findViewById(R.id.btn_go_ubiquitous).setOnClickListener(this);
        view.findViewById(R.id.btn_capstone_my_app).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_popular_movies:
                displayToast(R.string.popular_movies);
                break;
            case R.id.btn_stock_hawk:
                displayToast(R.string.stock_hawk);
                break;
            case R.id.btn_build_it_bigger:
                displayToast(R.string.build_it_bigger);
                break;
            case R.id.btn_make_your_app_material:
                displayToast(R.string.make_your_app_material);
                break;
            case R.id.btn_go_ubiquitous:
                displayToast(R.string.go_ubiquitous);
                break;
            case R.id.btn_capstone_my_app:
                displayToast(R.string.capstone_my_app);
                break;
        }
    }

    private void displayToast(int stringResourceId) {
        Toast.makeText(getContext(), stringResourceId, Toast.LENGTH_SHORT).show();
    }
}
