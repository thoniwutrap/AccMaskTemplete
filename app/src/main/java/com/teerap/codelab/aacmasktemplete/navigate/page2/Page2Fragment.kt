package com.teerap.codelab.aacmasktemplete.navigate.page2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

import com.teerap.codelab.aacmasktemplete.R
import kotlinx.android.synthetic.main.fragment_page2.*


class Page2Fragment : Fragment() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		arguments?.let {
			val user = Page2FragmentArgs.fromBundle(it).user
			Toast.makeText(context, user, Toast.LENGTH_LONG).show()
		}
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle?): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_page2, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		btnBack.setOnClickListener {
			findNavController().navigateUp()
		}
	}

	companion object {
		@JvmStatic
		fun newInstance(user: String): Page2Fragment {
			return Page2Fragment().apply {
				arguments = Page2FragmentArgs(user).toBundle()
			}
		}
	}
}
