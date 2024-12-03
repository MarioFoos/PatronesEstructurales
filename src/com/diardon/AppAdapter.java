package com.diardon;

import com.diardon.adapter.AudioPlayer;
import com.diardon.adapter.MediaPlayer;

/*
 * Explicación
 * - MediaPlayer: Define la interfaz que los clientes utilizan.
 * - AudioPlayer: Es la implementación existente que solo soporta MP3 (antes del adapter).
 * - AdvancedMediaPlayer: Es la nueva funcionalidad que debe integrarse (MP4, VLC).
 * - MediaAdapter: Hace que AdvancedMediaPlayer sea compatible con la interfaz MediaPlayer.
 * - Clase principal: Integra todo, permitiendo usar la funcionalidad existente y nueva sin modificar la implementación base de AudioPlayer.
 */
/**
 * Clase principal para demostrar el uso del patrón Adapter
 */
public class AppAdapter
{
    public static void main(String[] args)
    {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cancion.mp3");	// Reproduciendo MP3
        audioPlayer.play("mp4", "video.mp4");	// Reproduciendo MP4 a través del adaptador
        audioPlayer.play("mkv", "peli.mkv");	// Formato no soportado
    }
}
