package org.example.youtubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.youtube.player.YouTubeStandalonePlayer;


public class StandaloneActivity extends Activity implements View.OnClickListener {
	public static final String GOOGLE_API_KEY = "AIzaSyDz8zZa496ObJjqw25a-0LMoSOxMQW7Gbc";
	public static final String YOUTUBE_VIDEO_ID = "tSuh8fDboA8";
	public static final String YOUTUBE_PLAYLIST_ID = "RDtSuh8fDboA8";
	
	private Button btnPlay;
	private Button btnPlayPlaylist;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.standalone);
		
		btnPlay = (Button) findViewById(R.id.btnStart);
		btnPlayPlaylist = (Button) findViewById(R.id.btnPlaylist);
		
		btnPlay.setOnClickListener(this);
		btnPlayPlaylist.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		if(v == btnPlay){
			//play single video
			intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
		}else if(v == btnPlayPlaylist){
			//play playlist
			intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
		}
		
		if(intent != null){
			startActivityForResult(intent, 0);
		}
		
	}

	
}
