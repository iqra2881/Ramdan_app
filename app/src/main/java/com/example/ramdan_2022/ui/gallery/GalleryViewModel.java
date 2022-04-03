package com.example.ramdan_2022.ui.gallery;

import android.os.Bundle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ramdan_2022.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {


        mText = new MutableLiveData<>();
       // mText.setValue("This is Calendar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
