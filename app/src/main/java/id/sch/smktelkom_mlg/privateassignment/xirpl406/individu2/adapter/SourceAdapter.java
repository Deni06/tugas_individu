package id.sch.smktelkom_mlg.privateassignment.xirpl406.individu2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import id.sch.smktelkom_mlg.privateassignment.xirpl406.individu2.R;
import id.sch.smktelkom_mlg.privateassignment.xirpl406.individu2.model.Source;

/**
 * Created by Windows XP on 15/05/2017.
 */

public class SourceAdapter extends RecyclerView.Adapter<SourceAdapter.ViewHolder> {
    public static final String IMAGE_URL_BASE_PATH = "http://image.tmdb.org/t/p/w500";
    ArrayList<Source> list;
    ISourceAdapter mISourceAdapter;
    Context context;

    public SourceAdapter(Context context, ArrayList<Source> list) {
        this.list = list;
        mISourceAdapter = (ISourceAdapter) context;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Source source = list.get(position);
        holder.tvName.setText(source.title);
        holder.tvDesc.setText(source.overview);
        holder.itemView.setBackgroundColor(source.color);
        Glide.with(context)
                .load(IMAGE_URL_BASE_PATH + source.poster_path)
                .into(holder.ivPoster);
    }

    @Override
    public int getItemCount() {
        if (list != null)
            return list.size();
        return 0;
    }

    public interface ISourceAdapter {
        void showArticles(String id, String name, String sortBy);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPoster;
        TextView tvName;
        TextView tvDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDesc = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            ivPoster = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Source source = list.get(getAdapterPosition());
                    List<String> sort = source.sortBysAvailable;
                    mISourceAdapter.showArticles(source.id, source.title, sort.get(sort.size() - 1));
                }
            });
        }
    }
}
