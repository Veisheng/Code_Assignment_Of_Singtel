package com.assignment.singtel.requestDto;

import java.util.HashMap;
import java.util.Map;

import com.assignment.singtel.constant.AnimalAction;
import com.assignment.singtel.constant.Language;

/**
 * Rooster class
 * 
 * @author Veisheng
 *
 */
public class Rooster extends Chicken {

	private static final Map<String, String> soundsMap;
	static {
		soundsMap = new HashMap<String, String>();
		soundsMap.put("English", "Cock-a-doodle-doo");
		soundsMap.put("Danish", "kykyliky");
		soundsMap.put("Dutch", "kukeleku");
		soundsMap.put("Finnish", "kukko kiekuu");
		soundsMap.put("French", "cocorico");
		soundsMap.put("German", "kikeriki");
		soundsMap.put("Greek", "kikiriki");
		soundsMap.put("Hebrew", "coo-koo - ri-koo");
		soundsMap.put("Hungarian", "kukuriku");
		soundsMap.put("Italian", "chicchirichi");
		soundsMap.put("Japanese", "ko - ke - kok - ko -o");
		soundsMap.put("Portuguese", "cucurucu");
		soundsMap.put("Russian", "kukareku");
		soundsMap.put("Swedish", "kuckeliku");
		soundsMap.put("Turkish", "kuk-kurri-kuuu");
		soundsMap.put("Urdu", "kuklooku");
	}
	
	public boolean sing(String language) {
		if (language != null) {
			System.out.println(soundsMap.get(language));
		} else {
			System.out.println(soundsMap.get(Language.ENGLISH.getLanguage()));
		}
		return true;
	}

	@Override
	public boolean isFly() {
		System.out.println(AnimalAction.I_AM_NOT_FLYING.getActions());
		return false;
	}
}
