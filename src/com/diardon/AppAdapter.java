package com.diardon;

import com.diardon.adapter.AudioPlayer;
import com.diardon.adapter.MediaPlayer;

/*
 * Explicaci�n
 * - MediaPlayer: Define la interfaz que los clientes utilizan.
 * - AudioPlayer: Es la implementaci�n existente que solo soporta MP3 (antes del adapter).
 * - AdvancedMediaPlayer: Es la nueva funcionalidad que debe integrarse (MP4, VLC).
 * - MediaAdapter: Hace que AdvancedMediaPlayer sea compatible con la interfaz MediaPlayer.
 * - Clase principal: Integra todo, permitiendo usar la funcionalidad existente y nueva sin modificar la implementaci�n base de AudioPlayer.
 */
/**
 * Clase principal para demostrar el uso del patr�n Adapter
 */
public class AppAdapter
{
    public static void main(String[] args)
    {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cancion.mp3");	// Reproduciendo MP3
        audioPlayer.play("mp4", "video.mp4");	// Reproduciendo MP4 a trav�s del adaptador
        audioPlayer.play("mkv", "peli.mkv");	// Formato no soportado
    }
}
