//package com.developndesign.firebaseautomlvisionedge;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.Context;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
////public class ActivityCustomListView extends ArrayAdapter<String> {
////    private String[] workoutName;
////    private String[] workoutReps;
////    private Integer[] imgid;
////    private Activity context;
////
////
////    public ActivityCustomListView(Activity context, String[] workoutName, String[] workoutReps, Integer[] imgid) {
////        super(context, R.layout.activity_custom_list_view, workoutName);
////        this.context = (Activity) context;
////        this.workoutName = workoutName;
////        this.workoutReps = workoutReps;
////        this.imgid = imgid;
////
////
////    }
////    @NonNull
////    @Override
////public View getView(int position, @Nullable View convertView,  @NonNull ViewGroup parent) {
////    View r=convertView;
////    ViewHolder viewHolder=null;
////    if(r==null) {
////        LayoutInflater layoutInflater=context.getLayoutInflater();
////        r=layoutInflater.inflate(R.layout.activity_custom_list_view,null, true);
////        viewHolder=new ViewHolder(r);
////        r.setTag(viewHolder);
////
////    } else {
////        viewHolder=(ViewHolder) r.getTag();
////    }
////
////    viewHolder.ivw.setImageResource(imgid[position]);
////    viewHolder.tvw1.setText(workoutName[position]);
////    viewHolder.tvw2.setText(workoutReps[position]);
////
////
////
////    return convertView;
////}
////    class ViewHolder{
////        TextView tvw1;
////        TextView tvw2;
////        ImageView ivw;
////
////
////        ViewHolder(View v) {
////           tvw1=v.findViewById(R.id.text_Workout);
////           tvw2=v.findViewById(R.id.text_Reps);
////            ivw=v.findViewById(R.id.image_Template);
////
////
////        }
////
////    }
//}
