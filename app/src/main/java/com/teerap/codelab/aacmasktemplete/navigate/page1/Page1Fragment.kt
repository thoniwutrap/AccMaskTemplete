package com.teerap.codelab.aacmasktemplete.navigate.page1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.teerap.codelab.aacmasktemplete.R
import kotlinx.android.synthetic.main.fragment_page1.*


class Page1Fragment : Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		return inflater.inflate(R.layout.fragment_page1, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		btnPage1.setOnClickListener {
			findNavController().navigate(Page1FragmentDirections.actionPage1FragmentToPage2Fragment("fdsf"))
		}
	}

	companion object {
		@JvmStatic
		fun newInstance(): Page1Fragment {
			return Page1Fragment()
		}
	}


}
