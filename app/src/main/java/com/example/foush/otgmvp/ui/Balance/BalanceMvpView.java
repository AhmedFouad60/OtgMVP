package com.example.foush.otgmvp.ui.Balance;

import com.example.foush.otgmvp.ui.Base.MvpView;

/**
 * Created by foush on 09/02/18.
 */

public interface BalanceMvpView extends MvpView {
    void  initView();
    void  setUpWindowAnimations();
    void onSubmit(String cardNumber);
    void updateUI(String credit);
    void Error();

}
