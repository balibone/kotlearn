package edu.is3261.kotlearn.fragments.NewsFeed

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import edu.is3261.kotlearn.R
import edu.is3261.kotlearn.feed.RedditFeed

class NewsFeedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_news_feed, container, false)

        // Lookup the swipe refresh container view
        val swipeContainer = view.findViewById<SwipeRefreshLayout>(R.id.news_swipe_refresh)

        Toast.makeText(context,getString(R.string.social_feed_placeholder), Toast.LENGTH_SHORT).show()

        // populate the feed by 1) downloading data from reddit and 2) populating swipeContainer
        // pass in context for toasting errors
//        RedditFeed(this.activity!!.applicationContext, view).execute()
        //TODO: create twitter feed

        // Setup refresh listener which triggers new data loading
        swipeContainer.setOnRefreshListener {
            Toast.makeText(context,getString(R.string.social_feed_placeholder), Toast.LENGTH_SHORT).show()
            // This method performs the actual data-refresh operation.
//            RedditFeed(this.activity!!.applicationContext, view).execute()
            //TODO: replace with twitter feed
        }

        return view
    }
}