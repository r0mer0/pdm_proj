package pdm.ufabc.collegr.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.adapters.SlideInRightAnimationAdapter;
import pdm.ufabc.collegr.AdapterContactsList;
import pdm.ufabc.collegr.App;
import pdm.ufabc.collegr.R;
import pdm.ufabc.collegr.User;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab2 extends Fragment {

    RecyclerView recyclerView;
    AdapterContactsList adapterContactsList;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2,container,false);

        recyclerView = (RecyclerView) v.findViewById(R.id.list_contacts);
        adapterContactsList = new AdapterContactsList(getActivity(), getData());
        SlideInRightAnimationAdapter slideInRightAnimationAdapter = new SlideInRightAnimationAdapter(adapterContactsList);

        recyclerView.setAdapter(slideInRightAnimationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }


    public List<User> getData(){
        List<User> users = new ArrayList<User>();
        users.add(new User("Mariana"));
        users.add(new User("Juliana"));
        users.add(new User("Julieta"));
        users.add(new User("Marieta"));
        users.add(new User("Aline"));
        users.add(new User("Yasmine"));
        users.add(new User("Jaqueline"));
        users.add(new User("Stephane"));
        users.add(new User("Francine"));
        users.add(new User("Carla"));
        users.add(new User("Yara"));
        users.add(new User("Maura"));
        users.add(new User("Jussara"));
        users.add(new User("Eliza"));
        users.add(new User("Mariza"));

        users.add(new User("Mariana"));
        users.add(new User("Juliana"));
        users.add(new User("Julieta"));
        users.add(new User("Marieta"));
        users.add(new User("Aline"));
        users.add(new User("Yasmine"));
        users.add(new User("Jaqueline"));
        users.add(new User("Stephane"));
        users.add(new User("Francine"));
        users.add(new User("Carla"));
        users.add(new User("Yara"));
        users.add(new User("Maura"));
        users.add(new User("Jussara"));
        users.add(new User("Eliza"));
        users.add(new User("Mariza"));

        users.add(new User("Mariana"));
        users.add(new User("Juliana"));
        users.add(new User("Julieta"));
        users.add(new User("Marieta"));
        users.add(new User("Aline"));
        users.add(new User("Yasmine"));
        users.add(new User("Jaqueline"));
        users.add(new User("Stephane"));
        users.add(new User("Francine"));
        users.add(new User("Carla"));
        users.add(new User("Yara"));
        users.add(new User("Maura"));
        users.add(new User("Jussara"));
        users.add(new User("Eliza"));
        users.add(new User("Mariza"));

        return users;
    }




}