package com.example.harkkaty;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;


//fragment used in userCards activity to make new cards in the frmaeLayOut thats in it
public class NewCard extends Fragment {


    private EditText cheking, online, cash, credit;
    private String checkingString, onlineString, cashString, creditString;
    private Spinner spineer;
    private Account account;

    public NewCard() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View newCardFragView = inflater.inflate(R.layout.fragment_new_card, container, false);
        cheking = newCardFragView.findViewById(R.id.CheckingL);
        online = newCardFragView.findViewById(R.id.OnlineL);
        cash = newCardFragView.findViewById(R.id.CashL);
        credit = newCardFragView.findViewById(R.id.Credit);
        spineer = newCardFragView.findViewById(R.id.chooseType);
        return newCardFragView;
    }



    public void makeNewCard(View view){
        checkingString=cheking.getText().toString();
        onlineString= online.getText().toString();
        cashString = cash.getText().toString();
        creditString = credit.getText().toString();
        account.addCard(checkingString, onlineString, cashString, creditString, spineer.getSelectedItem().toString());
        //todo make toast here
        //((userCards)getActivity()).hide();//todo this doesn't work
    }

}