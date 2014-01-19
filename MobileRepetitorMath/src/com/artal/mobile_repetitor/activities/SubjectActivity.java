package com.artal.mobile_repetitor.activities;


import com.artal.mobile_repetitor.R;
import com.artal.mobile_repetitor.activities.ChooseTrainingActivity;
import com.artal.mobile_repetitor.testEntities.SubjectsEnumeration;
import com.artalgame.mobile_repetitor.data.SubjectHelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
			
	public class SubjectActivity extends Activity
	{
		protected SubjectsEnumeration subjectType;
		protected String subjectName;

		protected void OnCreate (Bundle bundle)
		{
			super.onCreate (bundle);
			setContentView (R.layout.subject_activity);

			subjectType = Enum.valueOf(SubjectsEnumeration.class, getIntent().getStringExtra("TestType"));
			
			subjectName = SubjectHelper.getSubjectName(subjectType, this);
			SetSubjectNameTextView ();
			LoadStatistics ();
			((Button) findViewById (R.id.TraningButton)).setOnClickListener( TrainingButtonClick());
		}

		private OnClickListener TrainingButtonClick()
		{
			return new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Intent intent = new Intent (v.getContext(), ChooseTrainingActivity.class);
					intent.putExtra ("SubjectType", subjectType.toString());
					startActivity (intent);
				}
			};			
		}

		private void TestButtonClick()
		{
			
		}

		protected void SetSubjectNameTextView()
		{
			((TextView)findViewById (R.id.SubjectNameTextView)).setText(subjectName, TextView.BufferType.NORMAL);
		}

		protected void LoadStatistics()
		{
//			SubjectRetriever retriever = new SubjectRetriever (subjectType, this);
//			var statistic = retriever.GetStatistic ();
//			int overall = statistic.X;
//			int right = statistic.Y;
//
//			FindViewById<TextView> (Resource.Id.OverallTextView).Text = "Всего попыток: " + overall;
//			FindViewById<TextView> (Resource.Id.RightTextView).Text = "Успешных попыток: " + right;
//			int percent = overall == 0 ? 0 : (int)(((float)right / (float)overall) * 100);
//			FindViewById<TextView> (Resource.Id.ProcentTextView).Text = "Процент правильных ответов: " + percent;
		}
	}