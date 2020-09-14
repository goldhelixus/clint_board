package com.example.clintboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer clint_iq = MediaPlayer.create(this, R.raw.clint_iq);
        final MediaPlayer clint_reset = MediaPlayer.create(this, R.raw.clint_reset);
        final MediaPlayer clint_g = MediaPlayer.create(this, R.raw.clint_g);
        final MediaPlayer clint_nerd = MediaPlayer.create(this, R.raw.clint_nerd);
        final MediaPlayer clint_rare_peng = MediaPlayer.create(this, R.raw.clint_rare_peng);
        final MediaPlayer clint_thot = MediaPlayer.create(this, R.raw.clint_thot);
        final MediaPlayer clint_good = MediaPlayer.create(this, R.raw.clint_good);
        final MediaPlayer clint_suave = MediaPlayer.create(this, R.raw.clint_suave);
        final MediaPlayer clint_hd = MediaPlayer.create(this, R.raw.clint_hd);
        final MediaPlayer clint_w = MediaPlayer.create(this, R.raw.clint_w);
        final MediaPlayer clint_lu = MediaPlayer.create(this, R.raw.clint_lu);
        final MediaPlayer clint_yo = MediaPlayer.create(this, R.raw.clint_yo);
        final MediaPlayer clint_hands = MediaPlayer.create(this, R.raw.clint_hands);
        final MediaPlayer clint_fug = MediaPlayer.create(this, R.raw.clint_fug);
        final MediaPlayer clint_hypers = MediaPlayer.create(this, R.raw.clint_hypers);

        ImageButton imageButtoniq = (ImageButton) this.findViewById(R.id.imageButton_iq);
        ImageButton imageButtonr = (ImageButton) this.findViewById(R.id.imageButton_r);
        ImageButton imageButtong = (ImageButton) this.findViewById(R.id.imageButton_g);
        ImageButton imageButtonnerd = (ImageButton) this.findViewById(R.id.imageButton_nerd);
        ImageButton imageButtonrare_peng = (ImageButton) this.findViewById(R.id.imageButton_rare_peng);
        ImageButton imageButtonthot = (ImageButton) this.findViewById(R.id.imageButton_thot);
        ImageButton imageButtongood = (ImageButton) this.findViewById(R.id.imageButton_good);
        ImageButton imageButtonsuave = (ImageButton) this.findViewById(R.id.imageButton_suave);
        ImageButton imageButtonhd = (ImageButton) this.findViewById(R.id.imageButton_hd);
        ImageButton imageButtonw = (ImageButton) this.findViewById(R.id.imageButton_w);
        ImageButton imageButtonlu = (ImageButton) this.findViewById(R.id.imageButton_lu);
        ImageButton imageButtonyo = (ImageButton) this.findViewById(R.id.imageButton_yo);
        ImageButton imageButtonhands = (ImageButton) this.findViewById(R.id.imageButton_hands);
        ImageButton imageButtonfug = (ImageButton) this.findViewById(R.id.imageButton_fug);
        ImageButton imageButtonhypers = (ImageButton) this.findViewById(R.id.imageButton_hypers);

        imageButtonhypers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_hypers.start();
            }
        });
        imageButtonfug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_fug.start();
            }
        });
        imageButtonhands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_hands.start();
            }
        });
        imageButtonyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_yo.start();
            }
        });
        imageButtonlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_lu.start();
            }
        });
        imageButtonw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_w.start();
            }
        });
        imageButtonhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_hd.start();
            }
        });
        imageButtonsuave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_suave.start();
            }
        });
        imageButtongood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_good.start();
            }
        });
        imageButtonthot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_thot.start();
            }
        });
        imageButtonrare_peng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_rare_peng.start();
            }
        });
        imageButtonnerd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_nerd.start();
            }
        });
        imageButtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clint_g.start();
            }
        });
        imageButtoniq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clint_iq.start();
            }
        });
        imageButtonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clint_reset.start();
            }
        });

    }

    public void playHD(View view) {
    }
}
