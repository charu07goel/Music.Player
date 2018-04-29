package com.example.charugoel.musicplayer;

/**
 * Created by Charu Goel on 21-04-2018.
 */

public class SongInfo {
    public String songName, artistName, songURL;

    public SongInfo() {
    }

    public SongInfo(String songName, String artistName, String songURL) {
        this.songName = songName;
        this.artistName = artistName;
        this.songURL = songURL;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongURL() {
        return songURL;
    }
}

