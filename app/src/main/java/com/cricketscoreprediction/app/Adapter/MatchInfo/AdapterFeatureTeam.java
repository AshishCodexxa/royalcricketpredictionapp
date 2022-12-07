package com.cricketscoreprediction.app.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.MiniScoreCardQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterFeatureTeam extends RecyclerView.Adapter<AdapterFeatureTeam.ViewHolder> {
    Context context;
    List<MiniScoreCardQuery.MatchScore> matchScores;

    public AdapterFeatureTeam(Context context2, List<MiniScoreCardQuery.MatchScore> list) {
        this.context = context2;
        this.matchScores = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_feature_team, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_item_team.setText(this.matchScores.get(i).teamShortName());
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) with.load(Glob.flag_start + this.matchScores.get(i).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_item_flag);
        AdapterFeatureTeamScore adapterFeatureTeamScore = new AdapterFeatureTeamScore(this.context, this.matchScores.get(i).teamScore());
        viewHolder.rv_item_score.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false));
        viewHolder.rv_item_score.setAdapter(adapterFeatureTeamScore);
    }

    @Override 
    public int getItemCount() {
        return this.matchScores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item_flag;
        RecyclerView rv_item_score;
        TextView txt_item_team;

        public ViewHolder(View view) {
            super(view);
            this.txt_item_team = (TextView) view.findViewById(R.id.txt_item_team);
            this.rv_item_score = (RecyclerView) view.findViewById(R.id.rv_item_score);
            this.img_item_flag = (ImageView) view.findViewById(R.id.img_item_flag);
        }
    }
}
