package training.fpt.nhutlv.lvnstore.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import training.fpt.nhutlv.lvnstore.R;


/**
 * Created by NhutDu on 18/12/2016.
 */

public class AboutFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    public static Fragment newInstance(){
        Fragment fragment = new AboutFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        WebView webView = (WebView) view.findViewById(R.id.web_view_about);
        WebSettings webSettings = webView.getSettings();
        webSettings.setDisplayZoomControls(true);
        webView.loadUrl("https://support.google.com/googleplay");
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        if(menu.findItem(R.id.list_menu)!=null)
            menu.findItem(R.id.list_menu).setVisible(false);

        menu.findItem(R.id.drop_down).setVisible(false);
        menu.findItem(R.id.about).setVisible(false);
        if(menu.findItem(R.id.drop_up)!=null)
            menu.findItem(R.id.drop_up).setVisible(false);
        if(menu.findItem(R.id.gird_menu)!=null)
            menu.findItem(R.id.gird_menu).setVisible(false);
    }
}
