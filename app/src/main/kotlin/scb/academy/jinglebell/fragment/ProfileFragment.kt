package scb.academy.jinglebell.fragment

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.WelcomeActivity

class ProfileFragment : Fragment() {

    @Suppress("UNREACHABLE_CODE")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)

        nameEditText.setOnEditorActionListener({ v, actionId, event ->
            var handled = false
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val intent = Intent(context, WelcomeActivity::class.java)
                intent.putExtra("nickname", nameEditText.text.toString())
                startActivity(intent)

                handled = true
            }
            handled
        })
    }


}
