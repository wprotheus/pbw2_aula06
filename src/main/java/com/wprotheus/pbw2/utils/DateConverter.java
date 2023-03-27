package com.wprotheus.pbw2.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class DateConverter
{
	public static String dateConverter(LocalDate data)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(data);
	}
}