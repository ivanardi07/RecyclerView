package id.ac.polinema.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.ExcerciseAdapter;
import id.ac.polinema.recyclerview.models.BreakingNews;

public class ExcerciseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);

        RecyclerView newsView = findViewById(R.id.rv_teams);

        List<BreakingNews> news = new ArrayList<>();
        news.add(new BreakingNews("A City Living Under the Shadow", "RBC News", "https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png"));
        news.add(new BreakingNews("One Problem for Democratic Leaders", "NY Times", "https://i0.wp.com/equator.co.id/wp-content/uploads/2018/09/nytimes-logo-png-the-new-york-times-international-weekly-brands-of-the-world-1320.png?fit=800%2C800&ssl=1"));
        news.add(new BreakingNews("The Golden Secret to Better Breakfast", "BBC World", "https://toppng.com/public/uploads/preview/bbc-news-logo-png-bbc-world-channel-logo-11563049882jqyf96g6u7.png"));
        news.add(new BreakingNews("How to Plan Your First Ski Vacation", "NBC Nightly", "https://upload.wikimedia.org/wikipedia/commons/9/9f/NBC_News_2013_logo.png"));
        news.add(new BreakingNews("How Social Isolaton is Killing Us", "RBC News", "https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png"));
        news.add(new BreakingNews("Use Labels to Sort Messages in Facebook", "BBC World", "https://toppng.com/public/uploads/preview/bbc-news-logo-png-bbc-world-channel-logo-11563049882jqyf96g6u7.png"));

        ExcerciseAdapter adapter = new ExcerciseAdapter(this, news);
        newsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        newsView.setLayoutManager(layoutManager);

    }
}
