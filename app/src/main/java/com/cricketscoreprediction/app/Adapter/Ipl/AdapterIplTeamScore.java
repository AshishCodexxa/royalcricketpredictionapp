package com.cricketscoreprediction.app.Adapter.Ipl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketscoreprediction.app.MatcheslistQuery;
import com.cricketscoreprediction.app.R;

import java.util.List;

public class AdapterIplTeamScore extends RecyclerView.Adapter<AdapterIplTeamScore.ViewHolder> {
    Context context;
    List<MatcheslistQuery.TeamScore> teamScores;

    public AdapterIplTeamScore(Context context2, List<MatcheslistQuery.TeamScore> list) {
        this.context = context2;
        this.teamScores = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_feature_team_score, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String runsScored = this.teamScores.get(i).runsScored();
        String wickets = this.teamScores.get(i).wickets();
        String overs = this.teamScores.get(i).overs();
        if (runsScored.length() == 0) {
            return;
        }
        if (this.teamScores.size() > 1) {
            viewHolder.txt_item_team_score.setText(String.format("%s%s%s  %S", runsScored, "/", wickets, "&"));
            if (i == 1) {
                viewHolder.txt_item_team_score.setText(String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")"));
                return;
            }
            return;
        }
        viewHolder.txt_item_team_score.setText(String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")"));
    }

    @Override 
    public int getItemCount() {
        return this.teamScores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_team_score;
        TextView txt_item_team_score;

        public ViewHolder(View view) {
            super(view);
            this.txt_item_team_score = (TextView) view.findViewById(R.id.txt_item_team_score);
            this.ll_team_score = (LinearLayout) view.findViewById(R.id.ll_team_score);
        }
    }
}
