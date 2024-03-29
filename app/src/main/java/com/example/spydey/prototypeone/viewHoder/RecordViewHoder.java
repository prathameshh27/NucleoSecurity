package com.example.spydey.prototypeone.viewHoder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.spydey.prototypeone.R;

public class RecordViewHoder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView titleTextView, openTimeDateTextView, closeTimeDateTextView;

    public View itemView;

    public RecordViewHoder(final View itemView) {
        super(itemView);
        titleTextView = (TextView) itemView.findViewById(R.id.recordName);
        openTimeDateTextView =(TextView) itemView.findViewById(R.id.openTimeDate);;
        closeTimeDateTextView= (TextView) itemView.findViewById(R.id.closeTimeDate);
        this.itemView = itemView;
    }

    @Override
    public void onClick(View view) { }
}
