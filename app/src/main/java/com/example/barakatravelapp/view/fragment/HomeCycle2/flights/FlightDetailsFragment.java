package com.example.barakatravelapp.view.fragment.HomeCycle2.flights;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.barakatravelapp.R;
import com.example.barakatravelapp.view.fragment.BaSeFragment;
import com.example.barakatravelapp.view.fragment.HomeCycle2.discover.ConfirmWithTheSupportFragment;
import com.example.barakatravelapp.view.fragment.HomeCycle2.discover.DiscoverFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.barakatravelapp.utils.HelperMethod.replaceFragment;


public class FlightDetailsFragment extends BaSeFragment {

    public FlightDetailsFragment() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home_flight_details, container, false);

        ButterKnife.bind(this, root);

        return root;
    }

    @Override
    public void onBack() {
        replaceFragment(getActivity().getSupportFragmentManager(), R.id.home_activity_fram, new FlightsFragment());
        homeCycleActivity.setNavigation("v");
        homeCycleActivity.bottomNavView.getMenu().getItem(2).setChecked(true);    }

    @OnClick({R.id.fragment_home_flight_details_back_btn, R.id.fragment_home_flight_details_book_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fragment_home_flight_details_back_btn:
                replaceFragment(getActivity().getSupportFragmentManager(), R.id.home_activity_fram, new DiscoverFragment());
                homeCycleActivity.setNavigation("v");
                homeCycleActivity.bottomNavView.getMenu().getItem(0).setChecked(true);
                break;
            case R.id.fragment_home_flight_details_book_btn:
                Bundle bundle=new Bundle();
                bundle.putString("ISDISCOVER","flight");
                ConfirmWithTheSupportFragment confirmWithTheSupportFragment=new ConfirmWithTheSupportFragment();
                confirmWithTheSupportFragment.setArguments(bundle);
                replaceFragment(getActivity().getSupportFragmentManager(), R.id.home_activity_fram,confirmWithTheSupportFragment);
                break;
        }
    }
}