package com.thedhobighat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import com.airbnb.paris.extensions.style
import com.google.gson.Gson

class FragTrackYourOrder : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.frag_track_your_order, container, false)

        val status = Gson().fromJson(arguments?.getString("order", "NULL"), GetOrderResponsePayloadItemStatus::class.java)

        if (status.accepted.state)
            view.findViewById<ConstraintLayout>(R.id.bool_accepted).setBackgroundResource(R.drawable.round_all_around_but_red)

        if (status.picked_up.state)
            view.findViewById<ConstraintLayout>(R.id.bool_pickedup).setBackgroundResource(R.drawable.round_all_around_but_red)

        if (status.processing.state)
            view.findViewById<ConstraintLayout>(R.id.bool_onprocess).setBackgroundResource(R.drawable.round_all_around_but_red)

        if (status.delivered.state)
            view.findViewById<ConstraintLayout>(R.id.bool_delivered).setBackgroundResource(R.drawable.round_all_around_but_red)

        return view
    }
}