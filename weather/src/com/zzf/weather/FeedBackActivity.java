package com.zzf.weather;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zzf.weather.util.T;
import com.way.ui.swipeback.SwipeBackActivity;

public class FeedBackActivity extends SwipeBackActivity {
	private EditText mFeedBackEt;
	private Button mSendBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feed_back_view);
		((TextView) findViewById(R.id.city_title)).setText("����");
		findViewById(R.id.back_image).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
		mFeedBackEt = (EditText) findViewById(R.id.fee_back_edit);
		mSendBtn = (Button) findViewById(R.id.feed_back_btn);
		mSendBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String content = mFeedBackEt.getText().toString();
				if (!TextUtils.isEmpty(content)) {
					Intent intent = new Intent(Intent.ACTION_SENDTO);
					intent.setType("text/plain");
					intent.putExtra(Intent.EXTRA_SUBJECT, "��Ϣ����");
					intent.putExtra(Intent.EXTRA_TEXT, content);
					intent.setData(Uri.parse("mailto:1048960745@qq.com"));
					intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					FeedBackActivity.this.startActivity(intent);
				} else {
					T.showShort(FeedBackActivity.this, "�����뷴����Ϣ��");
				}
			}
		});
	}
}
