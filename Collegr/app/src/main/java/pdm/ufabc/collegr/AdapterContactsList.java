package pdm.ufabc.collegr;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by vitor on 4/12/15.
 */
public class AdapterContactsList extends RecyclerView.Adapter<AdapterContactsList.MyViewHolder> {
    private LayoutInflater inflater;
    List<User> data = Collections.emptyList();
    Context c;


    public AdapterContactsList(Context c, List<User> externalData) {
        inflater = LayoutInflater.from(c);
        data = externalData;
        this.c = c;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = inflater.inflate(R.layout.row_adapter_contacts, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        User current = data.get(i);
        viewHolder.title.setText(current.getNome());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView icon;
        LinearLayout row;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.contacts_row_title);
            icon = (ImageView) itemView.findViewById(R.id.contacts_row_image);
            row = (LinearLayout) itemView.findViewById(R.id.row_layout);
            row.setOnClickListener(this);
        }

        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
        @Override
        public void onClick(View v) {


            if(Build.VERSION.SDK_INT > 21) v.setTransitionName("profile_picture");
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((android.app.Activity) c, v, "profile_picture");
            Intent i = new Intent(c, chatActivity.class);
            i.putExtra("username", ""+data.get(getPosition()).getNome());
            c.startActivity(i, optionsCompat.toBundle());
        }



    }
}
