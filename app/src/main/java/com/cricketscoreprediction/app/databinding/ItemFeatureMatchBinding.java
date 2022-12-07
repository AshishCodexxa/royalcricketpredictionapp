package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.CustomProgressBar;

public final class ItemFeatureMatchBinding implements ViewBinding {
    public final CardView cardItemFm;
    public final CardView cardLoader;
    public final CardView cardPlayer;
    public final FrameLayout click;
    public final CustomProgressBar customProgressBar;
    public final FrameLayout frame;
    public final ImageView imgItemAFlag;
    public final ImageView imgItemHFlag;
    public final ImageView imgPlayerOfTheMatchImage;
    public final LinearLayout llItemFm;
    public final LinearLayout llPrediction;
    public final LinearLayout llScore;
    public final LinearLayout llScore1;
    public final RelativeLayout rlNoProjection;
    public final RelativeLayout rlPlayerOfTheMatch;
    private final CardView rootView;
    public final RecyclerView rvFeatureTeam;
    public final TextView txtAway;
    public final TextView txtAwayPer;
    public final TextView txtHome;
    public final TextView txtHomePer;
    public final TextView txtItemATeam;
    public final TextView txtItemDate;
    public final TextView txtItemFmLive;
    public final TextView txtItemFmMatchNo;
    public final TextView txtItemFmMatchStatus;
    public final TextView txtItemFmSeriesName;
    public final TextView txtItemFmVenue;
    public final TextView txtItemHTeam;
    public final TextView txtItemTime;
    public final TextView txtPlayerOfTheMatchName;
    public final TextView txtTie;
    public final TextView txtTiePer;

    private ItemFeatureMatchBinding(CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, FrameLayout frameLayout, CustomProgressBar customProgressBar2, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        this.rootView = cardView;
        this.cardItemFm = cardView2;
        this.cardLoader = cardView3;
        this.cardPlayer = cardView4;
        this.click = frameLayout;
        this.customProgressBar = customProgressBar2;
        this.frame = frameLayout2;
        this.imgItemAFlag = imageView;
        this.imgItemHFlag = imageView2;
        this.imgPlayerOfTheMatchImage = imageView3;
        this.llItemFm = linearLayout;
        this.llPrediction = linearLayout2;
        this.llScore = linearLayout3;
        this.llScore1 = linearLayout4;
        this.rlNoProjection = relativeLayout;
        this.rlPlayerOfTheMatch = relativeLayout2;
        this.rvFeatureTeam = recyclerView;
        this.txtAway = textView;
        this.txtAwayPer = textView2;
        this.txtHome = textView3;
        this.txtHomePer = textView4;
        this.txtItemATeam = textView5;
        this.txtItemDate = textView6;
        this.txtItemFmLive = textView7;
        this.txtItemFmMatchNo = textView8;
        this.txtItemFmMatchStatus = textView9;
        this.txtItemFmSeriesName = textView10;
        this.txtItemFmVenue = textView11;
        this.txtItemHTeam = textView12;
        this.txtItemTime = textView13;
        this.txtPlayerOfTheMatchName = textView14;
        this.txtTie = textView15;
        this.txtTiePer = textView16;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemFeatureMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFeatureMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_feature_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFeatureMatchBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.card_loader;
        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_loader);
        if (cardView2 != null) {
            i = R.id.card_player;
            CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
            if (cardView3 != null) {
                i = R.id.click;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.click);
                if (frameLayout != null) {
                    i = R.id.customProgressBar;
                    CustomProgressBar customProgressBar2 = (CustomProgressBar) ViewBindings.findChildViewById(view, R.id.customProgressBar);
                    if (customProgressBar2 != null) {
                        i = R.id.frame;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame);
                        if (frameLayout2 != null) {
                            i = R.id.img_item_a_flag;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_a_flag);
                            if (imageView != null) {
                                i = R.id.img_item_h_flag;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_h_flag);
                                if (imageView2 != null) {
                                    i = R.id.img_playerOfTheMatchImage;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerOfTheMatchImage);
                                    if (imageView3 != null) {
                                        i = R.id.ll_item_fm;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_item_fm);
                                        if (linearLayout != null) {
                                            i = R.id.ll_prediction;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prediction);
                                            if (linearLayout2 != null) {
                                                i = R.id.ll_score;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score);
                                                if (linearLayout3 != null) {
                                                    i = R.id.ll_score_;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score_);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.rl_no_projection;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_no_projection);
                                                        if (relativeLayout != null) {
                                                            i = R.id.rl_player_of_the_match;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_player_of_the_match);
                                                            if (relativeLayout2 != null) {
                                                                i = R.id.rv_feature_team;
                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_feature_team);
                                                                if (recyclerView != null) {
                                                                    i = R.id.txt_away;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_away);
                                                                    if (textView != null) {
                                                                        i = R.id.txt_away_per;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_away_per);
                                                                        if (textView2 != null) {
                                                                            i = R.id.txt_home;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_home);
                                                                            if (textView3 != null) {
                                                                                i = R.id.txt_home_per;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_home_per);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.txt_item_a_team;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_a_team);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.txt_item_date;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_date);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.txt_item_fm_live;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_fm_live);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.txt_item_fm_matchNo;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_fm_matchNo);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.txt_item_fm_matchStatus;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_fm_matchStatus);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.txt_item_fm_seriesName;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_fm_seriesName);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.txt_item_fm_venue;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_fm_venue);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.txt_item_h_team;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_h_team);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = R.id.txt_item_time;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_time);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.txt_playerOfTheMatchName;
                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_playerOfTheMatchName);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i = R.id.txt_tie;
                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_tie);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i = R.id.txt_tie_per;
                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_tie_per);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    return new ItemFeatureMatchBinding(cardView, cardView, cardView2, cardView3, frameLayout, customProgressBar2, frameLayout2, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, relativeLayout2, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
