package com.example.ramdan_2022.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ramdan_2022.R;
import com.example.ramdan_2022.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public  class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;





    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }




}