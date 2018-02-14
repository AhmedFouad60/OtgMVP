package com.example.foush.otgmvp.ui.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foush.otgmvp.R;
import com.example.foush.otgmvp.data.DataManager;
import com.example.foush.otgmvp.otgMvp;
import com.example.foush.otgmvp.ui.Balance.BalancePresenter;
import com.example.foush.otgmvp.ui.Base.BaseActivity;
import com.example.foush.otgmvp.ui.Main.*;
import com.example.foush.otgmvp.utils.CommonUtils;

/**
 * Created by foush on 09/02/18.
 */

public class ProfileActivity extends BaseActivity implements ProfileMvpView {
    DataManager mDataManager;
    ProfilePresenter mProfilePresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mDataManager = ((otgMvp) getApplication()).getmDataManger();
        mProfilePresenter= new ProfilePresenter(mDataManager);
        mProfilePresenter.onAttach(this);



    }
}
