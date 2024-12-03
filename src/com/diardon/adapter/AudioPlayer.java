package com.diardon.adapter;

public class AudioPlayer implements MediaPlayer
{
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Reproduciendo MP3: " + fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else
		{
			System.out.println("Formato no soportado: " + audioType);
		}
	}
}
