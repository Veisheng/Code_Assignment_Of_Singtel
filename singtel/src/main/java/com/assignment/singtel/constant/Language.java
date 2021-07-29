package com.assignment.singtel.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Language {
	ENGLISH("English"),
	DANISH("Danish"),
	DUTCH("Dutch"),
	FINNISH("Finnish"),
	FRENCH("French"),
	GERMAN("German"),
	GREEK("Greek"),
	HEBREW("Hebrew"),
	HUNGARIAN("Hungarian"),
	ITALIAN("Italian"),
	JAPANESE("Japanese"),
	PORTUGUESE("Portuguese"),
	RUSSIAN("Russian"),
	SWEDISH("Swedish"),
	TURKISH("Turkish"),
	URDU("Urdu");
	
	private final String language;
}
