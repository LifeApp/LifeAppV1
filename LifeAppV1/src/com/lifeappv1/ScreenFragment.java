package com.lifeappv1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ScreenFragment extends Fragment 
{
final static String ARG_POSITION = "position";
int mCurrentPosition = -1;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, 
    Bundle savedInstanceState) {

    // If activity recreated (such as from screen rotate), restore
    // the previous article selection set by onSaveInstanceState().
    // This is primarily necessary when in the two-pane layout.
    if (savedInstanceState != null) {
        mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
    }

    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.activity_scripts_main_menu, container, false);
}

@Override
public void onStart() {
    super.onStart();

    // During startup, check if there are arguments passed to the fragment.
    // onStart is a good place to do this because the layout has already been
    // applied to the fragment at this point so we can safely call the method
    // below that sets the article text.
    Bundle args = getArguments();
    /*if (args != null) {
        // Set article based on argument passed in
        updateScreenView(args.getInt(ARG_POSITION));
    } else if (mCurrentPosition != -1) {
        // Set article based on saved instance state defined during onCreateView
        updateScreenView(mCurrentPosition);
    }
    */
}

//public void updateScreenView(int position) {
    //TextView article = (TextView) getActivity().findViewById(R.id.article);
    //article.setText(Ipsum.Articles[position]);
    
//    FrameLayout screen = (FrameLayout) getActivity().findViewById(R.id.mainContent);
//    screen.setLayoutParams(params);
//    mCurrentPosition = position;
//}

@Override
public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

    // Save the current article selection in case we need to recreate the fragment
    outState.putInt(ARG_POSITION, mCurrentPosition);
}
}