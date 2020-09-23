package com.example.clintboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Single mediaplayer declaration, used as a global variable
    public MediaPlayer clint_sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ImageButton Declarations
        ImageButton imageButtoniq = this.findViewById(R.id.imageButton_iq);
        ImageButton imageButtonr = this.findViewById(R.id.imageButton_r);
        ImageButton imageButtong = this.findViewById(R.id.imageButton_g);
        ImageButton imageButtonnerd = this.findViewById(R.id.imageButton_nerd);
        ImageButton imageButtonrare_peng = this.findViewById(R.id.imageButton_rare_peng);
        ImageButton imageButtonthot = this.findViewById(R.id.imageButton_thot);
        ImageButton imageButtongood = this.findViewById(R.id.imageButton_good);
        ImageButton imageButtonsuave = this.findViewById(R.id.imageButton_suave);
        ImageButton imageButtonhd = this.findViewById(R.id.imageButton_hd);
        ImageButton imageButtonw = this.findViewById(R.id.imageButton_w);
        ImageButton imageButtonlu = this.findViewById(R.id.imageButton_lu);
        ImageButton imageButtonyo = this.findViewById(R.id.imageButton_yo);
        ImageButton imageButtonhands = this.findViewById(R.id.imageButton_hands);
        ImageButton imageButtonfug = this.findViewById(R.id.imageButton_fug);
        ImageButton imageButtonhypers = this.findViewById(R.id.imageButton_hypers);
        ImageButton imageButtongachi = this.findViewById(R.id.imageButton_gachi);
        ImageButton imageButtonsoft = this.findViewById(R.id.imageButton_soft);
        ImageButton imageButtonx = this.findViewById(R.id.imageButton_x);
        ImageButton imageButton2nd = this.findViewById(R.id.imageButton_2nd);

        /*
            On Click Listeners that have nested On Completion Listener
            that look for any other soundbytes playing. If there is a soundbyte
            playing then it places it next, it can only store one. If there
            is no other soundbyte playing then it will precede to mount
            the audio to the MediaPlayer and play. This makes it so we
            don't have to have a separate function to remount MediaPlayers.
        */
        imageButton2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_2nd);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_2nd);
                    clint_sound.start();
                }
            }
        });
        imageButtonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_x);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_x);
                    clint_sound.start();
                }
            }
        });
        imageButtonsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_soft);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_soft);
                    clint_sound.start();
                }
            }
        });
        imageButtongachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_gachi);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_gachi);
                    clint_sound.start();
                }
            }
        });
        imageButtonhypers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_hypers);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_hypers);
                    clint_sound.start();
                }
            }
        });
        imageButtonfug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_fug);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_fug);
                    clint_sound.start();
                }
            }
        });
        imageButtonhands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_hands);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_hands);
                    clint_sound.start();
                }
            }
        });
        imageButtonyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_yo);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_yo);
                    clint_sound.start();
                }
            }
        });
        imageButtonlu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_lu);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_lu);
                    clint_sound.start();
                }
            }
        });
        imageButtonw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_w);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_w);
                    clint_sound.start();
                }
            }
        });
        imageButtonhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_hd);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_hd);
                    clint_sound.start();
                }
            }
        });
        imageButtonsuave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_suave);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_suave);
                    clint_sound.start();
                }
            }
        });
        imageButtongood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_good);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_good);
                    clint_sound.start();
                }
            }
        });
        imageButtonthot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_thot);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_thot);
                    clint_sound.start();
                }
            }
        });
        imageButtonrare_peng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_rare_peng);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_rare_peng);
                    clint_sound.start();
                }
            }
        });
        imageButtonnerd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_nerd);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_nerd);
                    clint_sound.start();
                }
            }
        });
        imageButtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_g);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_g);
                    clint_sound.start();
                }
            }
        });
        imageButtoniq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_iq);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_iq);
                    clint_sound.start();
                }
            }
        });
        imageButtonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clint_sound != null && clint_sound.isPlaying()) {
                    clint_sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_re);
                            clint_sound.start();
                        }
                    });
                }
                else {
                    clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_re);
                    clint_sound.start();
                }
            }
        });


    }

    // Function that stops all the current sounds

    public void stopSound(View v) {
        clint_sound = MediaPlayer.create(MainActivity.this, R.raw.clint_2nd);
        clint_sound.stop();
    }
}
