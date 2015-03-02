package awesome.com.awesome;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.gms.ads.*;

import java.util.ArrayList;
import java.util.List;


public class AwesomeActivity extends ActionBarActivity {

    private List<Drawable> images = new ArrayList<>();
    private static final int IMAGE_COUNT = 14;
    private static int previousIndex = 0;
    private static int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awesome);

        populateImageArray();

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(images.get(generateRandomIndexWithoutRepetition()));

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void populateImageArray() {
        images.add(getResources().getDrawable(R.drawable.ya));
        images.add(getResources().getDrawable(R.drawable.ya2));
        images.add(getResources().getDrawable(R.drawable.ya3));
        images.add(getResources().getDrawable(R.drawable.ya4));
        images.add(getResources().getDrawable(R.drawable.ya5));
        images.add(getResources().getDrawable(R.drawable.ya6));
        images.add(getResources().getDrawable(R.drawable.ya7));
        images.add(getResources().getDrawable(R.drawable.ya8));
        images.add(getResources().getDrawable(R.drawable.ya9));
        images.add(getResources().getDrawable(R.drawable.ya10));
        images.add(getResources().getDrawable(R.drawable.ya11));
        images.add(getResources().getDrawable(R.drawable.ya12));
        images.add(getResources().getDrawable(R.drawable.ya13));
        images.add(getResources().getDrawable(R.drawable.ya14));
        images.add(getResources().getDrawable(R.drawable.ya15));
    }

    private int generateRandomIndexWithoutRepetition() {
        while (currentIndex == previousIndex) {
            currentIndex = generateRandomWithinRange(0, IMAGE_COUNT);
        }
        previousIndex = currentIndex;
        return currentIndex;
    }

    private int generateRandomWithinRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
