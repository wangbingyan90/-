package com.wangby.www.t;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 王炳炎 on 2017/5/21.
 */

public class Main extends Activity implements View.OnClickListener {

    Dialog mDialog;
    Context mContext;
    ImageView imageView;
    TextView takePic;
    TextView cancelTxt;
    TextView selectAlbum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        ini();
    }


    public void ini(){
        imageView = (ImageView) findViewById(R.id.image);
        mDialog = new Dialog(mContext, R.style.MyDialog);
        mDialog.setContentView(R.layout.issue_dialog);
        mDialog.setCanceledOnTouchOutside(true);//对话框的外面点击，是否让对话框消失
        takePic = (TextView) mDialog.findViewById(R.id.take_pictures);
        cancelTxt = (TextView) mDialog.findViewById(R.id.select_cancel);
        selectAlbum = (TextView) mDialog.findViewById(R.id.select_photo);

        takePic.setOnClickListener( this);
        selectAlbum.setOnClickListener(this);
        cancelTxt.setOnClickListener(this);
        imageView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.select_cancel:
                mDialog.dismiss();
                break;
            case R.id.image:
                mDialog.show();
                break;



        }

    }



}
