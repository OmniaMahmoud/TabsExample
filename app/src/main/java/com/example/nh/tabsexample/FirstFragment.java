package com.example.nh.tabsexample;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment implements View.OnClickListener{

    private TextView first;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        first = view.findViewById(R.id.tv_first);
        first.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_first){
            AlertDialog dialog = new AlertDialog.Builder(getActivity())
                    .setTitle("Delete")
                    .setMessage("Are you sure you want to delete this item?")
                    .setIcon(R.mipmap.ic_launcher)
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.e("yes","yes is clicked");
                            dialog.dismiss();
                        }
                    })
                    .setNegativeButton("no", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.e("no","no is clicked");
                            dialog.dismiss();
                        }
                    })
                    .create();
            dialog.show();
        }
    }
}
