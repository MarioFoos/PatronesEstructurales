package com.diardon.adapter;

public class MediaAdapter implements MediaPlayer
{
	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType)
	{
		if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedMediaPlayer = new AdvancedMediaPlayer();
		}
	}
	@Override
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedMediaPlayer.playMp4(fileName);
		}
		else
		{
			System.out.println("Formato no soportado por el adaptador: " + audioType);
		}
	}
}
