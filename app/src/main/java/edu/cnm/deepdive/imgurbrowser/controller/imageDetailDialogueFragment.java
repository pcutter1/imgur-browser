package edu.cnm.deepdive.imgurbrowser.controller;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cnm.deepdive.imgurbrowser.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class imageDetailDialogueFragment extends Fragment {

  public imageDetailDialogueFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_image_detail_dialogue, container, false);
  }
}
