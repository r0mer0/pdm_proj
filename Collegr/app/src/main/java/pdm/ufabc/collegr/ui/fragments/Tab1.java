package pdm.ufabc.collegr.ui.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.andtinder.model.CardModel;
import com.andtinder.model.Orientations;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;

import pdm.ufabc.collegr.R;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);
        CardContainer mCardContainer = (CardContainer) v.findViewById(R.id.cardContainer);


        CardModel card = new CardModel("Deborah", "Daredevil", getResources().getDrawable(R.drawable.woll));
        CardModel card2 = new CardModel("katheryn", "Vikings", getResources().getDrawable(R.drawable.kathwinnic));
        CardModel card3 = new CardModel("Juliana Paes", "BR", getResources().getDrawable(R.drawable.jupaes));


        card.setOnCardDimissedListener(new CardModel.OnCardDimissedListener
                () {
            @Override
            public void onLike() {
                Toast.makeText(getActivity(), "Você gostou dela", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDislike() {
                Toast.makeText(getActivity(), "Você não gostou dela", Toast.LENGTH_SHORT).show();
            }
        });

        card2.setOnCardDimissedListener(new CardModel.OnCardDimissedListener() {
            @Override
            public void onLike() {
                Toast.makeText(getActivity(), "Você gostou dela", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDislike() {
                Toast.makeText(getActivity(), "Você não gostou dela", Toast.LENGTH_SHORT).show();
            }
        });

        card3.setOnCardDimissedListener(new CardModel.OnCardDimissedListener() {
            @Override
            public void onLike() {
                Toast.makeText(getActivity(), "Você gostou dela", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDislike() {
                Toast.makeText(getActivity(), "Você não gostou dela", Toast.LENGTH_SHORT).show();
            }
        });

        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(getActivity());

        adapter.add(card);
        adapter.add(card2);
        adapter.add(card3);

        mCardContainer.setAdapter(adapter);


        return v;
    }
}