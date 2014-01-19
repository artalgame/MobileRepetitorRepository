package com.artalgame.mobile_repetitor.data;

import android.content.Context;


import com.artal.mobile_repetitor.R;
import com.artal.mobile_repetitor.testEntities.SubjectsEnumeration;

/**
 * Use this class to apply simple operations with subjects.
 * @author Alexander Korolchuk
 *
 */
public class SubjectHelper
{
	public static String getSubjectName (SubjectsEnumeration subjectType, Context context)
	{
		String subjectName = null;
		switch (subjectType) {
		case Math:
			subjectName = context.getString(R.string.Math);
			break;
		}
		return subjectName;
	}
}