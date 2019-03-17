package com.example.projectgreen;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private static final int NUM_GRID_COLS = 3;

    private GridView gridView;
    private ImageView galleryImage;
    private ProgressBar progressBar;
    private Spinner directorySpinner;

    private String fileD = "file:/";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
//        galleryImage = view.findViewById(R.id.galleryImageView);
//        gridView = view.findViewById(R.id.gridView);
//        directorySpinner = view.findViewById(R.id.spinnerDirectory);
//        progressBar = view.findViewById(R.id.progressBar);
//        progressBar.setVisibility(View.GONE);

        return view;
    }

//    private void setUpGridView()
//    {
//        final ArrayList<ContactsContract.Contacts.Photo> photos = new ArrayList<>();
//
//        int gridWidth = getResources().getDisplayMetrics().widthPixels;
//        int imageWidth = gridWidth / NUM_GRID_COLS;
//        gridView.setColumnWidth((imageWidth));
//
//        ArrayList<String> imgURLs = new ArrayList<String>();
//        for (int i = 0; i < photos.size(); i++)
//        {
//            imgURLs.add(photos.get(i).getImage_)
//        }
//
//        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), )
//
//        gridView.setAdapter(adapter);
//
//    }

//    private void init()
//    {
//        String dir = Environment.getExternalStorageDirectory().getPath() + "/Pictures";
//
//        ArrayList<String> picDirectories = new ArrayList<>();
//        File file = new File(dir);
//        File[] pics = file.listFiles();
//        for (int i = 0; i < pics.length; i++)
//        {
//            if (pics[i].isDirectory())
//            {
//                picDirectories.add(pics[i].getAbsolutePath());
//            }
//        }
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, picDirectories);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        directorySpinner.setAdapter(adapter);
//
//        directorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//    }
//
//    private void setUpGridView(String selectedDirectory)
//    {
//        final ArrayList<String> imgURLs = new ArrayList<>();
//        File file = new File(selectedDirectory);
//        File[] pics = file.listFiles();
//        for (int i = 0; i < pics.length; i++)
//        {
//            if (pics[i].isDirectory())
//            {
//                imgURLs.add(pics[i].getAbsolutePath());
//            }
//        }
//
//        int gridWidth= getResources().getDisplayMetrics().widthPixels;
//        int imageWidth = gridWidth / NUM_GRID_COLS;
//        gridView.setColumnWidth(imageWidth);
//
//
//
//
//    }
}
