package com.navigationissue.drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.navigationissue.R
import kotlinx.android.synthetic.main.fragment_main.*

class FifthFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvTitle.setText(R.string.title_fifth)

        tvTitle.setOnClickListener {
            findNavController().navigate(R.id.action_fifth_to_sixth)
        }
    }
}
 