package com.example.share;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.share.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class shareadapter extends BaseAdapter {
    private Context mContext;
    private int mResource;
    private ArrayList<claimshare> mData;

    public shareadapter(Context context, int resource, ArrayList<claimshare> data) {
        mContext = context;
        mResource = resource;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(mResource, parent, false);
        }
        TextView time_txt = (TextView) convertView.findViewById(R.id.time_txt);
        time_txt.setText(mData.get(position).Time);
        TextView sharename_txt = (TextView) convertView.findViewById(R.id.sharename_text);
        sharename_txt.setText(mData.get(position).Sharename);
        TextView tag1_txt = (TextView) convertView.findViewById(R.id.tag1_txt);
        tag1_txt.setText(mData.get(position).Tag1);
        TextView tag2_txt = (TextView) convertView.findViewById(R.id.tag2_txt);
        tag2_txt.setText(mData.get(position).Tag2);
        TextView tag3_txt = (TextView) convertView.findViewById(R.id.tag3_txt);
        tag3_txt.setText(mData.get(position).Tag3);
        Button btn=(Button)convertView.findViewById(R.id.checkdetail);
        btn.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(mContext,sendshare.class);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }
}
