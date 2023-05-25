package com.example.hellowordsem9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hellowordsem9.Adapters.AnimeAdapter;
import com.example.hellowordsem9.models.Anime;
import com.example.hellowordsem9.models.Contacto;

import java.util.ArrayList;
import java.util.List;

public class AnimeActivity extends AppCompatActivity {

    List<Anime> animes = new ArrayList<Anime>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        cargarAnimes();

        AnimeAdapter adapter = new AnimeAdapter(this.animes);

        RecyclerView rvAnimes =  findViewById(R.id.rv_animes);
        rvAnimes.setLayoutManager(new LinearLayoutManager(this));
        rvAnimes.setAdapter(adapter);

    }

    public void cargarAnimes() {
        animes.add(new Anime(
                "Zetsuen No Tempest",
                "What would you ask a grave, which can never reply? What do you pray for? Saying anything after someone\\'s death is far too late.,",
                "https://estudiodemanga.files.wordpress.com/2017/02/characters.png?w=546&h=635",
                true
        ));
        animes.add(new Anime(
                "Kimi ni Todoke",
                "Blaming others isn\\'t going to resolve anything. There\\'ll be a lot of things that are injust throughout your life. You will have to stand up by yourself.",
                "https://rincondeanimes.files.wordpress.com/2013/08/kiminitodoke.jpg?w=610",
                true
        ));
        animes.add(new Anime(
                "MAGI: The Labyrinth Of Magic",
                "If you follow your rage into battle, I have a feeling that terrible things can happen.",
                "https://static.wikia.nocookie.net/magi/images/c/c6/TV_Anime_Magi_The_Labyrinth_of_Magic_Perfect_Fan_Book.png/revision/latest?cb=20130619210745",
                false
        ));
        animes.add(new Anime(
                "NG Knight Ramune & 40",
                "Hey! Don\\'t you know the rules!? When heroes transform, ride in their machine, or stand in their main pose, no one should attack them!",
                "https://pics.filmaffinity.com/NG_Knight_Ramune_amp_40_EX_Miniserie_de_TV-215938927-large.jpg",
                true
        ));
        animes.add(new Anime(
                "Jinrui wa Suitai Shimashita",
                "Hide the truth. Manipulate information. Use intimidation.",
                "https://www.baka-tsuki.org/project/images/7/7c/Jintai-Volume1-cover.jpg",
                false
        ));
    }
}