package com.example.brahmantyo.ratih_1202150244_modul6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by telkom on 31/03/2018.
 */

public class adapterKomen extends RecyclerView.Adapter<adapterKomen.CommentHolder>{
    Context con; //inisiasi objek
    List<databaseKomen> list;

    public adapterKomen(Context con, List<databaseKomen> list) {
        this.con = con; //mendeklarsikan objek
        this.list = list;
    }
    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CommentHolder(LayoutInflater.from(con).inflate(R.layout.cv_comment, parent, false));
    }

    @Override
    public void onBindViewHolder(CommentHolder holder, int position) { //menambahkan list komen
        databaseKomen cur = list.get(position);
        holder.sikomen.setText(cur.getSikomen());
        holder.komen.setText(cur.getKomen());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CommentHolder extends RecyclerView.ViewHolder {
        TextView sikomen, komen; //inisiasi objek
        public CommentHolder(View itemView) {
            super(itemView);
            sikomen = itemView.findViewById(R.id.yangkomen);
            komen = itemView.findViewById(R.id.komen);
        }
    }
}
