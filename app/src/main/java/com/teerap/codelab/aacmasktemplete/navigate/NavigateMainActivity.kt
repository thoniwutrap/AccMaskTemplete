package com.teerap.codelab.aacmasktemplete.navigate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.teerap.codelab.aacmasktemplete.R

class NavigateMainActivity : AppCompatActivity() {

	lateinit var navController : NavController

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_navigate_main)

		if(savedInstanceState == null){
			val hostFragment = NavHostFragment.create(R.navigation.testnavigate)
			supportFragmentManager.beginTransaction()
					.replace(R.id.container,hostFragment)
					.setPrimaryNavigationFragment(hostFragment)
					.commitNow()

			navController = hostFragment.navController
		}

	}
}
