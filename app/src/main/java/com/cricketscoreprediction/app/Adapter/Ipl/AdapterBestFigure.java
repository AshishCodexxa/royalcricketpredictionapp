package com.cricketscoreprediction.app.Adapter.Ipl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.GetStatsResolverQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterBestFigure extends RecyclerView.Adapter<AdapterBestFigure.ViewHolder> {
    List<GetStatsResolverQuery.Best_figure1> best_figure;
    Context context;
    OnItemClickListener onItemClickListener;
    int selected = 0;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterBestFigure(Context context2, List<GetStatsResolverQuery.Best_figure1> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.best_figure = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_highest_score, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        if (this.selected == i) {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
            viewHolder.ll_hs.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_run.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_vs.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_opponent.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
        } else {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.ll_hs.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
            viewHolder.txt_run.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_ball.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
            viewHolder.txt_vs.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_opponent.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
        }
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.best_figure.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).placeholder(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
        viewHolder.txt_player_name.setText(this.best_figure.get(i).player_name());
        viewHolder.txt_team_name.setText(this.best_figure.get(i).team_short_name());
        viewHolder.txt_run.setText(this.best_figure.get(i).best_bowling_figures());
        TextView textView = viewHolder.txt_ball;
        textView.setText("(" + this.best_figure.get(i).overs() + ")");
        viewHolder.txt_opponent.setText(this.best_figure.get(i).vs_team_short_name());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterBestFigure.this.onItemClickListener.onItemClick(AdapterBestFigure.this.best_figure.get(i).player_id());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.best_figure.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_playerImage;
        LinearLayout ll_hs;
        TextView txt_ball;
        TextView txt_opponent;
        TextView txt_player_name;
        TextView txt_run;
        TextView txt_team_name;
        TextView txt_vs;

        public ViewHolder(View view) {
            super(view);
            this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
            this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
            this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
            this.ll_hs = (LinearLayout) view.findViewById(R.id.ll_hs);
            this.txt_run = (TextView) view.findViewById(R.id.txt_run);
            this.txt_ball = (TextView) view.findViewById(R.id.txt_ball);
            this.txt_vs = (TextView) view.findViewById(R.id.txt_vs);
            this.txt_opponent = (TextView) view.findViewById(R.id.txt_opponent);
        }
    }
}
